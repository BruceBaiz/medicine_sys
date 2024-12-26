package com.example.Common.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterDTO implements Serializable {
    public String username;
    public String password;
    public String Email;
}
