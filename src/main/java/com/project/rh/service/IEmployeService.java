package com.project.rh.service;

import com.project.rh.model.Conge;
import com.project.rh.model.UserInformation;

import java.util.List;

public interface IEmployeService {
    List<UserInformation> findAllEmploye();

    UserInformation addEmploye(UserInformation e);

    UserInformation updateEmploye(UserInformation e);

    UserInformation getEmployeById(long Id);

    void deleteEmployeById(long Id);


}
