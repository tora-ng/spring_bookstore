package edu.kosmo.ysy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosmo.ysy.service.UserService;
import edu.kosmo.ysy.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class UserController {

   @Inject
   private UserService userService;

   @GetMapping("/add/addForm")
   public void userForm() {
      log.info("Welcome userForm");
   }

   @PostMapping("/add/addUser")
   public String addUser(UserVO uservo) {
      log.info("post resister");
      userService.addUser(uservo);

      return "redirect:/";
   }
}