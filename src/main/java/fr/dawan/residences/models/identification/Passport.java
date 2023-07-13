package fr.dawan.residences.models.identification;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Passport extends IdForm {

    @ElementCollection // Association entre une entité et une collection de type dit "simples"
    private List<String> travels;

    public Passport() {
    }

    public Passport(String UUID, LocalDate issuedAt, List<String> travels) {
        super(UUID, issuedAt);
        this.travels = travels;
    }
}
