package fr.dawan.residences.models.identification;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class IdentityCard extends IdForm {
    private String puceId;

    public IdentityCard(String UUID, LocalDate issuedAt, String puceId) {
        super(UUID, issuedAt);
        this.puceId = puceId;
    }

    public IdentityCard(String puceId) {
        this.puceId = puceId;
    }

    public IdentityCard() {

    }
}
