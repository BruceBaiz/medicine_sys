package com.example.Common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
//    private Timestamp createTime;
//    private Timestamp updateTime;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;

}


