package demo.web;

import org.springframework.stereotype.Component;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  15:47 2018/6/24.
 */
@Component
public class MyHystrixClientFallback implements HelloServiceFeignClient {
    @Override
    public String getHelloString() {
        return "what's the fuck?";
    }
}
