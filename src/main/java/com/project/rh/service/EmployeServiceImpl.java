package com.project.rh.service;

import com.project.rh.model.Conge;
import com.project.rh.model.UserInformation;
import com.project.rh.repository.CongeRepository;
import com.project.rh.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeServiceImpl implements IEmployeService  {
    @Autowired
    EmployeRepository employeRepository;
    @Override
    public List<UserInformation> findAllEmploye() {
        List<UserInformation> Employes =  employeRepository.findAll();
        return Employes;
    }

    @Override
    public UserInformation addEmploye(UserInformation e) {
        return employeRepository.save(e);
    }

    @Override
    public UserInformation updateEmploye(UserInformation e) {
        return employeRepository.save(e);
    }

    @Override
    public UserInformation getEmployeById(long Id) {
        return  employeRepository.findById(Id).get();
    }

    @Override
    public void deleteEmployeById(long Id) {
        this.employeRepository.deleteById(Id);
    }

}
