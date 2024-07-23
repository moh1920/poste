package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class GestionnaireDesuccursale extends  Utilisateur {

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "gestionnaireDesuccursale",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Probleme> probleme;


}
