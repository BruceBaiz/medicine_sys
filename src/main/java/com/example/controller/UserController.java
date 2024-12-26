package com.example.controller;

import com.example.Common.Context.BaseContext;
import com.example.Common.DTO.UserLoginDTO;
import com.example.Common.DTO.UserRegisterDTO;
import com.example.Common.DTO.UserRetrieveDTO;
import com.example.Common.Properties.JwtProperties;
import com.example.Common.VO.UserLoginVO;
import com.example.Common.contstant.JwtClaimsConstant;
import com.example.Common.pojo.User;
import com.example.Common.result.Result;
import com.example.service.impl.UserServiceImpl;
import com.example.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserServiceImpl userService;
    public JwtUtil jwtUtil;

    @Autowired
    public JwtProperties jwtProperties;

    @GetMapping("/login")
    public Result<UserLoginVO> Userlogin(UserLoginDTO userLoginDTO){
         User user= userService.login(userLoginDTO);
         BaseContext.setCurrentId((long) user.getId());
         Map<String, Object> claims = new HashMap<>();
         claims.put(JwtClaimsConstant.USER_ID,user.getId());
         String token = JwtUtil.createJWT(jwtProperties.getUserSecretKey(), jwtProperties.getUserTtl(), claims);
         UserLoginVO userLoginVO = new UserLoginVO();
         userLoginVO.setUserid((long) user.getId());
         userLoginVO.setToken(token);
         return Result.success(userLoginVO);
     }

    @GetMapping("/register")
        public Result UserRegister(UserRegisterDTO userRegisterDTO){
        userService.register(userRegisterDTO);
        return Result.success();
    }

    @GetMapping("/logout")
    public Result Userlogout(){
        //TODO 实现登出功能 使用jwt黑名单 并定时清理
        return Result.success();
    }

    @GetMapping("/retrieve")
    public void UserRetrieve(UserRetrieveDTO userRetrieveDTO){

    }
}
