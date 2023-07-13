package fr.dawan.residences.models.identification;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // stratégie utilisée par défaut
@DiscriminatorColumn(name = "type")
@Table(name = "IDENTIFICATION")
public abstract class IdForm {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String UUID;
    private LocalDate issuedAt;

    public IdForm(String UUID, LocalDate issuedAt) {
        this.UUID = UUID;
        this.issuedAt = issuedAt;
    }

    public IdForm() {

    }
}
