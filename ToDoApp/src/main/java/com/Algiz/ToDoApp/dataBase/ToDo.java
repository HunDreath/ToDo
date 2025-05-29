package com.Algiz.ToDoApp.dataBase;

import jakarta.persistence.*;

@Entity
@Table(name = "to_do")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
