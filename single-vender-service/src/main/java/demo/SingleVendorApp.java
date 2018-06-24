package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  14:29 2018/6/24.
 */
@SpringBootApplication
@EnableEurekaClient
public class SingleVendorApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SingleVendorApp.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
