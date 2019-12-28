package com._520.springMVC.json;

import com._520.springMVC.vo.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.standard.Media;

@Controller
@RequestMapping("/json")
public class HandleJsonController {

    // 将字符串转换为json
    @RequestMapping(value = "/test1", produces = "applocation/json;charset=utf-8")
    @ResponseBody
    public String test1() {
        System.out.println(MediaType.APPLICATION_JSON_VALUE);
        return "hello,啥啥啥";
    }

    // 将对象转换为json
    @RequestMapping("/test2")
    @ResponseBody
    public User test2() {
        User user = new User();
        user.setName("fffff");
        user.setAge(4);
        System.out.println(user);
        return user;
    }
}
