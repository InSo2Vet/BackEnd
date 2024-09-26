package com.example.citasvetapi.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "Veterinarian")
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Veterinarian;

    @Column(name = "firstname", nullable = false, length = 60)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 60)
    private String lastname;

    @Column(name = "email", unique = true, length = 60)
    private String email;

    @Column(name = "password", unique = true, length = 50)
    private String password;

    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    @Column(name = "license_number", nullable = false, length = 30)
    private String license_number;

    @Column(name = "speciality", nullable = false, length = 50)
    private String speciality;

    @OneToMany(mappedBy = "veterinarian", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;
}
