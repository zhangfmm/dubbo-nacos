package com.zfm.service.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.zfm.api.user.LoginService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zfm
 * @Description TODO
 * @date 2019/7/10
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public String hello(String name) {
        System.out.println("env" + env);
        return "hello, " + name;
    }
}
