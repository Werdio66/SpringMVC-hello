package com._520.springMVC.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello(){
        // 创建模型对象
        ModelAndView mv = new ModelAndView();
        // 设置共享数据
        mv.addObject("msg","hello SpringMVC annocation! ");
        // 跳转
        mv.setViewName("WEB-INF/views/jsp.jsp");
        // 返回
        return mv;
    }
    @PostMapping("/reqPost")
    public ModelAndView reqPost(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "post");
        System.out.println("post...........");
        return mv;
    }
}
