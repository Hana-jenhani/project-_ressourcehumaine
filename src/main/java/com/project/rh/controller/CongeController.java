package com.project.rh.controller;

import com.project.rh.model.Conge;
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
}
