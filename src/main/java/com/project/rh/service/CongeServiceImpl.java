package com.project.rh.service;

import com.project.rh.model.Conge;
import com.project.rh.model.StatusOfDemand ;
import com.project.rh.model.UserInformation;
import com.project.rh.repository.CongeRepository;
import com.project.rh.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements ICongeService {

    private int d=0;
    @Autowired
    CongeRepository congeRepository;
    @Autowired
    EmployeRepository employeRepository;

    @Override
    public List<Conge> findAllConge() {
        List<Conge> Conges =  congeRepository.findAll();
        return Conges;
    }

    @Override
    public Conge addConge(Conge c) {
        c.setStatusOfDemand("not_yet_treated");
        return congeRepository.save(c);
    }

    @Override
    public Conge updateConge(Conge c) {
        return congeRepository.save(c);
    }

    @Override
    public Conge getCongeById(long Id) {
        return  congeRepository.findById(Id).get();
    }

    @Override
    public void deleteCongeById(long Id) {
        this.congeRepository.deleteById(Id);
    }

    public void accepterConge(Long id) {

        Conge conge = congeRepository.findById(id).get();
        UserInformation user = conge.getUser();

        conge.setStatusOfDemand("Accepted");
        congeRepository.save(conge);



    }
}
