package com.project.rh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateAppelOffre implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PKCandidateAppelOffre pkCandidateAppelOffre;

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "idOffre", referencedColumnName = "idOffre", insertable = false, updatable = false)
    private AppelOffre appelOffre;
}
