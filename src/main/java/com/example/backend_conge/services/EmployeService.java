package com.example.backend_conge.services;

import com.example.backend_conge.entities.Conge;
import com.example.backend_conge.entities.Employe;
import com.example.backend_conge.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;


    public Employe addEmploye(Employe employe){
        return employeRepository.save(employe);
    }

    public List<Employe> getAllEmploye() {
        return employeRepository.findAll();
    }
}
