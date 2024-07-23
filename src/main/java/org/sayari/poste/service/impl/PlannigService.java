package org.sayari.poste.service.impl;

import org.sayari.poste.entity.Planning;
import org.sayari.poste.reposetry.PlanningRepo;
import org.sayari.poste.service.inter.IPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlannigService implements IPlanningService {
    @Autowired
    private PlanningRepo planningRepo;
    @Override
    public Planning createPlanning(Planning planning) {
        return planningRepo.save(planning);
    }

    @Override
    public Planning updatePlanning(Planning planning) {
        return planningRepo.save(planning);
    }

    @Override
    public void deletePlanning(Integer idplanning) {
        planningRepo.deleteById(idplanning);
    }

    @Override
    public Planning getPlanningById(Integer idplanning) {
        return planningRepo.findById(idplanning).orElse(null);
    }

    @Override
    public Iterable<Planning> getAllPlannings() {
        return planningRepo.findAll();
    }
}
