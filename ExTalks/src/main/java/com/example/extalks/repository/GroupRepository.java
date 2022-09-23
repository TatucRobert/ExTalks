package com.example.extalks.repository;

import com.example.extalks.entity.Group_team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group_team, String> {

}
