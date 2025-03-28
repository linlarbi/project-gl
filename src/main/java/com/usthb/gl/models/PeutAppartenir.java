package com.usthb.gl.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "peut_appartenir")
@IdClass(PeutAppartenirId.class)
public class PeutAppartenir {
    @Id
    @ManyToOne
    @JoinColumn(name = "ID_Jeu")
    private Jeu jeu;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_Catégorie")
    private Categorie categorie;
}