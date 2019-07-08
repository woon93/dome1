package com.wrong.demo1.PO;

public class articlePO {
    private String articleurl;

    private String title;

    private String preview;

    private Integer readership;

    private Integer hits;

    private Integer comments;

    private Integer weight;

    public String getArticleurl() {
        return articleurl;
    }

    public void setArticleurl(String articleurl) {
        this.articleurl = articleurl == null ? null : articleurl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview == null ? null : preview.trim();
    }

    public Integer getReadership() {
        return readership;
    }

    public void setReadership(Integer readership) {
        this.readership = readership;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}