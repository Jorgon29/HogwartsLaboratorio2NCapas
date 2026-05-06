package com.example.hogwartslaboratorio2ncapas.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "wizards")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wizard {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private String house;

    @Column
    private String patronus;

    @Column(name = "is_deatheater")
    private Boolean isDeatheater;
}
