package demo.web.feign;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  11:16 2018/6/25.
 */
public class MyRibbonClientConfiguration {
    @Autowired
    IClientConfig ribbonClientConfig;
    
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
    
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
