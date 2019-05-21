package com.example.demo.model.ov;

/**
 * @program: lucene_sevice
 * @description:
 * @author: obsidian
 * @create: 2019-05-20 22:52
 */
public class LuceneResult {

    /**
     * title : xxx
     * content : xxx
     * url : xxx
     * create_time : xxx
     */

    private String title;
    private String content;
    private String url;
    private String create_time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
