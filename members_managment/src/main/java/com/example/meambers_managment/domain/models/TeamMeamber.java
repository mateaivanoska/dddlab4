package com.example.meambers_managment.domain.models;


import com.example.meambers_managment.domain.valueObjects.ProjectIds;
import com.example.meambers_managment.domain.valueObjects.TeamMeamberEmail;
import jakarta.persistence.*;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "teamMeamber")
public class TeamMeamber extends AbstractEntity<TeamMeamberId> {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    //OVA NE TREBA IZGLEDA, OVA SE STAVA KAJ TEAM MEMBER
    @AttributeOverride(name = "id", column = @Column(name = "projectId", nullable = false))
    private ProjectIds projectId;

    @Enumerated(value = EnumType.STRING)
    private DepartmentNames Department;

    @AttributeOverride(name = "email", column = @Column(name = "emailM",nullable = false))
    private TeamMeamberEmail teamMeamberEmail;


    public  static  TeamMeamber build(String name, String surname, DepartmentNames dn){
        TeamMeamber tm=new TeamMeamber();
        tm.name=name;
        tm.surname=surname;
        tm.Department=dn;
        return tm;
    }



}
