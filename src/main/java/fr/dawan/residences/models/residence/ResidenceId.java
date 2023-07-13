package fr.dawan.residences.models.residence;

import fr.dawan.residences.models.Personne;
import fr.dawan.residences.models.residence.house.House;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// Une classe définissant un Id implémente l'interface Serializable afin de contenir des méthodes propres au fonctionnement interne
// de la gestion des entités (Lecture de structure -> à la sauvegarde sous forme de fichier)
public class ResidenceId implements Serializable {
    private Personne resident;
    private House house;
}
