package com.example.mapper;

import com.example.Common.DTO.UserRegisterDTO;
import com.example.Common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

   // 管理员查询所有用户
   List<User> selectAllUser();

   User login(String username);

   User register(UserRegisterDTO user);
}
