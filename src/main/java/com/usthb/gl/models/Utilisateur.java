package com.usthb.gl.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "Utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_utilisateur")
    @SequenceGenerator(name = "seq_utilisateur", sequenceName = "seq_utilisateur", allocationSize = 1)
    private Long idUtilisateur;

    @Column(nullable = false)
    private String nom;

    @Column(name = "Prénom", nullable = false)
    private String prenom;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "Mot_de_passe", nullable = false, length = 15)
    private String motDePasse;

    @Column(name = "Date_inscription", nullable = false)
    private LocalDateTime dateInscription;

    @OneToOne
    @JoinColumn(name = "ID_Achat", nullable = false)
    private Achat achat;
}