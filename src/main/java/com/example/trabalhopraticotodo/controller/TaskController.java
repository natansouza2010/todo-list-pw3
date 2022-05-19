package com.example.trabalhopraticotodo.controller;


import com.example.trabalhopraticotodo.domain.entities.Task;
import com.example.trabalhopraticotodo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;


    @GetMapping("/")
    public ModelAndView getList(){
        List<Task> taskList = taskService.getTasksList();

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("taskList", taskList);
        return mv;
    }
}
