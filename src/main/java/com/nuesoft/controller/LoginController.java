package com.nuesoft.controller;

import com.nuesoft.po.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({"user"})
public class LoginController{

    @ModelAttribute
    public User populateModel(User user){
        user.setLove("打球");
        return  user;
    }


    @RequestMapping("/login.do")
    public String login(User user, ModelMap map){
        //调(略)
        System.out.println(user.getAge());
        //存到request
        map.put("user",user);
        //map.addAttribute("password",user.getPassword());
        //System.out.println(user.getUsername());
        /*ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username",username);
        modelAndView.setViewName("");*/
        //转
        return "index";
    }

}
