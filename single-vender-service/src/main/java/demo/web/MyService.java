package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  14:41 2018/6/24.
 */
@RestController
public class MyService {
    @Value("${domain.test.stringValue}")
    private String vString;
    @Value("${domain.test.doubleValue}")
    private Double vDouble;
    @Value("${domain.test.intValue}")
    private Integer vInteger;
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<MyData> get() {
        return new ResponseEntity<>(new MyData(vString, vDouble, vInteger), HttpStatus.OK);
    }
    
}
