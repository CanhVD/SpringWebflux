package com.example.demo.irepository;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.entities.EmployeeEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface IEmployee extends ReactiveCrudRepository<EmployeeEntity, Integer> {
    Mono<EmployeeEntity> findByName(String name);
}
