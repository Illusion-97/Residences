package fr.dawan.residences.repository;

import fr.dawan.residences.models.residence.Residence;
import fr.dawan.residences.models.residence.ResidenceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidenceRepository extends JpaRepository<Residence, ResidenceId> {
}
