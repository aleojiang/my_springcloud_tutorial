package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  00:41 2018/6/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignClientApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApp.class, args);
    }
    
}
