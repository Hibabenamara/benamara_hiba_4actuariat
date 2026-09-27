package tn.esprit.benamara_hiba_4actuariat.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.benamara_hiba_4actuariat.enums.CategorieVehicule;
import tn.esprit.benamara_hiba_4actuariat.enums.StatutVehicule;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
}
