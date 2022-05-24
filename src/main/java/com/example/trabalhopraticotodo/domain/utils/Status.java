package com.example.trabalhopraticotodo.domain.utils;

public enum Status {
    A_FAZER("A fazer"),
    FAZENDO("Fazendo"),
    FEITO("Feito");


    private final String displayName;

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }



}
