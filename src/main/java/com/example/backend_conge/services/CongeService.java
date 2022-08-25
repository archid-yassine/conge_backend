package com.example.backend_conge.services;

import com.example.backend_conge.entities.Conge;
import com.example.backend_conge.repositories.CongeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeService {

    @Autowired
    private CongeRepository congeRepository;



    public Conge addConge(Conge conge) {
        return congeRepository.save(conge);
    }

    public List<Conge> addAllConge(List<Conge> conges) {
        return congeRepository.saveAll(conges);
    }

    public Conge getCongeByID(int id) {
        return  congeRepository.findById(id).orElse(null);
    }


    public boolean deleteCongeByID(int id) {
    Conge con =congeRepository.getById(id);
    if(con != null){
        congeRepository.deleteById(id);
        return true;
    }
    return false;

    }

    public List<Conge> getAllConges() {
        return congeRepository.findAll();
    }
}
