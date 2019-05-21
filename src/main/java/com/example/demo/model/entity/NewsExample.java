package com.example.demo.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPreContentIsNull() {
            addCriterion("pre_content is null");
            return (Criteria) this;
        }

        public Criteria andPreContentIsNotNull() {
            addCriterion("pre_content is not null");
            return (Criteria) this;
        }

        public Criteria andPreContentEqualTo(String value) {
            addCriterion("pre_content =", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentNotEqualTo(String value) {
            addCriterion("pre_content <>", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentGreaterThan(String value) {
            addCriterion("pre_content >", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentGreaterThanOrEqualTo(String value) {
            addCriterion("pre_content >=", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentLessThan(String value) {
            addCriterion("pre_content <", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentLessThanOrEqualTo(String value) {
            addCriterion("pre_content <=", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentLike(String value) {
            addCriterion("pre_content like", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentNotLike(String value) {
            addCriterion("pre_content not like", value, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentIn(List<String> values) {
            addCriterion("pre_content in", values, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentNotIn(List<String> values) {
            addCriterion("pre_content not in", values, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentBetween(String value1, String value2) {
            addCriterion("pre_content between", value1, value2, "preContent");
            return (Criteria) this;
        }

        public Criteria andPreContentNotBetween(String value1, String value2) {
            addCriterion("pre_content not between", value1, value2, "preContent");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNull() {
            addCriterion("media_type is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNotNull() {
            addCriterion("media_type is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeEqualTo(String value) {
            addCriterion("media_type =", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotEqualTo(String value) {
            addCriterion("media_type <>", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThan(String value) {
            addCriterion("media_type >", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("media_type >=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThan(String value) {
            addCriterion("media_type <", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThanOrEqualTo(String value) {
            addCriterion("media_type <=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLike(String value) {
            addCriterion("media_type like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotLike(String value) {
            addCriterion("media_type not like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIn(List<String> values) {
            addCriterion("media_type in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotIn(List<String> values) {
            addCriterion("media_type not in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeBetween(String value1, String value2) {
            addCriterion("media_type between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotBetween(String value1, String value2) {
            addCriterion("media_type not between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTitleIsNull() {
            addCriterion("media_title is null");
            return (Criteria) this;
        }

        public Criteria andMediaTitleIsNotNull() {
            addCriterion("media_title is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTitleEqualTo(String value) {
            addCriterion("media_title =", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleNotEqualTo(String value) {
            addCriterion("media_title <>", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleGreaterThan(String value) {
            addCriterion("media_title >", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("media_title >=", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleLessThan(String value) {
            addCriterion("media_title <", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleLessThanOrEqualTo(String value) {
            addCriterion("media_title <=", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleLike(String value) {
            addCriterion("media_title like", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleNotLike(String value) {
            addCriterion("media_title not like", value, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleIn(List<String> values) {
            addCriterion("media_title in", values, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleNotIn(List<String> values) {
            addCriterion("media_title not in", values, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleBetween(String value1, String value2) {
            addCriterion("media_title between", value1, value2, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andMediaTitleNotBetween(String value1, String value2) {
            addCriterion("media_title not between", value1, value2, "mediaTitle");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("news_url is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("news_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("news_url =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("news_url <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("news_url >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("news_url >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("news_url <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("news_url <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("news_url like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("news_url not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("news_url in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("news_url not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("news_url between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("news_url not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussNumIsNull() {
            addCriterion("discuss_num is null");
            return (Criteria) this;
        }

        public Criteria andDiscussNumIsNotNull() {
            addCriterion("discuss_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussNumEqualTo(Integer value) {
            addCriterion("discuss_num =", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumNotEqualTo(Integer value) {
            addCriterion("discuss_num <>", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumGreaterThan(Integer value) {
            addCriterion("discuss_num >", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("discuss_num >=", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumLessThan(Integer value) {
            addCriterion("discuss_num <", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumLessThanOrEqualTo(Integer value) {
            addCriterion("discuss_num <=", value, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumIn(List<Integer> values) {
            addCriterion("discuss_num in", values, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumNotIn(List<Integer> values) {
            addCriterion("discuss_num not in", values, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumBetween(Integer value1, Integer value2) {
            addCriterion("discuss_num between", value1, value2, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussNumNotBetween(Integer value1, Integer value2) {
            addCriterion("discuss_num not between", value1, value2, "discussNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumIsNull() {
            addCriterion("discuss_liked_num is null");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumIsNotNull() {
            addCriterion("discuss_liked_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumEqualTo(Integer value) {
            addCriterion("discuss_liked_num =", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumNotEqualTo(Integer value) {
            addCriterion("discuss_liked_num <>", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumGreaterThan(Integer value) {
            addCriterion("discuss_liked_num >", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("discuss_liked_num >=", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumLessThan(Integer value) {
            addCriterion("discuss_liked_num <", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumLessThanOrEqualTo(Integer value) {
            addCriterion("discuss_liked_num <=", value, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumIn(List<Integer> values) {
            addCriterion("discuss_liked_num in", values, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumNotIn(List<Integer> values) {
            addCriterion("discuss_liked_num not in", values, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumBetween(Integer value1, Integer value2) {
            addCriterion("discuss_liked_num between", value1, value2, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andDiscussLikedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("discuss_liked_num not between", value1, value2, "discussLikedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumIsNull() {
            addCriterion("liked_num is null");
            return (Criteria) this;
        }

        public Criteria andLikedNumIsNotNull() {
            addCriterion("liked_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikedNumEqualTo(Integer value) {
            addCriterion("liked_num =", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumNotEqualTo(Integer value) {
            addCriterion("liked_num <>", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumGreaterThan(Integer value) {
            addCriterion("liked_num >", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("liked_num >=", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumLessThan(Integer value) {
            addCriterion("liked_num <", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumLessThanOrEqualTo(Integer value) {
            addCriterion("liked_num <=", value, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumIn(List<Integer> values) {
            addCriterion("liked_num in", values, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumNotIn(List<Integer> values) {
            addCriterion("liked_num not in", values, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumBetween(Integer value1, Integer value2) {
            addCriterion("liked_num between", value1, value2, "likedNum");
            return (Criteria) this;
        }

        public Criteria andLikedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("liked_num not between", value1, value2, "likedNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumIsNull() {
            addCriterion("re_post_num is null");
            return (Criteria) this;
        }

        public Criteria andRePostNumIsNotNull() {
            addCriterion("re_post_num is not null");
            return (Criteria) this;
        }

        public Criteria andRePostNumEqualTo(Integer value) {
            addCriterion("re_post_num =", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumNotEqualTo(Integer value) {
            addCriterion("re_post_num <>", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumGreaterThan(Integer value) {
            addCriterion("re_post_num >", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_post_num >=", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumLessThan(Integer value) {
            addCriterion("re_post_num <", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumLessThanOrEqualTo(Integer value) {
            addCriterion("re_post_num <=", value, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumIn(List<Integer> values) {
            addCriterion("re_post_num in", values, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumNotIn(List<Integer> values) {
            addCriterion("re_post_num not in", values, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumBetween(Integer value1, Integer value2) {
            addCriterion("re_post_num between", value1, value2, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andRePostNumNotBetween(Integer value1, Integer value2) {
            addCriterion("re_post_num not between", value1, value2, "rePostNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumIsNull() {
            addCriterion("views_num is null");
            return (Criteria) this;
        }

        public Criteria andViewsNumIsNotNull() {
            addCriterion("views_num is not null");
            return (Criteria) this;
        }

        public Criteria andViewsNumEqualTo(Integer value) {
            addCriterion("views_num =", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumNotEqualTo(Integer value) {
            addCriterion("views_num <>", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumGreaterThan(Integer value) {
            addCriterion("views_num >", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("views_num >=", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumLessThan(Integer value) {
            addCriterion("views_num <", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumLessThanOrEqualTo(Integer value) {
            addCriterion("views_num <=", value, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumIn(List<Integer> values) {
            addCriterion("views_num in", values, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumNotIn(List<Integer> values) {
            addCriterion("views_num not in", values, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumBetween(Integer value1, Integer value2) {
            addCriterion("views_num between", value1, value2, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andViewsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("views_num not between", value1, value2, "viewsNum");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyIsNull() {
            addCriterion("content_from_scrapy is null");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyIsNotNull() {
            addCriterion("content_from_scrapy is not null");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyEqualTo(String value) {
            addCriterion("content_from_scrapy =", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyNotEqualTo(String value) {
            addCriterion("content_from_scrapy <>", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyGreaterThan(String value) {
            addCriterion("content_from_scrapy >", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyGreaterThanOrEqualTo(String value) {
            addCriterion("content_from_scrapy >=", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyLessThan(String value) {
            addCriterion("content_from_scrapy <", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyLessThanOrEqualTo(String value) {
            addCriterion("content_from_scrapy <=", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyLike(String value) {
            addCriterion("content_from_scrapy like", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyNotLike(String value) {
            addCriterion("content_from_scrapy not like", value, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyIn(List<String> values) {
            addCriterion("content_from_scrapy in", values, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyNotIn(List<String> values) {
            addCriterion("content_from_scrapy not in", values, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyBetween(String value1, String value2) {
            addCriterion("content_from_scrapy between", value1, value2, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andContentFromScrapyNotBetween(String value1, String value2) {
            addCriterion("content_from_scrapy not between", value1, value2, "contentFromScrapy");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeIsNull() {
            addCriterion("discuss_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeIsNotNull() {
            addCriterion("discuss_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeEqualTo(Date value) {
            addCriterion("discuss_update_time =", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeNotEqualTo(Date value) {
            addCriterion("discuss_update_time <>", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeGreaterThan(Date value) {
            addCriterion("discuss_update_time >", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discuss_update_time >=", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeLessThan(Date value) {
            addCriterion("discuss_update_time <", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("discuss_update_time <=", value, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeIn(List<Date> values) {
            addCriterion("discuss_update_time in", values, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeNotIn(List<Date> values) {
            addCriterion("discuss_update_time not in", values, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("discuss_update_time between", value1, value2, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDiscussUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("discuss_update_time not between", value1, value2, "discussUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andExistIsNull() {
            addCriterion("exist is null");
            return (Criteria) this;
        }

        public Criteria andExistIsNotNull() {
            addCriterion("exist is not null");
            return (Criteria) this;
        }

        public Criteria andExistEqualTo(Boolean value) {
            addCriterion("exist =", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotEqualTo(Boolean value) {
            addCriterion("exist <>", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistGreaterThan(Boolean value) {
            addCriterion("exist >", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("exist >=", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistLessThan(Boolean value) {
            addCriterion("exist <", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistLessThanOrEqualTo(Boolean value) {
            addCriterion("exist <=", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistIn(List<Boolean> values) {
            addCriterion("exist in", values, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotIn(List<Boolean> values) {
            addCriterion("exist not in", values, "exist");
            return (Criteria) this;
        }

        public Criteria andExistBetween(Boolean value1, Boolean value2) {
            addCriterion("exist between", value1, value2, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("exist not between", value1, value2, "exist");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}