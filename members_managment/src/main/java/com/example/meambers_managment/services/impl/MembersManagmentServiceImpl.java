package com.example.meambers_managment.services.impl;

import com.example.meambers_managment.domain.models.TeamMeamber;
import com.example.meambers_managment.repository.MembersManagmentRepository;
import com.example.meambers_managment.services.MeambersMenagmentService;
import com.example.meambers_managment.services.form.TeamMeamberForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class MembersManagmentServiceImpl implements MeambersMenagmentService {


    private final MembersManagmentRepository mmr;

    public MembersManagmentServiceImpl(MembersManagmentRepository mmr) {
        this.mmr = mmr;
    }

    @Override
    public List<TeamMeamber> findAll() {
        return this.mmr.findAll();
    }

    @Override
    public Optional<TeamMeamber> findById(TeamMeamber id) {
        return mmr.findById(id);
    }

    @Override
    public TeamMeamber createMember(TeamMeamberForm tmf) {
        TeamMeamber tm = TeamMeamber.build(tmf.getName(), tmf.getSurname(), tmf.getDname());
        return tm;
    }

    //NE ZNAM NEMAM NEKOI CREATE, DALI MI TREBA VO MOEVO NE ZNAM


}
