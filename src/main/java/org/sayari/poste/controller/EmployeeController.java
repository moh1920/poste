package org.sayari.poste.controller;

import org.sayari.poste.entity.EmployeDeSuccursale;
import org.sayari.poste.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public EmployeDeSuccursale add(@RequestBody EmployeDeSuccursale employeDeSuccursale){
        return employeeService.createEmployeDeSuccursale(employeDeSuccursale);
    }
    @PostMapping("/get")
    public List<EmployeDeSuccursale> add(){
        return employeeService.findAllEmployeDeSuccursale();
    }
}
