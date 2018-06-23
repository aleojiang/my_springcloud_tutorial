package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  22:05 2018/6/23.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClusterApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterApp.class, args);
    }
}
