package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Rapport;
import org.sayari.poste.reposetry.RapportRepo;
import org.sayari.poste.service.inter.IRapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RapportService implements IRapport {
    @Autowired
    private RapportRepo rapportRepo;
    @Override
    public Rapport createRapport(Rapport rapport) {
        return rapportRepo.save(rapport);
    }

    @Override
    public Rapport updateRapport(Rapport rapport) {
        return rapportRepo.save(rapport);
    }

    @Override
    public void deleteRapport(Integer id) {
        rapportRepo.deleteById(id);
        System.out.println("rapport deleted");
    }
}
