package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class AdministrateurRegional extends Utilisateur{

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "administrateurRegional",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Planning> plannings ;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "administrateurRegional",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Rapport>  rapports;



}
