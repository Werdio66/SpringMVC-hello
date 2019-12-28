package com._520.springMVC.req;

import com._520.springMVC.vo.ParamBean;
import com._520.springMVC.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/req")
public class HandleRequestController {

    @RequestMapping("/test1")
    public void test1(String name, Integer age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @RequestMapping("/test2")
    public void test2(@RequestParam("n") String name, @RequestParam(value = "age", required = false) Integer age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @RequestMapping("/test3")
    public void test3(Long[] ids){
        System.out.println("数组 = " + Arrays.toString(ids));
    }

    @RequestMapping("/test4")
    public void test4(ParamBean pb){
        System.out.println("list = " + pb.getIds());
    }

    @RequestMapping("/test5")
    public void test5(User user){
        System.out.println(user);
    }

    @RequestMapping("/test6")
    public String test6(@ModelAttribute("myUser")User user){
        System.out.println(user);
        return "forward:/result.jsp";
    }
}
