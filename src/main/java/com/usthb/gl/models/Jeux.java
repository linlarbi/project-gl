package com.usthb.gl.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Jeux")
public class Jeux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jeu")
    private Long idJeu;

    @Column(name = "description")
    private String description;

    @Column(name = "Éditeur", nullable = false)
    private String editeur;

    @Column(name = "date_sortie", nullable = false)
    private LocalDateTime date_sortie;

    @Column(name = "prix", nullable = false)
    private BigDecimal prix;

    @Column(name = "catégorie", nullable = false)
    private String categorie;

    @Column(name = "titre", nullable = false)
    private String titre;

    @OneToOne
    @JoinColumn(name = "id_achat", nullable = false)
    private Achat achat;
}