package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class EmployeDeSuccursale extends Utilisateur {


    @OneToMany(cascade =CascadeType.ALL,mappedBy = "employeDeSuccursale",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Probleme> probleme;

}
