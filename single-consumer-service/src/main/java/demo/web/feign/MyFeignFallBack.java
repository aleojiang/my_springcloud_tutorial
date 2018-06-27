package demo.web.feign;

import org.springframework.stereotype.Component;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  16:06 2018/6/24.
 */
@Component
public class MyFeignFallBack implements MyFeignClient {
    @Override
    public String getMyData() {
        return "What's the fuck?";
    }
}
