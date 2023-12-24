create database bankManagementSystem;

show databases;

use bankManagementSystem;

show tables;



--creating table for signupOne class
create table signupOne(formNo varchar(20),name varchar(20), fatherName varchar(20), 
			 dateOfBirth varchar(20),gender varchar(20), email varchar(40),
			 maritalStatus varchar(20), address varchar(30), city varchar(25), 
             idNumber varchar(20), region varchar(25));
--select from signupOne
select * from signupOne;
--creating table for signupTwo class
create table signupTwo(formNo varchar(20), religion varchar(20), category varchar(20),
			  income varchar(20), education varchar(20), Occupation varchar(20), 
			  passportNo varchar(20), phone varchar(20), seniorCitizen varchar(20), existingAccount varchar(20));
--select from signupTwo
select * from signupTwo;
--creating table for signupThree class
create table signupThree(formNo varchar(20), accountType varchar(40),
              accountNumber varchar(25),pin varchar(10), facility varchar(100));

select * from signupThree;

create table login(formNo varchar(20), AccountNumber varchar(25), pin varchar(10));

select * from login;

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

select * from bank;