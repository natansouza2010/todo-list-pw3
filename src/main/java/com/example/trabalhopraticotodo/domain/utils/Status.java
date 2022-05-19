package com.example.trabalhopraticotodo.domain.utils;

public enum Status {
    A_FAZER("a_fazer"),
    FAZENDO("fazendo"),
    FEITO("feito");

    private String status;

    Status (String status){
        this.status = status;
    }
}
