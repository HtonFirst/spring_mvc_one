package com.alex_kozlov.spring.mvc;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";
    }


//    @RequestMapping("showDetails")
//    public String showEmployeeDetails() {
//        return "show-employee-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("attributeName", empName);
//        model.addAttribute("description", "Dreamer");
//
//        return "show-employee-details-view";
//    }


    @RequestMapping("showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {

        String name = employee.getName();
        employee.setName("Mr. " + name);

        return "show-employee-details-view";
    }



//    @RequestMapping("showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
//
//
//        empName = "Mr. " + empName;
//
//        model.addAttribute("attributeName", empName);
//        model.addAttribute("description", "Dreamer");
//
//        return "show-employee-details-view";
//    }



}
