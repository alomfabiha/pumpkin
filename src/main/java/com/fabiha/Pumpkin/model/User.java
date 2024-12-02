package com.fabiha.Pumpkin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Maps this class to the 'users' table
public class User {

    @Id
    @Column(name = "id", nullable = false, unique = true) // Maps to the 'id' column
    private Long id; // We'll set the ID manually in the application

    @Column(name = "name", nullable = false) // Maps to the 'name' column
    private String name;

    @Column(name = "email", nullable = false, unique = true) // Maps to the 'email' column
    private String email;

    // Getters and Setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
