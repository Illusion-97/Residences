package fr.dawan.residences.models.residence;

import fr.dawan.residences.models.Personne;
import fr.dawan.residences.models.residence.house.House;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ResidenceId.class) // Précise une classe déclarative reprenant les éléments constituant la clé primaire
public class Residence {
    @Id
    @ManyToOne
    private Personne resident;
    @Id
    @ManyToOne
    private House house;
    private Boolean main;
}
