package com.iset.service_offreemploi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iset.service_offreemploi.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}