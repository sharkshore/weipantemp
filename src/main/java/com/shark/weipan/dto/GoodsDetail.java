package com.shark.weipan.dto;

import java.util.Date;

public class GoodsDetail {
    private Integer id;

    private Integer status;

    private String name;

    private Integer goodsId;

    private Integer rate;

    private Date effectBegin;

    private Date effectEnd;

    public GoodsDetail(Integer id, Integer status, String name, Integer goodsId, Integer rate, Date effectBegin, Date effectEnd) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.goodsId = goodsId;
        this.rate = rate;
        this.effectBegin = effectBegin;
        this.effectEnd = effectEnd;
    }

    public GoodsDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getEffectBegin() {
        return effectBegin;
    }

    public void setEffectBegin(Date effectBegin) {
        this.effectBegin = effectBegin;
    }

    public Date getEffectEnd() {
        return effectEnd;
    }

    public void setEffectEnd(Date effectEnd) {
        this.effectEnd = effectEnd;
    }
}