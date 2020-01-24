package com.aventure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EXPERIENCE")

public class Experience {
	@Id
	@Column(name ="experienceId")
	private Integer experienceId;
	public enum DifficultyLevel{
		ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);
		private final int level;
		private DifficultyLevel(int level) {
			this.level=level;
		}
	}
	@Enumerated(EnumType.STRING)
	@Column(name ="difficultyLevel")
	private DifficultyLevel difficultyLevel;
	@Column(name ="isUnderstandable")
	private boolean isUnderstandable;
	@Column(name ="isSolvable")
	private boolean isSolvable;
	@OneToOne
	@JoinColumn(name = "stuActId")
	private StudentActivity studentActivity;
	public StudentActivity getStudentActivity() {
		return studentActivity;
	}
	public void setStudentActivity(StudentActivity studentActivity) {
		this.studentActivity = studentActivity;
	}
	public Integer getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}
	public DifficultyLevel getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public boolean isUnderstandable() {
		return isUnderstandable;
	}
	public void setUnderstandable(boolean isUnderstandable) {
		this.isUnderstandable = isUnderstandable;
	}
	public boolean isSolvable() {
		return isSolvable;
	}
	public void setSolvable(boolean isSolvable) {
		this.isSolvable = isSolvable;
	}
	public Integer getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}
	@Column(name ="timeLimit")
	private Integer timeLimit;
	
	

}
