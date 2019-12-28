package com._520.springMVC.date;

import com._520.springMVC.vo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;

@Controller
@RequestMapping("/date")
public class HandleDateController {

    @RequestMapping("/test1")
    public ModelAndView test1(@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        System.out.println(date);
        return null;
    }

    @RequestMapping("/test2")
    public ModelAndView test2(User user) {
        System.out.println(user);
        System.out.println(user.getLocalDate());
        return null;
    }

    @RequestMapping("/test3")
    public User test3(User user) {
        System.out.println(user);
        System.out.println(user.getLocalDate());
        return user;
    }
}
