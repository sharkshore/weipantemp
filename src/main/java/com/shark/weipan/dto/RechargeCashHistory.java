package com.shark.weipan.dto;

import java.util.Date;

public class RechargeCashHistory {
    private String id;

    private Integer userId;

    private Integer money;

    private Integer operationType;

    private Integer outType;

    private Integer extraMoney;

    private Date createTime;

    private String channel;

    private Integer result;

    private Integer rechargeApproveId;

    public RechargeCashHistory(String id, Integer userId, Integer money, Integer operationType, Integer outType, Integer extraMoney, Date createTime, String channel, Integer result, Integer rechargeApproveId) {
        this.id = id;
        this.userId = userId;
        this.money = money;
        this.operationType = operationType;
        this.outType = outType;
        this.extraMoney = extraMoney;
        this.createTime = createTime;
        this.channel = channel;
        this.result = result;
        this.rechargeApproveId = rechargeApproveId;
    }

    public RechargeCashHistory() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getOutType() {
        return outType;
    }

    public void setOutType(Integer outType) {
        this.outType = outType;
    }

    public Integer getExtraMoney() {
        return extraMoney;
    }

    public void setExtraMoney(Integer extraMoney) {
        this.extraMoney = extraMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getRechargeApproveId() {
        return rechargeApproveId;
    }

    public void setRechargeApproveId(Integer rechargeApproveId) {
        this.rechargeApproveId = rechargeApproveId;
    }
}