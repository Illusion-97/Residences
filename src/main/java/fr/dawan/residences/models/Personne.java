package fr.dawan.residences.models;

import fr.dawan.residences.models.identification.Identity;
import fr.dawan.residences.models.residence.Residence;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Identity identity;
    @OneToMany(mappedBy = "resident")
    private Set<Residence> residences;
}
