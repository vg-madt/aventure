package com.aventure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_ACTIVITY")

public class StudentActivity {
	@Id
	@Column(name ="stuActId")
	private Integer stuActId;
	@OneToOne //what to put
	@JoinColumn(name = "studentId")
	private Student student;
	@OneToOne //what to put
	@JoinColumn(name = "activityId")
	private Activity activity;
	public Integer getStuActId() {
		return stuActId;
	}
	public void setStuActId(Integer stuActId) {
		this.stuActId = stuActId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	

}
