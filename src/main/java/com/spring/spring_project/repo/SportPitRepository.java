package com.spring.spring_project.repo;

import com.spring.spring_project.models.Fitnes;
import com.spring.spring_project.models.SportPit;
import org.springframework.data.repository.CrudRepository;

public interface SportPitRepository extends CrudRepository<SportPit, Long> {
}
