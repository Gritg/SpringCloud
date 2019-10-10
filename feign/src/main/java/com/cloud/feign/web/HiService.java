package com.cloud.feign.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: spring-cloud-never-master
 * @Package: com.cloud.feign.web
 * @ClassName: HiService
 * @Author: wangyaming
 * @Description: ${description}
 * @Date: 2019/9/18 2:50 PM
 * @Version: 1.0
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface HiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
