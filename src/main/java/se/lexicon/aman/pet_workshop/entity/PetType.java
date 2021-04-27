package se.lexicon.aman.pet_workshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
}
