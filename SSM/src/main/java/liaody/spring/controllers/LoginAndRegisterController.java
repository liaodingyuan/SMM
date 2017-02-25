package main.java.liaody.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/2/25.
 */
@RequestMapping("/liaody")
@Controller("LoginAndRegisterController")
public class LoginAndRegisterController {

//    private
    /**
     * default controller
     */
    public LoginAndRegisterController(){

    }
    @RequestMapping("/login")
    public ModelAndView userLogin(){
        ModelAndView view = new ModelAndView();
        return view;
    }

    @RequestMapping("/register")
    public ModelAndView userRegister(){
        ModelAndView view = new ModelAndView();
        return view;
    }
}
