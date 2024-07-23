package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class TechnicienRegional extends Utilisateur{


    @ManyToOne
    private Planning planning ;
    @ManyToOne
    private Region region ;
    @OneToMany(cascade = CascadeType.ALL , mappedBy ="technicienRegional",fetch =FetchType.EAGER)
    @JsonIgnore
    private List<Probleme> probleme ;

}
