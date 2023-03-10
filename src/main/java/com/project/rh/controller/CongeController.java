package com.project.rh.controller;

import com.project.rh.model.Conge;
import com.project.rh.model.UserInformation;
import com.project.rh.service.CongeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CongeController {

    @Autowired
    CongeServiceImpl congeService;

    // http://localhost:8089/SpringMVC/retrieve-all-conge

    @GetMapping("/retrieve-all-conge")
    public List<Conge> list() {
        return congeService.findAllConge();
    }

    //http://localhost:8089/SpringMVC/add-conge

    @PostMapping("/add-conge")
    public void add(@RequestBody Conge conge) {

        congeService.addConge(conge);
    }

    //http://localhost:8089/SpringMVC/accepter-conge

    @GetMapping("/accepter-conge")
    public void accepterConge( @RequestParam Long id) {

        congeService.accepterConge(id);
    }
    //http://localhost:8089/SpringMVC/refuser-conge
    @GetMapping("/refuser-conge")
    public void refuserConge (@RequestParam Long id) {

        congeService.refuserConge(id);
    }
    //http://localhost:8089/SpringMVC/conges_attente
    @GetMapping("conges_attente")
    public List<Conge> getCongeByStatus (){
        return congeService.getCongeByStatus();
    }
    @GetMapping("/dureeConge/{id}")
    public int getDuree(@PathVariable Long id ) {
        return congeService.countDuree(id);
    }


}
