package com.fanmanfu.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: fanmanfu
 * @CreateDate: 2019/6/14 0014 11:01
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/14 0014 11:01
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@RestControllerAdvice
public class dealExceptionController {
    private static final Logger logger = Logger.getLogger(dealExceptionController.class);

    @ExceptionHandler(value=Exception.class)
    Object exceptionAdvice(Exception e, HttpServletRequest request){
        logger.info("Exception is :",e);
        System.out.println("Exception is :"+e);
        Map map = new HashMap();
        map.put("data","");
        map.put("code","9999");
        map.put("msg","系统错误");
        return map;
    }
}
