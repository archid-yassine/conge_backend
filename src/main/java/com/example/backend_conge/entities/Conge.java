package com.example.backend_conge.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int nbr_jour;
    private Date date_debut;
    private Date date_fin;
    private String reponse;



    @ManyToOne
    private Employe employe;

}
