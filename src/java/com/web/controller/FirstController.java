package com.web.controller;

import com.web.dao.DepartmentDao;
import com.web.dao.EmployeeDao;
import com.web.dao.GoodsDao;
import com.web.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping("/")
    public String index(Model model){
        Employee employee = employeeDao.findOne(1);
        //ParkingSpace parkingSpace = employee.getParkingSpace();
        //System.out.print(parkingSpace.getEmployee().getName());
        //System.out.print(employee.getName()+"----"+employee.getSalary());

        /*测试双向多对一映射
        Department department = departmentDao.findOne(1);
        for(Employee emp:department.getEmployees()){
            System.out.print(emp.getName()+"\n");
        }
        */

        /*测试双向多对多映射
        for(Project project:employee.getProjects()){
            System.out.print(project.getName()+":\n");
            for(Employee emp:project.getEmployees()){
                System.out.print("\t"+emp.getName()+"\n");
            }
            System.out.print("\n");
        }
        */

        model.addAttribute("employee",employee);
        return "index";
    }

    @RequestMapping("addGoods")
    @ResponseBody
    public String addGoods(){
        Goods goods = new Goods();
        goods.setName("converse");
        goods.setPrice(438);
        goods.setType("鞋子");
        goodsDao.save(goods);
        return "success";
    }
}
