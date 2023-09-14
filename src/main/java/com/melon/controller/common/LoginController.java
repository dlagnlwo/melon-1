package com.melon.controller.common;

import javax.servlet.http.HttpSession;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.melon.dto.common.LoginDto;
import com.melon.service.common.LoginService;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

	private final LoginService loginService;
	
    @GetMapping
    private String login(){
        return "/common/login";
    }

    @GetMapping("/melon")
    private String melonLogin(){
        return "/common/melon_login";
    }
    
    @PostMapping
    private String login(LoginDto m, HttpSession session, RedirectAttributes rttr){
    	return loginService.login(m, session, rttr);
    }
    
    @GetMapping("/logout")
    private String logout(LoginDto m, HttpSession session, RedirectAttributes rttr) {
    	loginService.logout(m, session, rttr);
    	return "redirect:/";
    }
    
}
