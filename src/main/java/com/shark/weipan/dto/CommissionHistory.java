package com.shark.weipan.dto;

import java.util.Date;

public class CommissionHistory {
    private String id;

    private Integer accountType;

    private Integer accountId;

    private String gameHistoryId;

    private Integer money;

    private Integer percent;

    private Date createTime;

    public CommissionHistory(String id, Integer accountType, Integer accountId, String gameHistoryId, Integer money, Integer percent, Date createTime) {
        this.id = id;
        this.accountType = accountType;
        this.accountId = accountId;
        this.gameHistoryId = gameHistoryId;
        this.money = money;
        this.percent = percent;
        this.createTime = createTime;
    }

    public CommissionHistory() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getGameHistoryId() {
        return gameHistoryId;
    }

    public void setGameHistoryId(String gameHistoryId) {
        this.gameHistoryId = gameHistoryId == null ? null : gameHistoryId.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}