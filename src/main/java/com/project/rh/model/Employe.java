package com.project.rh.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employe extends UserInformation {
    private static final long serialVersionUID = 1L;
    private String status;
    private String salary;
    private String cnss;
    private String departement;
    private String fonction;
    private String typeContrat;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    private String coutHeuresSup;
    private String dureeConges;
    private String id_card_number;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employe")
    @JsonManagedReference
    private List<Document> docs ;
}
