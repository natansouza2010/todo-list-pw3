package com.example.trabalhopraticotodo.domain.entities;

import com.example.trabalhopraticotodo.domain.utils.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="task")
@Entity(name="task")

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate inicio;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fim;
    private Status status;
}
