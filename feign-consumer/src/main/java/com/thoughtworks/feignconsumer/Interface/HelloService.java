package com.thoughtworks.feignconsumer.Interface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("helloService")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
