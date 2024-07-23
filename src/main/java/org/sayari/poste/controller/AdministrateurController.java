package org.sayari.poste.controller;

import org.sayari.poste.entity.AdministrateurRegional;
import org.sayari.poste.entity.Planning;
import org.sayari.poste.entity.Rapport;
import org.sayari.poste.service.impl.AdministrateurService;
import org.sayari.poste.service.impl.PlannigService;
import org.sayari.poste.service.impl.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admis")
public class AdministrateurController {
    @Autowired
    private AdministrateurService administrateurService ;
    @Autowired
    private PlannigService plannigService ;
    @Autowired
    private RapportService rapportService ;
    @PostMapping("/add")
    public AdministrateurRegional creatAdmis(@RequestBody AdministrateurRegional administrateurRegional){
        return administrateurService.createAdmis(administrateurRegional);
    }
    @PostMapping("/addplanning")
    public Planning planificationDePlanning(@RequestBody Planning planning){
        return administrateurService.planificationDePlanning(planning);
    }
    @PostMapping("/addRapport")
    public Rapport genereRapport(@RequestBody Rapport rapport){
        return administrateurService.genereRapport(rapport);
    }
    @DeleteMapping("/deleteRapport")
    public void deleteRapport(@RequestParam Integer id){
        rapportService.deleteRapport(id);
    }
    @GetMapping("/getPlanning")
    public Planning getPlanningById(@RequestParam Integer id){
        return plannigService.getPlanningById(id);
    }
    @DeleteMapping("/deletePlanning")
    public void deletePlanning(@RequestParam Integer idplanning){
        plannigService.deletePlanning(idplanning);
    }
    @GetMapping("/getAllPlannings")
    public Iterable<Planning> getAllPlannings(){
        return plannigService.getAllPlannings();
    }








}
