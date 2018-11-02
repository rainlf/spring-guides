drop table customer if exists;
create table customer(ID serial, firstName varchar(5) NOT NULL, lastName varchar(5) NOT NULL);