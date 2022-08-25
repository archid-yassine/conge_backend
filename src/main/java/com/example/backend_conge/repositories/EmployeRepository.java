package com.example.backend_conge.repositories;

import com.example.backend_conge.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
