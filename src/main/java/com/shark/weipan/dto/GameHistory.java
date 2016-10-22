package com.shark.weipan.dto;

import java.util.Date;

public class GameHistory {
    private String id;

    private Integer userId;

    private Integer goodsDetailId;

    private Integer direction;

    private Date beginTime;

    private Date endTime;

    private Integer beginMoney;

    private Integer endMoney;

    private Integer ticketCost;

    private Integer resultType;

    private Integer resultGetMoney;

    private Integer extraMoney;

    private Date createTime;

    public GameHistory(String id, Integer userId, Integer goodsDetailId, Integer direction, Date beginTime, Date endTime, Integer beginMoney, Integer endMoney, Integer ticketCost, Integer resultType, Integer resultGetMoney, Integer extraMoney, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.goodsDetailId = goodsDetailId;
        this.direction = direction;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.beginMoney = beginMoney;
        this.endMoney = endMoney;
        this.ticketCost = ticketCost;
        this.resultType = resultType;
        this.resultGetMoney = resultGetMoney;
        this.extraMoney = extraMoney;
        this.createTime = createTime;
    }

    public GameHistory() {
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

    public Integer getGoodsDetailId() {
        return goodsDetailId;
    }

    public void setGoodsDetailId(Integer goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBeginMoney() {
        return beginMoney;
    }

    public void setBeginMoney(Integer beginMoney) {
        this.beginMoney = beginMoney;
    }

    public Integer getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(Integer endMoney) {
        this.endMoney = endMoney;
    }

    public Integer getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(Integer ticketCost) {
        this.ticketCost = ticketCost;
    }

    public Integer getResultType() {
        return resultType;
    }

    public void setResultType(Integer resultType) {
        this.resultType = resultType;
    }

    public Integer getResultGetMoney() {
        return resultGetMoney;
    }

    public void setResultGetMoney(Integer resultGetMoney) {
        this.resultGetMoney = resultGetMoney;
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
}