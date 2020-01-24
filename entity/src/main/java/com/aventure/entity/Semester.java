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
@Table(name = "SEMESTER")

public class Semester implements Serializable{
	@Id
	@Column(name ="semesterId")
	private Integer semesterId;
	@Column(name ="semesterNum")
	private Integer semesterNum;
	@Column(name ="startDate")
	private Date startDate;
	@Column(name ="endDate")
	private Date endDate;
	@Column(name ="year")
	private Integer year;
	@ManyToOne
	@JoinColumn(name = "courseId")
	private Course course;
	public Integer getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Integer semesterId) {
		this.semesterId = semesterId;
	}
	public Integer getSemesterNum() {
		return semesterNum;
	}
	public void setSemesterNum(Integer semesterNum) {
		this.semesterNum = semesterNum;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
