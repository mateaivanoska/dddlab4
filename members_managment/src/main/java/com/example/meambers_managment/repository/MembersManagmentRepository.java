package com.example.meambers_managment.repository;

import com.example.meambers_managment.domain.models.TeamMeamber;
import com.example.meambers_managment.domain.models.TeamMeamberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembersManagmentRepository extends JpaRepository<TeamMeamber,TeamMeamberId> {
    Optional<TeamMeamber> findById(TeamMeamber id);
}
