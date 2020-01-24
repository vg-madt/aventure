package com.aventure.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ACTIVITY")
public class Activity implements Serializable{
	@Id
	@Column(name = "activityId")
	private Integer activityId;
	@Column(name = "activityName")
	private String activityName;
	@Column(name = "date")
	private Date date;
	@Column(name = "marks")
	private Integer marks;
	@Column(name = "timeLimit")
	private double timeLimit;
	@ManyToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public double getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(double timeLimit) {
		this.timeLimit = timeLimit;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	

	

}
