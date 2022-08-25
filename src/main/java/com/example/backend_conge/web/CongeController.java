package com.example.backend_conge.web;

import com.example.backend_conge.entities.Conge;
import com.example.backend_conge.services.CongeService;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conge")
public class CongeController {
    @Autowired
    private CongeService congeService;

    // ajouter un conge
    @PostMapping("/addconge")
    public Conge addConge(@RequestBody Conge conge){
        return congeService.addConge(conge);
    }

    //ajouter plusieurs conge
    @PostMapping("/addconges")
    public List<Conge> addAllConge(@RequestBody List<Conge> conges) {
        return congeService.addAllConge(conges);
    }

    @GetMapping("/getCongebyID/{id}")
    public Conge getCongById(@PathVariable int id){
        return congeService.getCongeByID(id);
    }

    @DeleteMapping("/deleteCongeById/{id}")
    public boolean deleteCongeByID(@PathVariable int id) {
        return congeService.deleteCongeByID(id);
    }

    //affiche tous le conges
    @GetMapping("/getAll")
    public List<Conge> getAllConge(){
        return congeService.getAllConges();
    }


}
