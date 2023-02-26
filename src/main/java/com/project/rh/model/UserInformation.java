package com.project.rh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(	name = "users")
public class UserInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String nom;
    private String prenom;
    private LocalDate datenaissance;
    private int tel;
    private String email;
    private String cin;
    private String adresse ;
    private String ville;
    private String nationalite;
    private String photo  ;
    private String status;
    private String salary;
    private String cnss;
    private String departement;
    private String fonction;
    private String typeContrat;
    private LocalDate dateEntree;
    private LocalDate dateSortie;
    private String coutHeuresSup;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Conge> conges;





}
