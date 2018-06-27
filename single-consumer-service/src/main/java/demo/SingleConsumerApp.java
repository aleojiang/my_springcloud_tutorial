package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  16:03 2018/6/24.
 */
@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
public class SingleConsumerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SingleConsumerApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
    
}
