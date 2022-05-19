package com.example.trabalhopraticotodo;

import com.example.trabalhopraticotodo.domain.entities.Task;
import com.example.trabalhopraticotodo.domain.utils.Status;
import com.example.trabalhopraticotodo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TrabalhopraticoTodoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhopraticoTodoApplication.class, args);



	}
	@Autowired
	private TaskService taskService;
	@Override
	public void run(String... args) throws Exception {
		Task task = new Task();
		task.setInicio(LocalDate.now());
		task.setFim(LocalDate.now());
		task.setDescricao("Olá marilene");
		task.setStatus(Status.FAZENDO);
		taskService.save(task);

	}
}
