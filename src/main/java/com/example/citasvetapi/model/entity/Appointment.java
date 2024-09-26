package com.example.citasvetapi.model.entity;
import com.example.citasvetapi.model.enums.StatusAppointment;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Appointment;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", referencedColumnName = "id_Veterinarian", foreignKey = @ForeignKey(name = "FK_Appointment_Veterinarian"))
    private Veterinarian veterinarian;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id_Owner", foreignKey = @ForeignKey(name = "FK_Appointment_Owner"))
    private Owner owner;

    @Enumerated(EnumType.STRING)
    @Column(name = "appointment_status")
    private StatusAppointment statusAppointment;
}
