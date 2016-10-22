package com.shark.weipan.dto;

import java.util.Date;

public class RechargeApprove {
    private Integer id;

    private Integer userId;

    private Integer money;

    private Integer type;

    private Date createTime;

    private Integer status;

    private Date approveTime;

    private String description;

    public RechargeApprove(Integer id, Integer userId, Integer money, Integer type, Date createTime, Integer status, Date approveTime, String description) {
        this.id = id;
        this.userId = userId;
        this.money = money;
        this.type = type;
        this.createTime = createTime;
        this.status = status;
        this.approveTime = approveTime;
        this.description = description;
    }

    public RechargeApprove() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}