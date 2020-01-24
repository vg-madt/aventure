package com.aventure.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aventure.entity.Experience;
import com.aventure.entity.Experience.DifficultyLevel;

@Repository("experienceRepo")
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

    @Query("SELECT e FROM Experience e WHERE e.difficultyLevel = :difficulty")
    List<Experience> findExperiencesByStudentId(@Param("difficulty") final DifficultyLevel difficulty);

    @Query("SELECT e FROM Experience e WHERE e.isSolvable = :solvable")
    List<Experience> findExperiencesBySolvable(@Param("solvable") final Boolean solvable);

    @Query("SELECT e FROM Experience e WHERE e.isUnderstandable = :understandable")
    List<Experience> findExperiencesByUnderstandable(@Param("understandable") final Boolean understandable);

}