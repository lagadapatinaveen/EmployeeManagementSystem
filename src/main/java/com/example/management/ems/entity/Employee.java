package com.example.management.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
    @Column(name = "email")
    public String emailID;
    @Column(name = "first_name", nullable = false)
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
}
