package fr.dawan.residences.repository;

import fr.dawan.residences.models.residence.Address;
import fr.dawan.residences.models.residence.house.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Address> {
}
