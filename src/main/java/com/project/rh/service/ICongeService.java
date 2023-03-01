package com.project.rh.service;

import com.project.rh.model.Conge;
import com.project.rh.model.UserInformation;

import java.util.List;

public interface ICongeService {

    List<Conge> findAllConge();

    Conge addConge(Conge c);

    Conge updateConge(Conge c);

    Conge getCongeById(long Id);

    void deleteCongeById(long Id);

    List<Conge> getCongeByStatus();
}
