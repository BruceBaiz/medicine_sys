package com.example.Common.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class DataDTO {

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
