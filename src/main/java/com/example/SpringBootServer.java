package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServer.class, args);   // 自动创建ioc容器, 并启动tomcat服务器
    }
}
