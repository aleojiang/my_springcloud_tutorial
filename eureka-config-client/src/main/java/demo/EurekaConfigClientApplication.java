package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  13:45 2018/6/23.
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApplication.class, args);
    }
}
