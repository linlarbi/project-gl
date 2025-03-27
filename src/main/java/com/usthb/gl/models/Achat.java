package com.usthb.gl.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Achats")
public class Achat {
    @Id
    private String idAchat;

    @Column(name = "Date_achat", nullable = false)
    private LocalDateTime dateAchat;

    @ManyToOne
    @JoinColumn(name = "ID_Utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "ID_Jeu", nullable = false)
    private Jeu jeu;
}
