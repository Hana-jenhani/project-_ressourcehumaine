package com.project.rh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCong;
    private String typeCong;
    private Date debutCong;
    private Date finCong;
    private Date createdAt;
    private String description;
    private int duree ;
    private int soldeConges = 30;
    private String statusOfDemand="Waiting";
    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private UserInformation user;
}
