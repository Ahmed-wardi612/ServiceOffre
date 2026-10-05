package com.iset.service_offreemploi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.iset.service_offreemploi.dao.OffreRepository;
import com.iset.service_offreemploi.entities.Offre;

@SpringBootApplication
public class ServiceOffreemploiApplication implements CommandLineRunner {

    @Autowired
    OffreRepository OffreRepository;

    public static void main(String[] args) {
        SpringApplication.run(ServiceOffreemploiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OffreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
        OffreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
        OffreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));
    }
}