package com.web.controller;

import com.web.dao.EmployeeDao;
import com.web.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String index(Model model){
        Employee employee = employeeDao.findOne(1);
        //System.out.print(employee.getName()+"----"+employee.getSalary());
        model.addAttribute("employee",employee);
        return "index";
    }
}
