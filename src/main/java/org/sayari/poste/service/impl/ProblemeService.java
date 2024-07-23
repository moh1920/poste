package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Probleme;
import org.sayari.poste.reposetry.PreblemeRepo;
import org.sayari.poste.service.inter.IProbleme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemeService implements IProbleme {
    @Autowired
    private PreblemeRepo preblemeRepo ;


    @Override
    public List<Probleme> findAllProblemes() {
        return preblemeRepo.findAll();
    }

    @Override
    public Probleme updateProbleme(Probleme probleme) {
return preblemeRepo.save(probleme);

    }

    @Override
    public void deleteProbleme(Probleme probleme) {
        preblemeRepo.delete(probleme);
        System.out.println("probleme deleteed");
    }

    @Override
    public Probleme findById(Integer id) {
        return preblemeRepo.findById(id).orElse(null);
    }

    @Override
    public void changerStatus(String nouveauStatus,Integer id) {
        Probleme probleme = findById(id);
        probleme.setStatus(nouveauStatus);
    }
}
