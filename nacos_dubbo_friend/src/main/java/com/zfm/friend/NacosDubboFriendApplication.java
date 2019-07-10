package com.zfm.friend;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author zfm
 * @Description TODO
 * @date 2019/7/10
 */
@EnableDubbo
@SpringBootApplication
public class NacosDubboFriendApplication {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NacosDubboFriendApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }
}
