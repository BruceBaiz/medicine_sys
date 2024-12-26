package com.example.Common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Warehouse {
    private Integer id;
    private String warehouseName;
    private String warehouseCode;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
