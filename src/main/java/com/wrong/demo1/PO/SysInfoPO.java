package com.wrong.demo1.PO;

public class SysInfoPO {
    private String normid;

    private String clazid;

    private String clazComment;

    private String norm1;

    private String comment1;

    private String norm2;

    private String comment2;

    private String norm3;

    private String comment3;

    public String getNormid() {
        return normid;
    }

    public void setNormid(String normid) {
        this.normid = normid == null ? null : normid.trim();
    }

    public String getClazid() {
        return clazid;
    }

    public void setClazid(String clazid) {
        this.clazid = clazid == null ? null : clazid.trim();
    }

    public String getClazComment() {
        return clazComment;
    }

    public void setClazComment(String clazComment) {
        this.clazComment = clazComment == null ? null : clazComment.trim();
    }

    public String getNorm1() {
        return norm1;
    }

    public void setNorm1(String norm1) {
        this.norm1 = norm1 == null ? null : norm1.trim();
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1 == null ? null : comment1.trim();
    }

    public String getNorm2() {
        return norm2;
    }

    public void setNorm2(String norm2) {
        this.norm2 = norm2 == null ? null : norm2.trim();
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2 == null ? null : comment2.trim();
    }

    public String getNorm3() {
        return norm3;
    }

    public void setNorm3(String norm3) {
        this.norm3 = norm3 == null ? null : norm3.trim();
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3 == null ? null : comment3.trim();
    }
}