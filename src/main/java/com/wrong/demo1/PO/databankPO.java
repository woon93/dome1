package com.wrong.demo1.PO;

import java.util.Date;

public class databankPO {
    private String resourceurl;

    private String category;

    private Integer limit;

    private String createUrzid;

    private Date createTime;

    private String updateUrzid;

    private Date updateTime;

    private String delflag;

    private String detail;

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl == null ? null : resourceurl.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getCreateUrzid() {
        return createUrzid;
    }

    public void setCreateUrzid(String createUrzid) {
        this.createUrzid = createUrzid == null ? null : createUrzid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUrzid() {
        return updateUrzid;
    }

    public void setUpdateUrzid(String updateUrzid) {
        this.updateUrzid = updateUrzid == null ? null : updateUrzid.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}