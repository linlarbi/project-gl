package com.usthb.gl.models;

import jakarta.persistence.*;

@Entity
@Table(name = "peut_appartenir")
@IdClass(PeutAppartenirId.class)
public class PeutAppartenir {

    @Id
    @Column(name = "id_jeu")
    private Long idJeu;

    @Id
    @Column(name = "id_catégorie")
    private Long idCategorie;

    // Relations avec les entités Jeux et Catégories
    @ManyToOne
    @JoinColumn(name = "id_jeu", insertable = false, updatable = false)
    private Jeux jeu;

    @ManyToOne
    @JoinColumn(name = "id_catégorie", insertable = false, updatable = false)
    private Categorie categorie;

    public PeutAppartenir() {}

    public PeutAppartenir(Long idJeu, Long idCategorie) {
        this.idJeu = idJeu;
        this.idCategorie = idCategorie;
    }

    // Getters & Setters
    public Long getIdJeu() { return idJeu; }
    public void setIdJeu(Long idJeu) { this.idJeu = idJeu; }

    public Long getIdCategorie() { return idCategorie; }
    public void setIdCategorie(Long idCategorie) { this.idCategorie = idCategorie; }

    public Jeux getJeu() { return jeu; }
    public void setJeu(Jeux jeu) { this.jeu = jeu; }

    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}