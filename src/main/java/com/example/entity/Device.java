package com.example.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Device {
    private Integer id;
    private String deviceName;
    private String deviceCode;
    private Integer warehouseId;
    private Integer tempHighThreshold;
    private Integer tempLowThreshold;
    private Integer HumiHighThreshold;
    private Integer HumiLowThreshold;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;

}
