package com.shark.weipan.dto;

public class SysConfig {
    private Integer sysId;

    private String paramName;

    private Integer paramValue;

    public SysConfig(Integer sysId, String paramName, Integer paramValue) {
        this.sysId = sysId;
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    public SysConfig() {
        super();
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public Integer getParamValue() {
        return paramValue;
    }

    public void setParamValue(Integer paramValue) {
        this.paramValue = paramValue;
    }
}