package com.example.demo.controller;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.irepository.IEmployee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1")
public class EmployeesController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    private Flux<EmployeeEntity> getAllEmployee(){
       return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    private Mono<EmployeeEntity> getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    private Mono<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Mono<EmployeeEntity> updateBook(@PathVariable int id, @RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}
