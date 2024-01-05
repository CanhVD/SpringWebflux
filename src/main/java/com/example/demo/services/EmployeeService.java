package com.example.demo.services;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.irepository.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
        IEmployee employeeRepository;

    @Override
    public Flux<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Mono<EmployeeEntity> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Mono<EmployeeEntity> createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Mono<EmployeeEntity> updateEmployee(int id, EmployeeEntity employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    @Override
    public Mono<Void> deleteEmployee(int id) {
        return employeeRepository.deleteById(id);
    }
}
