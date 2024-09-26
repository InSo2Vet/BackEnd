package com.example.citasvetapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Pet;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "species", nullable = false, length = 30)
    private String species;

    @Column(name = "breed", nullable = false, length = 30)
    private String breed;

    @Column(name = "age", nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id_Owner", foreignKey = @ForeignKey(name = "FK_Pet_Owner"))
    private Owner owner;
}
