package com.example.demo.services;

import com.example.demo.entities.EmployeeEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmployeeService {
    public Flux<EmployeeEntity> getAllEmployee();
    public Mono<EmployeeEntity> getEmployeeById( int id);
    public Mono<EmployeeEntity> createEmployee( EmployeeEntity employee);
    public Mono<EmployeeEntity> updateEmployee( int id,  EmployeeEntity employee);
    public Mono<Void> deleteEmployee( int id);
}
