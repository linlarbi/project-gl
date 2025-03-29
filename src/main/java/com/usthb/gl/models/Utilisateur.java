package com.usthb.gl.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "Utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_utilisateur")
    @SequenceGenerator(name = "seq_utilisateur", sequenceName = "seq_utilisateur", allocationSize = 1)
    private Long id_utilisateur;

    @Column(name = "nom" ,nullable = false)
    private String nom;

    @Column(name = "prénom", nullable = false)
    private String prenom;

    @Column(name = "email" ,nullable = false, unique = true)
    private String email;

    @Column(name = "mot_de_passe", nullable = false, length = 15)
    private String mot_de_passe;

    @Column(name = "date_inscription", nullable = false)
    private LocalDateTime date_inscription ;

    @OneToOne
    @JoinColumn(name = "id_achat", nullable = false)
    private Achat achat;
}