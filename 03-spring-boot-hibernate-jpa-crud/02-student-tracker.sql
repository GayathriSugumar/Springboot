create database student_tracker;
use student_tracker;

create table student (
id int NOT NULL auto_increment,
first_name varchar(45) default null,
last_name varchar(45) default null,
email varchar(45) default null,
primary key (id)
);

select * from student;