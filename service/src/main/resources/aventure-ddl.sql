create table COURSE (
	courseId int primary key auto_increment,
	courseName varchar(15),
	duration int,
	nature varchar(15)
		);
	
create table SEMESTER(
	semesterId int primary key auto_increment,
	semesterNum int,
	startDate date,
	endDate date,
	year int,
	courseId int,
	foreign key(courseId) references COURSE(courseId)
	);
	
create table LECTURER(
	lecturerId int primary key auto_increment,
	lecturerName varchar(20),
	email varchar(20),
	contact int
	);
	
create table SUBJECT(
	subjectId int primary key auto_increment,
	subjectName varchar(15),
	startDate date,
	endDate date,
	semesterId int,
	lecturerId int,
	foreign key(semesterId) references SEMESTER(semesterId),
	foreign key(lecturerId) references LECTURER(lecturerId)
	);
	
create table ACTIVITY(
	activityId int primary key auto_increment,
	activityName varchar(15),
	date date,
	marks int,
	timeLimit double,
	subjectId int,
	foreign key(subjectId) references SUBJECT(subjectId)	
	);
	
create table STUDENT(
	studentId int primary key auto_increment,
	studentName varchar(25),
	dob date,
	contact int,
	address varchar(50),
	emailId varchar(25),
	courseId int,
	foreign key(courseId) references COURSE(courseId)
	);
	
		
create table STUDENT_ACTIVITY(
	stuActId int primary key auto_increment,
	studentId int,
	activityId int,
	foreign key(activityId) references ACTIVITY(activityId),
	foreign key(studentId) references STUDENT(studentId),
	constraint uniqueExpId unique (studentId,activityId)
	);

create table EXPERIENCE(
	experienceId int primary key auto_increment,
	stuActId int,
	difficutyLevel enum('ONE','TWO','THREE','FOUR','FIVE'),
	isSolvable boolean,
	isUnderstandable boolean,
	foreign key(stuActId) references STUDENT_ACTIVITY(stuActId)
	);


create table CHALLENGE(
	challengeId int primary key auto_increment,
	experienceId int,
	externalHelp boolean,
	isOvercome boolean,
	shortNote varchar(15),
	longNote varchar(30),
	foreign key(experienceId) references EXPERIENCE(experienceId)
	);
	
create table LEARNING(
	learningId int primary key auto_increment,
	experienceId int,
	shortNote varchar(15),
	longNote varchar(30),
	foreign key(experienceId) references EXPERIENCE(experienceId)
	);
	
	

	






