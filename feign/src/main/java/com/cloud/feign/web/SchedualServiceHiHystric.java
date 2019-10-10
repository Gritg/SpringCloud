package com.cloud.feign.web;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-cloud-never-master
 * @Package: com.cloud.feign.web
 * @ClassName: SchedualServiceHiHystric
 * @Author: wangyaming
 * @Description: ${description}
 * @Date: 2019/9/19 9:53 AM
 * @Version: 1.0
 */
@Component
public class SchedualServiceHiHystric implements HiService {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
