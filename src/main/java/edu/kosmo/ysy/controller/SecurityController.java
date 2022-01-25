package edu.kosmo.ysy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/security/*")
public class SecurityController {
	
	@RequestMapping("/all")
	public String all() {
		log.info("all!");
		
		return "/security/all";
	}
	
	@RequestMapping("/member")
	public String member() {
		log.info("only member");
		
		return "/security/member";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		log.info("only admin");
		
		return "/security/admin";
	}
	
	@GetMapping("/accessError")
	public void accessError(Model model) {
		log.info("accessError...");
		
		model.addAttribute("msg", "권한 에러 당신은 이 페이지를 볼 수 없읍니다!!");
	}
	
}
