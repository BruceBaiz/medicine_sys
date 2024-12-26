package com.example.Common.Properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user.jwt")
@Data
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String UserSecretKey;

    public String getUserSecretKey() {
        return UserSecretKey;
    }

    public void setUserSecretKey(String userSecretKey) {
        UserSecretKey = userSecretKey;
    }

    public long getUserTtl() {
        return UserTtl;
    }

    public void setUserTtl(long userTtl) {
        UserTtl = userTtl;
    }

    public String getUserTokenName() {
        return UserTokenName;
    }

    public void setUserTokenName(String userTokenName) {
        UserTokenName = userTokenName;
    }

    private long UserTtl;
    private String UserTokenName;

}
