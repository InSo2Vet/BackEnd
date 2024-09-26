package com.example.citasvetapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Schedule")

public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Schedule;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime start_time;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime end_time;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", referencedColumnName = "id_Veterinarian", foreignKey = @ForeignKey(name = "FK_Schedule_Veterinarian"))
    private Veterinarian veterinarian;
}
