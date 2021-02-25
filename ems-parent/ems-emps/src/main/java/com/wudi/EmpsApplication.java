package com.wudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Dillon Wu
 * @Description: 雇佣服务模块
 * @date 2021/2/25 15:52
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class EmpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpsApplication.class, args);
    }
}
