package demo.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  00:46 2018/6/24.
 */
@FeignClient(serviceId = "hello-service-cluster", configuration = MyFeignConfiguration.class)
public interface HelloServiceClient {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String getHelloString();
}
