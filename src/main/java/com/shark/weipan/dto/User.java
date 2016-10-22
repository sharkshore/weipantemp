package com.shark.weipan.dto;

import java.util.Date;

public class User {
    private Integer id;

    private String loginName;

    private String loginPwd;

    private String weixinName;

    private String nickName;

    private String mobile;

    private String email;

    private Integer sex;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer managerId;

    private Integer parentId;

    private String description;

    private Integer canTrade;

    private Integer canDraw;

    private Integer commissionPercent;

    private Integer commisionBalance;

    private Integer gameBalance;

    private Integer gameTicket;

    private byte[] headThumb;

    public User(Integer id, String loginName, String loginPwd, String weixinName, String nickName, String mobile, String email, Integer sex, Integer status, Date createTime, Date updateTime, Integer managerId, Integer parentId, String description, Integer canTrade, Integer canDraw, Integer commissionPercent, Integer commisionBalance, Integer gameBalance, Integer gameTicket, byte[] headThumb) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.weixinName = weixinName;
        this.nickName = nickName;
        this.mobile = mobile;
        this.email = email;
        this.sex = sex;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.managerId = managerId;
        this.parentId = parentId;
        this.description = description;
        this.canTrade = canTrade;
        this.canDraw = canDraw;
        this.commissionPercent = commissionPercent;
        this.commisionBalance = commisionBalance;
        this.gameBalance = gameBalance;
        this.gameTicket = gameTicket;
        this.headThumb = headThumb;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getWeixinName() {
        return weixinName;
    }

    public void setWeixinName(String weixinName) {
        this.weixinName = weixinName == null ? null : weixinName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Integer canTrade) {
        this.canTrade = canTrade;
    }

    public Integer getCanDraw() {
        return canDraw;
    }

    public void setCanDraw(Integer canDraw) {
        this.canDraw = canDraw;
    }

    public Integer getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(Integer commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public Integer getCommisionBalance() {
        return commisionBalance;
    }

    public void setCommisionBalance(Integer commisionBalance) {
        this.commisionBalance = commisionBalance;
    }

    public Integer getGameBalance() {
        return gameBalance;
    }

    public void setGameBalance(Integer gameBalance) {
        this.gameBalance = gameBalance;
    }

    public Integer getGameTicket() {
        return gameTicket;
    }

    public void setGameTicket(Integer gameTicket) {
        this.gameTicket = gameTicket;
    }

    public byte[] getHeadThumb() {
        return headThumb;
    }

    public void setHeadThumb(byte[] headThumb) {
        this.headThumb = headThumb;
    }
}