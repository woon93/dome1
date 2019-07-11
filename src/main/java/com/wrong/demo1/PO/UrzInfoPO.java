package com.wrong.demo1.PO;

public class UrzInfoPO {
    private String urzid;

    private Integer permissions;

    private String accout;

    private String pazword;

    private String sex;

    private Integer age;

    private String department;

    private String position;

    private String party;

    private String hometown;

    private String mobile;

    private String email;

    private String address;

    private String signature;

    private String portraiturl;

    public String getUrzid() {
        return urzid;
    }

    public void setUrzid(String urzid) {
        this.urzid = urzid == null ? null : urzid.trim();
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout == null ? null : accout.trim();
    }

    public String getPazword() {
        return pazword;
    }

    public void setPazword(String pazword) {
        this.pazword = pazword == null ? null : pazword.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party == null ? null : party.trim();
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getPortraiturl() {
        return portraiturl;
    }

    public void setPortraiturl(String portraiturl) {
        this.portraiturl = portraiturl == null ? null : portraiturl.trim();
    }
}