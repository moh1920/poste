package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
public class Region  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegion;
    private String nameRegion;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "region",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Probleme> probleme;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "region",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<TechnicienRegional> technicienRegionals;

}
