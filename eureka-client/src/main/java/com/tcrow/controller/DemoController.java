package com.tcrow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo")
@Slf4j
public class DemoController {

    @RequestMapping(value = "/hello/{userId}", method = RequestMethod.GET)
    public String hello(@PathVariable Integer userId) {
        log.info("The client request me userId: {}" , userId);
        return userId + "-- hello!";
    }
}
