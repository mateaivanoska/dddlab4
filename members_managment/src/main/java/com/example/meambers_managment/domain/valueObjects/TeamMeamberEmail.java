package com.example.meambers_managment.domain.valueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import org.springframework.lang.NonNull;


//NE MI GO DAVA VO BAZA EMAIL ??
@Getter
@Embeddable
public class TeamMeamberEmail {

    @Column(name = "email")
    private final String email;

    protected TeamMeamberEmail() {
        this.email = "";
    }

    public TeamMeamberEmail(@NonNull String email) {
        this.email = email;
    }
}
