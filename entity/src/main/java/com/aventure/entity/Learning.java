package com.aventure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LEARNING")

public class Learning {
	@Id
	@Column(name ="learningId")
	private Integer learningId;
	@Column(name ="shortNote")
	private String shortNote;
	@Column(name ="longNote")
	private String longNote;
	@ManyToOne
	@JoinColumn(name = "experienceId")
	private Experience experience;
	public Integer getLearningId() {
		return learningId;
	}
	public void setLearningId(Integer learningId) {
		this.learningId = learningId;
	}
	public String getShortNote() {
		return shortNote;
	}
	public void setShortNote(String shortNote) {
		this.shortNote = shortNote;
	}
	public String getLongNote() {
		return longNote;
	}
	public void setLongNote(String longNote) {
		this.longNote = longNote;
	}
	public Experience getExperience() {
		return experience;
	}
	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	

}
