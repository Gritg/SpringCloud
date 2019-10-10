package com.cloud.feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-cloud-never-master
 * @Package: com.cloud.feign.web
 * @ClassName: HiController
 * @Author: wangyaming
 * @Description: ${description}
 * @Date: 2019/9/18 2:50 PM
 * @Version: 1.0
 */
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHi( name );
    }

}
