package com.example.backend_conge.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String firstname;
    private String email;
    @OneToMany(mappedBy = "employe")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private List<Conge> conge;

}
