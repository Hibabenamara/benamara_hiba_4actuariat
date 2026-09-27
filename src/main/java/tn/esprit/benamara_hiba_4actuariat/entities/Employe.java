package tn.esprit.benamara_hiba_4actuariat.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.benamara_hiba_4actuariat.enums.RoleEmploye;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}
