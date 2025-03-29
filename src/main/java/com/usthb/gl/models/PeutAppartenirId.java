package com.usthb.gl.models;

import java.io.Serializable;
import java.util.Objects;

public class PeutAppartenirId implements Serializable {
    private Long idJeu;
    private Long idCategorie;

    public PeutAppartenirId() {}

    public PeutAppartenirId(Long idJeu, Long idCategorie) {
        this.idJeu = idJeu;
        this.idCategorie = idCategorie;
    }

    // Getters & Setters
    public Long getIdJeu() { return idJeu; }
    public void setIdJeu(Long idJeu) { this.idJeu = idJeu; }

    public Long getIdCategorie() { return idCategorie; }
    public void setIdCategorie(Long idCategorie) { this.idCategorie = idCategorie; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeutAppartenirId that = (PeutAppartenirId) o;
        return Objects.equals(idJeu, that.idJeu) && Objects.equals(idCategorie, that.idCategorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJeu, idCategorie);
    }
}
