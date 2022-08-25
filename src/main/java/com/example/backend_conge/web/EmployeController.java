package com.example.backend_conge.web;

import com.example.backend_conge.entities.Conge;
import com.example.backend_conge.entities.Employe;
import com.example.backend_conge.services.CongeService;
import com.example.backend_conge.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    // ajouter un conge
    @PostMapping("/addemploye")
    public Employe addEmploye(@RequestBody Employe employe){
        return employeService.addEmploye(employe);
    }

    //affiche tous les employes
    @GetMapping("/getAll")
    public List<Employe> getAllEmploye(){
        return employeService.getAllEmploye();
    }



}
