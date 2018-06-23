package demo.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  13:48 2018/6/23.
 */
@RestController
public class HelloResource {
    @Value("${domain.data.v1}")
    private String config;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity sayHello() {
        return new ResponseEntity(this.config, HttpStatus.OK);
    }
    
}
