package com.aventure.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aventure.entity.Activity;
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	@Query("SELECT a from Activity a where a.mark >= :mark")
	List <Activity> findActivityByMarkThreshold(@Param("mark") Integer mark);

}
