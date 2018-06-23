package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  23:11 2018/6/23.
 */
@RestController
public class HelloServiceController {
    
    @Value("${domain.data.v1}")
    private String value;
    
    @RequestMapping(value = "/hello")
    public String hello() {
        return this.value;
    }
    
}
