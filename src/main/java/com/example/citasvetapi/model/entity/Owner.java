package com.example.citasvetapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Owner")

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Owner;

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

    @Column(name = "direction", nullable = false, length = 100)
    private String direction;
}
