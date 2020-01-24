package com.aventure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHALLENGE")


public class Challenge {
	
	@Id
	@Column(name="challengeId")
	private Integer challengeId;
	@Column(name="shortNote")
	private String shortNote;
	@Column(name="longNote")
	private String longNote;
	@Column(name="isOvercome")
	private Boolean isOvercome;
	@Column(name="externalHelp")
	private Boolean externalHelp;
	@ManyToOne
	@JoinColumn(name = "experienceId")
	private Experience experience;
	public Integer getChallengeId() {
		return challengeId;
	}
	public void setChallengeId(Integer challengeId) {
		this.challengeId = challengeId;
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
	public Boolean getIsOvercome() {
		return isOvercome;
	}
	public void setIsOvercome(Boolean isOvercome) {
		this.isOvercome = isOvercome;
	}
	public Boolean getExternalHelp() {
		return externalHelp;
	}
	public void setExternalHelp(Boolean externalHelp) {
		this.externalHelp = externalHelp;
	}
	public Experience getExperience() {
		return experience;
	}
	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	
	

}
