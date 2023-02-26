package com.project.rh.controller;

import com.project.rh.model.Conge;
import com.project.rh.model.UserInformation;
import com.project.rh.service.CongeServiceImpl;
import com.project.rh.service.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeController {

    @Autowired
    EmployeServiceImpl employeService;

    // http://localhost:8089/SpringMVC/retrieve-all-employe

    @GetMapping("/retrieve-all-employe")
    public List<UserInformation> list() {
        return employeService.findAllEmploye();
    }

    //http://localhost:8089/SpringMVC/add-employe

    @PostMapping("/add-employe")
    public void add(@RequestBody UserInformation employe) {

        employeService.addEmploye(employe);
    }

    // http://localhost:8089/SpringMVC/modify-employe
    @PutMapping("/modify-employe")
    @ResponseBody
    public UserInformation modifyEmploye(@RequestBody UserInformation employe) {

        return employeService.updateEmploye(employe);

    }
    // http://localhost:8089/SpringMVC/remove-employe/{employe-id}
    @DeleteMapping("/remove-employe/{employe-id}")
    @ResponseBody
    public void removeEmploye(@PathVariable("employe-id") Long Id) {
        employeService.deleteEmployeById(Id);
    }
    // http://localhost:8089/SpringMVC/retrieve-employe/5
    @GetMapping("/retrieve-employe/{employe-Id}")
    @ResponseBody
    public UserInformation retrieveEmploye(@PathVariable("employe-Id") Long Id) {
        return employeService.getEmployeById(Id);
    }


}
