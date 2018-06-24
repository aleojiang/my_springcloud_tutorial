package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  14:16 2018/6/24.
 */
@SpringBootApplication
@EnableEurekaServer
public class SingleEurekaApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SingleEurekaApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
