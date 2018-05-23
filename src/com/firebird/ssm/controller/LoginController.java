package com.firebird.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    //登陆验证
    @RequestMapping("/login")
    public String login(HttpSession httpSession,
                        String userName,
                        String passWord) throws Exception {
        httpSession.setAttribute("username", userName);
        return "redirect:/items/queryItems.action";
    }

    //退出
    @RequestMapping("/logout")
    public String loginOut(HttpSession session) throws Exception {
        session.invalidate();
        return "redirect:/items/queryItems.action";
    }

}
