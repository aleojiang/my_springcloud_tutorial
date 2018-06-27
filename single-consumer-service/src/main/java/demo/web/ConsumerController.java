package demo.web;

import demo.web.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  16:05 2018/6/24.
 */
@RestController
public class ConsumerController {
    
    @Value("${domain.data.v1}")
    private String value;
    
    @Autowired
    @Qualifier("vendor1")
    MyFeignClient myFeignClient;
    
    @RequestMapping("/get")
    public String get() {
        return value + " " + myFeignClient.getMyData();
    }
    
}
