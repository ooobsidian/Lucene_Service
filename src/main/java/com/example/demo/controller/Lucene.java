package com.example.demo.controller;

/*
 * @program: lucene
 * @description:
 * @author: obsidian
 * @create: 2019-05-13 19:52
 */

import com.example.demo.dao.NewsMapper;
import com.example.demo.model.entity.News;
import com.example.demo.model.entity.NewsExample;
import com.example.demo.model.ov.LuceneResult;
import com.example.demo.model.ov.Result;
import com.example.demo.tools.ResultTool;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.web.bind.annotation.*;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/search")
public class Lucene {
    private static final String driverClassName = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String password = "root";
    private static final Version version = Version.LUCENE_47;
    private static final String PATH = "/Users/obsidian/source/lucene_test/src/index";
    private Directory directory;
    private DirectoryReader directoryReader = null;
    private IndexWriter indexWriter = null;
    private IKAnalyzer ikAnalyzer = null;
    private Connection connection;
//    @Resource
//    private NewsMapper newsMapper;

    public Lucene() throws IOException {
        directory = FSDirectory.open(new File(PATH));
    }

    //    分析器
    private IndexSearcher getSearcher() {
        try {
            if (directoryReader == null) {
                directoryReader = DirectoryReader.open(directory);
            } else {
                DirectoryReader tr = DirectoryReader.openIfChanged(directoryReader);
                if (tr != null) {
                    directoryReader.close();
                    directoryReader = tr;
                }
            }
            return new IndexSearcher(directoryReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //    连接数据库
    private Connection getConnection() {
        if (this.connection == null) {
            try {
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    //    创建索引
    private void createIndex() {
        Connection connection = getConnection();
        ResultSet resultSet = null;
        PreparedStatement pst = null;
        if (connection == null) {
            System.out.println("数据库连接失败");
        }
        String sql = "select * from tbl_news";
        try {
            assert connection != null;
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            IndexWriterConfig iwc = new IndexWriterConfig(version, getAnalyzer());
            iwc.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
            indexWriter = new IndexWriter(directory, iwc);
            while (resultSet.next()) {
                String title = resultSet.getString(7);
                String newsurl = resultSet.getString(8);
                String content = resultSet.getString(15);
                Date create_time = resultSet.getDate(17);
                Document doc = new Document();
                doc.add(new TextField("news_title", title + "", Field.Store.YES));
                doc.add(new TextField("news_url", newsurl + "", Field.Store.YES));
                doc.add(new TextField("news_content", content + "", Field.Store.YES));
                doc.add(new TextField("news_create_time", create_time + "", Field.Store.YES));
                indexWriter.addDocument(doc);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (indexWriter != null)
                    indexWriter.close();
                assert resultSet != null;
                resultSet.close();
                pst.close();
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    //    检索
    private List<LuceneResult> searchByTerm(String keyword, int num) {
        long startTime = System.currentTimeMillis();    //获取开始时间
        IndexSearcher indexSearcher = getSearcher();
        IKAnalyzer analyzer = getAnalyzer();
        //使用QueryParser查询分析器构造Query对象
        QueryParser queryParser = new QueryParser(version, "news_content", analyzer);
        queryParser.setDefaultOperator(QueryParser.AND_OPERATOR);
        try {
            Query query = queryParser.parse(keyword);
            ScoreDoc[] hits;
            List<LuceneResult> result = new LinkedList<>();
            assert indexSearcher != null;
            hits = indexSearcher.search(query, num).scoreDocs;
            long endTime = System.currentTimeMillis();
            System.out.println("搜索到以下内容（共" + num + "条，耗时" + (endTime - startTime) + "ms）：");
            for (int i = 0; i < hits.length; i++) { //TODO
                LuceneResult res = new LuceneResult();
                Document doc = indexSearcher.doc(hits[i].doc);
                System.out.println(doc.get("news_title") + " " + doc.get("news_content") + " " + doc.get("news_url") + " " + doc.get("news_create_time"));
                res.setTitle(doc.get("news_title"));
                res.setContent(doc.get("news_content"));
                res.setUrl(doc.get("news_url"));
                res.setCreate_time(doc.get("news_create_time"));
                result.add(res);
            }
            return result;
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private IKAnalyzer getAnalyzer() {
        if (ikAnalyzer == null) {
            return new IKAnalyzer();
        } else {
            return ikAnalyzer;
        }
    }

    @GetMapping("")
    public Result lucene(@RequestParam("key") String key,
                         @RequestParam("number") Integer number) throws IOException {
        NewsExample newsExample = new NewsExample();
        Lucene ld = new Lucene();
        File file = new File(PATH);
        File[] listFiles = file.listFiles();
        assert listFiles != null;
        if (listFiles.length == 0) {
            ld.createIndex();
        }
        List<LuceneResult> res = ld.searchByTerm(key, number);
//        LuceneResult result = new LuceneResult();
//        assert res != null;
//        for (int i = 0; i < res.size(); i++) {
//            result.setTitle(res[i].getTitle());
//            result.setContent(i.getContent());
//            result.setUrl(i.getUrl());
//            result.setCreate_time(i.getCreate_time());
//        }
        return ResultTool.success(res);
    }

}
