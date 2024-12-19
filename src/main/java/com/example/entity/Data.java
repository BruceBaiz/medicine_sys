package com.example.entity;

import java.util.Date;

@lombok.Data
public class Data {
    private Integer id;
    private Integer warehouseId;
    private Integer deviceId;
    private Double tempData;
    private Double humiData;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
