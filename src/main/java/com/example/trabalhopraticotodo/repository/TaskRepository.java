package com.example.trabalhopraticotodo.repository;

import com.example.trabalhopraticotodo.domain.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
