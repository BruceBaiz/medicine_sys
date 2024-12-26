package com.example.Common.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class WarehouseDTO {
    private Integer id;
    private String warehouseName;
    private String warehouseCode;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
