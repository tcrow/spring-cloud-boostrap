package com.tcrow.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-client")
public interface DemoClient {

    @RequestMapping(value = "/demo/hello/{userId}",method = RequestMethod.GET)
    String hello(@PathVariable("userId") Integer userId);

}
