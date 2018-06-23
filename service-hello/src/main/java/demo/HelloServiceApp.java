package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  21:18 2018/6/23.
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }
}
