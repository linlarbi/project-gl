package com.usthb.gl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Catégories")
public class Categorie {

    @Id
    @Column(name = "ID_Catégorie")
    private String idCategorie;

    @Column(name = "Nom_Catégorie", nullable = false)
    private String nomCategorie;
}



