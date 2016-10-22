package com.shark.weipan.dto;

import java.util.Date;

public class Manager {
    private Integer managerId;

    private String loginName;

    private String loginPwd;

    private String mobile;

    private String email;

    private Integer sex;

    private String address;

    private Date createTime;

    private String description;

    private String agentName;

    private String memberName;

    private Integer manageType;

    private Integer parentId;

    private byte[] headThumb;

    public Manager(Integer managerId, String loginName, String loginPwd, String mobile, String email, Integer sex, String address, Date createTime, String description, String agentName, String memberName, Integer manageType, Integer parentId, byte[] headThumb) {
        this.managerId = managerId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.mobile = mobile;
        this.email = email;
        this.sex = sex;
        this.address = address;
        this.createTime = createTime;
        this.description = description;
        this.agentName = agentName;
        this.memberName = memberName;
        this.manageType = manageType;
        this.parentId = parentId;
        this.headThumb = headThumb;
    }

    public Manager() {
        super();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Integer getManageType() {
        return manageType;
    }

    public void setManageType(Integer manageType) {
        this.manageType = manageType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public byte[] getHeadThumb() {
        return headThumb;
    }

    public void setHeadThumb(byte[] headThumb) {
        this.headThumb = headThumb;
    }
}