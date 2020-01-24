insert into COURSE values (1,'MADT',2,'FULL-TIME');
insert into COURSE values (2,'WEBD',1,'FULL-TIME');
	
insert into SEMESTER
values (1,1,'2020-01-06','2020-04-20',2020,1);

insert into SEMESTER values (2,2,'2020-01-06','2020-04-20',2020,1);

insert into SEMESTER values (3,1,'2020-01-06','2020-04-20',2020,2);

insert into SEMESTER values (4,2,'2020-01-06','2020-04-20',2020,2);


insert into LECTURER values (1101,'John Doe','johndoe@gmail.com',57860036);

insert into LECTURER values (1102,'John Smith','johnsmith@gmail.com',34860036);


insert into SUBJECT values (1000,'Database','2020-01-06','2020-01-20',1,1101);

insert into SUBJECT values (1001,'Java','2020-01-21','2020-02-04',4,1102);

insert into SUBJECT values (1003,'Android','2020-02-05','2020-02-20',2,1101);


insert into ACTIVITY values (1,'ex-1','2020-01-06',10,2.5,1000);

insert into ACTIVITY values (2,'ex-2','2020-01-07',10,1.5,1001);

insert into ACTIVITY values (3,'ex-1','2020-01-21',10,2.5,1003);


insert into STUDENT values (3000,'Mark Snell','1995-05-25',59873456,'Scarborough','marksnell@gmail.com',1);

insert into STUDENT values (3001,'Alicia Snell','1995-03-28',59343456,'Scarborough','aliciasnell@gmail.com',1);

insert into STUDENT values (3002,'Vicky Smith','1995-05-21',59563456,'Don Mills','vickysmith@gmail.com',2);

insert into STUDENT values (3003,'Pooja Sharma','1995-05-15',59877456,'Scarborough','poojasharma@gmail.com',2);

