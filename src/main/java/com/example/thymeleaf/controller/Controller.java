package com.example.thymeleaf.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
  @RequestMapping("/hello")
  public String hello(Model model, @RequestParam(value="name",  defaultValue="nagaraj") String name) {
      
      String message="You just create Spring Boot Thymeleaf Example successfully";
      model.addAttribute("name", name);
       model.addAttribute("message", message);
      
      return "demoweb";
  }
}
