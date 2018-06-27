package demo.web.feign;

import feign.Retryer;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * The default feign config see {@link FeignClientsConfiguration}
 *
 * Customize retryer,
 * @see #feignRetryer()
 *
 * <p>
 * Created by: patrick.jiang@activenetwork.com
 * Created on:  09:16 2018/6/25.
 */
public class MyFeignConfig {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
