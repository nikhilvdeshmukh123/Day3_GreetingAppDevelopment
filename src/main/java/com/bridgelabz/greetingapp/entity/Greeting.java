package com.bridgelabz.greetingapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Greeting_Table")
//getter setter toString

public class Greeting {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private final String message;

    public Greeting() {
        this.message = getMessage();
    }
}