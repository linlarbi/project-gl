package com.usthb.gl.repositories;


import com.usthb.gl.models.Jeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JeuRepository extends JpaRepository<Jeux, Long> {
}
