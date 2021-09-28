package com.mcvilla.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien a){
        ModelAndView mv=new ModelAndView();
        mv.addObject("alien",a);
        mv.setViewName("home");
        return mv;
    }
}
