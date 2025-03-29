package com.usthb.gl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Catégories")
public class Categorie {

    @Id
    @Column(name = "id_catégorie")
    private Long id_catégorie;

    @Column(name = "nom_catégorie", nullable = false)
    private String nom_catégorie;
}



