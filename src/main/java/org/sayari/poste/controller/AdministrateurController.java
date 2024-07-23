package org.sayari.poste.controller;

import org.sayari.poste.entity.AdministrateurRegional;
import org.sayari.poste.service.impl.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/poste")
public class AdministrateurController {
    @Autowired
    private AdministrateurService administrateurService ;
    @PostMapping("/add")
    public AdministrateurRegional creatAdmis(@RequestBody AdministrateurRegional administrateurRegional){
        return administrateurService.createAdmis(administrateurRegional);
    }




}
