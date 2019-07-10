package com.zfm.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author zfm
 * @Description TODO
 * @date 2019/7/10
 */
@SpringBootApplication
public class NacosDubboServiceApplication {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NacosDubboServiceApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }
}
