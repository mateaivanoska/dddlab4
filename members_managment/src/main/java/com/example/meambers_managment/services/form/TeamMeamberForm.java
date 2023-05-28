package com.example.meambers_managment.services.form;

import com.example.meambers_managment.domain.models.DepartmentNames;
import lombok.Getter;

@Getter
public class TeamMeamberForm {

    private String name;
    private String surname;
    private DepartmentNames dname;
}
