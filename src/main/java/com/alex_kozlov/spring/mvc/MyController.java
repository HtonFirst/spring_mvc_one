package com.alex_kozlov.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-employee-details-view";
    }
    @RequestMapping("showDetails")
    public String showEmployeeDetails() {
        return "show-employee-details-view";
    }
}
