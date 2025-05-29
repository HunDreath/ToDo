package com.Algiz.ToDoApp.dataBase;


import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String mdp ;

    //---- Getter and Setter ----//

    // - ID - //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // - Name - //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // - Mdp - //

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
