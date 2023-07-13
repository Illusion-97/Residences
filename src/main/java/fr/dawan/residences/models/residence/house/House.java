package fr.dawan.residences.models.residence.house;

import fr.dawan.residences.models.residence.Address;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class House {
    @EmbeddedId // Embarque une classe et la considère en plus comme clé primaire
    //(@Embedded + @Id)
    private Address address;
}
