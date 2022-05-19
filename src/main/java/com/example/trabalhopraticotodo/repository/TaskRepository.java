package com.example.trabalhopraticotodo.repository;

import com.example.trabalhopraticotodo.domain.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
    
}
