package com.project.rh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
    private int dureeConges = 30;
    private int joursConges;
    private int soldeConges = 30;
    private String id_card_number;
    private int budget = 0;
    private int archived = 1 ;


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Conge> conges;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();





}
