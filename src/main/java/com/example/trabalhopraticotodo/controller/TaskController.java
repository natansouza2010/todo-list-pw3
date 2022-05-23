package com.example.trabalhopraticotodo.controller;


import com.example.trabalhopraticotodo.domain.entities.Task;
import com.example.trabalhopraticotodo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;


    @GetMapping("/")
    public ModelAndView getList(){
        List<Task> taskList = taskService.getTasksList();

        ModelAndView mv = new ModelAndView("home.html");
        mv.addObject("taskList", taskList);
        return mv;
    }

    @PostMapping("/task/save")
    public String saveTask(Task task, RedirectAttributes redirect){
        taskService.save(task);
        redirect.addFlashAttribute("success","Task adicionada com sucesso.");
        return "redirect:/";

    }




}
