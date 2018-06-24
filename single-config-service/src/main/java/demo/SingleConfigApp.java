package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  14:03 2018/6/24.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SingleConfigApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SingleConfigApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
