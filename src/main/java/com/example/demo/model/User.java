package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    private long id;

    private String name;

    public User(long id, String name) {
        this.id = 1;
        this.name = "Testname";
    }

    public User() {
    }
}
