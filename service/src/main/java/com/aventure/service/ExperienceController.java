package com.aventure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aventure.entity.Experience;
import com.aventure.repo.ExperienceRepository;
import com.aventure.util.ResponseUtil;

@RestController
public class ExperienceController {

    @Autowired
    @Qualifier("experienceRepo")
    private ExperienceRepository repo;

    @RequestMapping(value="aventure/experience/home", produces={"text/html"})
    public String home() {
        return ResponseUtil.experienceHome();
    }

    @RequestMapping(value="aventure/experience/solvable/{solvable}/list", produces={"text/html"})
    public String listSolvableExperiences(@PathVariable("solvable") final Boolean solvable) {
        final List<Experience> experiences = repo.findExperiencesBySolvable(solvable);
        return ResponseUtil.listExperience(experiences, solvable ? "Solvable" : "Unsolvable");
    }

    @RequestMapping(value="aventure/experience/understandable/{understandable}/list", produces={"text/html"})
    public String listUnderstandableExperiences(@PathVariable("understandable") final Boolean understandable) {
        final List<Experience> experiences = repo.findExperiencesByUnderstandable(understandable);
        return ResponseUtil.listExperience(experiences, understandable ? "Understandable" : "Non-Understandable");
    }

    @RequestMapping(value="aventure/experience/add", produces={"text/html"})
    public String addExperience() {
        return ResponseUtil.addExperience();
    }

    @RequestMapping(value="aventure/experience/edit/{id}", produces={"text/html"})
    public String editExperience(@PathVariable("id") final Integer id) {
        final Experience experience = repo.findById(id).get();
        return ResponseUtil.editExperience(experience);
    }

    @RequestMapping(value="aventure/experience/list", produces={"text/html"})
    public String list() {
        final List<Experience> experiences = repo.findAll();
        return ResponseUtil.listExperience(experiences, "All");
    }
}