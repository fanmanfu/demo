package com.fanmanfu.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: fanmanfu
 * @CreateDate: 2019/6/3 0003 15:28
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/3 0003 15:28
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@RestController
public class helloController {

    @Value("${name}")
    String name;

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println(name);
        System.out.println("樊满福");
        return "hello 彭露露";
    }

    /**
     * 捕获全局异常
    * 此处调用会报错，在dealExceptionController处理Exception，则不会把报错信息抛给前端
    * */
    @GetMapping(value = "/dealExcrption")
    public String dealExcrption(){
        int i = 1 / 0;
        return "hello 彭露露";
    }



}
