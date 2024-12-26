package com.example.service.impl;

import com.example.Common.DTO.UserLoginDTO;
import com.example.Common.DTO.UserRegisterDTO;
import com.example.Common.Exception.AccountExistException;
import com.example.Common.Exception.AccountNotFoundException;
import com.example.Common.pojo.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    public UserMapper userMapper;

    public User login(UserLoginDTO userLoginDTO){
        User user = userMapper.login(userLoginDTO.username);
        if(user!=null){
            return user;
        }
        else{
            throw new AccountNotFoundException("账号不存在") ;
        }
   }

    public void register(UserRegisterDTO userRegisterDTO){
        String username = userRegisterDTO.getUsername();
        if(userMapper.login(username)!=null){
          throw new AccountExistException("账号已经存在");
        }
        userMapper.register(userRegisterDTO);
    }
}
