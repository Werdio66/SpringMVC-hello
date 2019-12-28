package com._520.springMVC.resp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/resp")
public class HandleResponseController {

    public void test(HttpServletResponse resp, HttpServletRequest req) throws ServletException, IOException {
        req.getRequestDispatcher("").forward(req, resp);
        resp.sendRedirect("");
    }
    @RequestMapping("/test1")
    public ModelAndView test1(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "ModelAndView");
        mv.setViewName("jsp");
        return mv;
    }

    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg", "String");
        model.addAttribute("啦啦啦啦！");
        return "jsp";
    }

    @RequestMapping("/test3")
    public String test3(Model model){
        model.addAttribute("msg", "请求转发");
        return "forward:/result.jsp";
    }

    @RequestMapping("/test4")
    public String test4(Model model){
        model.addAttribute("msg", "请求转发");
        return "redirect:/result.jsp";
    }

    @RequestMapping("/test5")
    public ModelAndView test5(@ModelAttribute("msg") String msg, String ddd){
        System.out.println(msg);
        System.out.println("ddd = " + ddd);
        return null;
    }

    @RequestMapping("/test6")
    public String test6(RedirectAttributes ra){
        ra.addFlashAttribute("msg", "askjhgfddd");
        ra.addAttribute("ddd", "LLLLLLLLLLLLLLLLLLLL");
        return "redirect:/resp/test5";
    }
}
