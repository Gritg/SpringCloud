package com.cloud.serviceribbon.controller;

import com.cloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-cloud-never-master
 * @Package: com.cloud.serviceribbon.controller
 * @ClassName: HelloController
 * @Author: wangyaming
 * @Description: ${description}
 * @Date: 2019/9/18 11:24 AM
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }


}
