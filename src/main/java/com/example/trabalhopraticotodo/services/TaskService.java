package com.example.trabalhopraticotodo.services;


import com.example.trabalhopraticotodo.domain.entities.Task;
import com.example.trabalhopraticotodo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getTasksList(){
        Iterable<Task> all = taskRepository.findAll();
        return Streamable.of(all).toList();
    }

    public boolean save(Task task){
        taskRepository.save(task);
        return true;
    }



    public boolean delete(Long id){
        Optional<Task> task = taskRepository.findById(id);
        taskRepository.delete(task.get());
        return true;
    }

   public Task findTaskById(Long id){
        Optional<Task> task = taskRepository.findById(id);
        return task.get();
   }




}
