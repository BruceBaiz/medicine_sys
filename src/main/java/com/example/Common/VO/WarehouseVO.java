package com.example.Common.VO;

import lombok.Data;

import java.util.Date;

@Data
public class WarehouseVO {
    private Integer id;
    private String warehouseName;
    private String warehouseCode;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
