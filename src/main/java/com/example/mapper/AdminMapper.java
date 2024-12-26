package com.example.mapper;

import com.example.Common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    List<User> selectAllUser();

    // 超级管理员删除用户
    int deleteUser(Integer id);




}
