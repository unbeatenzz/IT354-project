package com.ClassProject.springboot.controller;

import com.ClassProject.springboot.model.User;
import com.ClassProject.springboot.service.UserService;
import com.ClassProject.springboot.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired private UserService userService;

    @RequestMapping("/index")
    public String user(Model model){
        return "index";
    }

    @RequestMapping("/user/login")
    public String login(Model model, @RequestParam(defaultValue = "0") String username, @RequestParam(defaultValue = "0") String pwd, HttpServletRequest request){
        User u = new User();
        u.setUsername(username);
        u.setPwd(pwd);
        User u2 = userService.selectByUserInfo(u);
        HttpSession session = request.getSession();
        session.setAttribute("username",u2.getUsername());
        session.setAttribute("uid",u2.getUid());
        model.addAttribute("user",u2);
        System.out.println(username);
        System.out.println(pwd);
        return "index";
    }

    @RequestMapping("/log")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("/user/off")
    public String userOff(HttpSession session){
        session.removeAttribute("username");
        return "redirect:/index";
    }

}
