package com.workingPlatform.employeemicroservice.controller;


import com.workingPlatform.employeemicroservice.entity.EmployeeEntity;
import com.workingPlatform.employeemicroservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createEmployee(@RequestBody EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
    }

}
