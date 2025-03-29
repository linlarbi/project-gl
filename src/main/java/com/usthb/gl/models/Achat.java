package com.usthb.gl.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Achats")
public class Achat {
    @Id
    private Long id_achat;

    @Column(name = "date_achat", nullable = false)
    private LocalDateTime date_achat	;

    @ManyToOne
    @JoinColumn(name = "id_Utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_Jeu", nullable = false)
    private Jeux jeux;

}