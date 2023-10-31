package com.surfhub.publicacionproductoservice.feignconfiguration;

import com.surfhub.publicacionproductoservice.feign.UserFeignClient;
import feign.Feign;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignClientConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }

//    @Bean
//    public UserFeignClient registerUserApi() {
//        return Feign.builder().target(UserFeignClient.class, "http://localhost:8081/api/v1/user/findbyemail");
//    }
}
