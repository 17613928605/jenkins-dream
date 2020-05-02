package com.jenkins.dream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: 测试Jenkins自动部署 </p>
 * <p>Company: http://www.dream.com </p>
 *
 *@author JinJiacheng
 *@version 2020/5/2 22:06
 */
@RestController
public class JenkinsController {

    /**
     * 测试一个简单的接口
     * @param name 名称
     * @return 返回的字符串
     */
    @RequestMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name){
        return "Hello," + name + ",Nice to meet you!";
    }

}
