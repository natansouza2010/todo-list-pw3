package com.example.trabalhopraticotodo.domain.entities;

import com.example.trabalhopraticotodo.domain.utils.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


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
    private LocalDate inicio;
    private LocalDate fim;
    private Status status;
}
