package com.usthb.gl.repositories;


import com.usthb.gl.models.PeutAppartenir;
import com.usthb.gl.models.PeutAppartenirId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeutAppartenirRepository extends JpaRepository<PeutAppartenir, PeutAppartenirId> {
}
