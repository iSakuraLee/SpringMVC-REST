package com.springmvc.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: Something wonderful is about to happen
 * Author: Onlee
 * Date: 2021-09-17 19:25
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView() {
        return "success";
    }

    // 转发浏览器内部只发送了一次请求，地址栏出现的是testForward，可以获取请求域对象中的数据
    // 不可以跨域
    @RequestMapping("/testForward")
    public String testForward() {
        return "forward:/testThymeleafView";
    }

    // 重定向浏览器内部发送了两次请求：第一次访问Servlet；第二次访问重定向的地址，地址栏最终出现的地址是testThymeleafView
    // 可以跨域，不能访问web-inf目录下的资源
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        return "redirect:/testThymeleafView";
    }

}
