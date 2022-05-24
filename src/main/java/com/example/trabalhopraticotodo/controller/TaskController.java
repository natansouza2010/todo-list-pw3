package com.example.trabalhopraticotodo.controller;


import com.example.trabalhopraticotodo.domain.entities.Task;
import com.example.trabalhopraticotodo.domain.utils.Status;
import com.example.trabalhopraticotodo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        mv.addObject("task", new Task());
        return mv;
    }

    @PostMapping("/task/save")
    public String saveTask(Task task, RedirectAttributes redirect){
        taskService.save(task);
        redirect.addFlashAttribute("success","Task adicionada com sucesso.");
        return "redirect:/";

    }


    @GetMapping("/delete/{id}")
    public String getDelete(@PathVariable("id") Long id){
        taskService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView getEdit(@PathVariable("id") Long id){

        ModelAndView mv = new ModelAndView("home.html");
        List<Task> taskList = taskService.getTasksList();
        mv.addObject("taskList", taskList);

        Task task = taskService.findTaskById(id);

        mv.addObject("task", task);

        return mv;

    }

    @PostMapping("/edit")
    public String postEdit(@PathVariable("id") Long id , RedirectAttributes redirect){
        Task task = taskService.findTaskById(id);
        taskService.save(task);
        redirect.addFlashAttribute("success","Task adicionada com sucesso.");
        return "redirect:/";



    }


    @ModelAttribute("status")
    public Status[] getStatus() {

        return Status.values();
    }




}
