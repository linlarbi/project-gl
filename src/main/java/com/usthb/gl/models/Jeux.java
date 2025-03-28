package com.usthb.gl.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Jeux")
public class Jeu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_jeu")
    @SequenceGenerator(name = "seq_jeu", sequenceName = "seq_jeu", allocationSize = 1)
    private Long idJeu;

    @Column(name = "Description")
    private String description;

    @Column(name = "Éditeur", nullable = false)
    private String editeur;

    @Column(name = "Date_sortie", nullable = false)
    private LocalDateTime dateSortie;

    @Column(name = "Prix", nullable = false)
    private BigDecimal prix;

    @Column(name = "Catégorie", nullable = false)
    private String categorie;

    @Column(name = "Titre", nullable = false)
    private String titre;

    @OneToOne
    @JoinColumn(name = "ID_Achat", nullable = false)
    private Achat achat;
}