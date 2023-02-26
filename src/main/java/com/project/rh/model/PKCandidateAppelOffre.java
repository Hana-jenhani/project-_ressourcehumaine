package com.project.rh.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
@Data
public class PKCandidateAppelOffre  implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idCandidate ;
    private Long idAppelOffre ;

}
