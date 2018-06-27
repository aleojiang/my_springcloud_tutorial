package demo.web.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  16:05 2018/6/24.
 */
@FeignClient(
        name = "single-vendor-service", // name of arbitrary service instance-id which already registered to eureka
        fallback = MyFeignFallBack.class, // hystrix fallback impl
        qualifier = "vendor1", // this is a alias name for feign client bean
        configuration = MyFeignConfig.class  // customized
)
@RibbonClient(
        name = "single-vendor-service",
        configuration = MyRibbonClientConfiguration.class
)
public interface MyFeignClient {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String getMyData();
    
}
