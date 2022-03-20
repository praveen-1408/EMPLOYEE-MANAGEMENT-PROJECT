package com.praveen.employee.project.controller;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.praveen.employee.project.model.AppUser;
import com.praveen.employee.project.model.Employee;
import com.praveen.employee.project.service.EmployeeService;


@Controller

public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);

    
    @GetMapping("/")
    public String index() {
        return "index1";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new AppUser());
        return "login";
    }

    //access only to admin
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/index/home")
    public String adminLandingPage(Model model) {
        log.info("Accessing admin page");
        return "index";	 
    }


    //access only for user
    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("user/home")
    public String userLandingPage() {
        log.info("Accessing user page");
        return "index"; 
    }
    

}