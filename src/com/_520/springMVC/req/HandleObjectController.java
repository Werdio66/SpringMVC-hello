package com._520.springMVC.req;

import com._520.springMVC.vo.Cat;
import com._520.springMVC.vo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HandleObjectController {


    @InitBinder("dog")
    public void initDog(WebDataBinder binder){
        binder.setFieldDefaultPrefix("dog.");
    }

    @InitBinder("cat")
    public void initCat(WebDataBinder binder){
        binder.setFieldDefaultPrefix("cat.");
    }
    @RequestMapping("/save")
    public ModelAndView init(Cat cat, Dog dog){
        System.out.println(cat);
        System.out.println(dog);
        return null;
    }
}
