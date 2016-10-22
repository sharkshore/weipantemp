package com.shark.weipan.dto;

import java.util.Date;

public class AgentApprove {
    private Integer approveId;

    private Integer userId;

    private String mobile;

    private Date createTime;

    private Integer status;

    public AgentApprove(Integer approveId, Integer userId, String mobile, Date createTime, Integer status) {
        this.approveId = approveId;
        this.userId = userId;
        this.mobile = mobile;
        this.createTime = createTime;
        this.status = status;
    }

    public AgentApprove() {
        super();
    }

    public Integer getApproveId() {
        return approveId;
    }

    public void setApproveId(Integer approveId) {
        this.approveId = approveId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
}