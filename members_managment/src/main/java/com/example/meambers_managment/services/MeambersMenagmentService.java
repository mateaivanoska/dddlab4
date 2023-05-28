package com.example.meambers_managment.services;

import com.example.meambers_managment.domain.models.TeamMeamber;
import com.example.meambers_managment.services.form.TeamMeamberForm;

import java.util.List;
import java.util.Optional;

public interface MeambersMenagmentService {

    List<TeamMeamber> findAll();

    Optional<TeamMeamber> findById(TeamMeamber id);

    TeamMeamber createMember(TeamMeamberForm tm);

}
