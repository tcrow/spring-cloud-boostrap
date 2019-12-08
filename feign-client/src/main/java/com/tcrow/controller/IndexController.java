package com.tcrow.controller;

import com.tcrow.remote.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/12/8 0008.
 */
@Controller
public class IndexController {

    @Autowired
    private DemoClient demoClient;

    @RequestMapping("/{userId}")
    @ResponseBody
    public String index(@PathVariable Integer userId){
        return demoClient.hello(userId);
    }


}
