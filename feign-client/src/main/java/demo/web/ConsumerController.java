package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  00:45 2018/6/24.
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloServiceClient helloServiceClient;
    
    @Value("${domain.data.v1}")
    private String value;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String aaa() {
        String a = helloServiceClient.getHelloString();
        return a+" fuck "+this.value;
    }
    
}
