create database RESERVATIONS;

use RESERVATIONS;

create table USER (
	ID 			int not null auto_increment,
    FIRST_NAME 	varchar(20),
    LAST_NAME 	varchar(20),
    EMAIL 		varchar(50),
    PASSWORD 	varchar(20),
    
    primary key(ID),
    unique key(EMAIL)
);

-- -------------------
create table FLIGHT(
	ID 							int not null auto_increment,
    FLIGHT_NUMBER 				varchar(20) not null,
    OPERATING_AIRLINES 			varchar(20) not null,
    DEPARTURE_CITY 				varchar(20) not null,
    ARRIVAL_CITY 				varchar(20) not null,
    DATE_OF_DEPARTURE 			date not null,
    ESTIMATED_DEPARTURE_TIME 	timestamp default current_timestamp,
    
    primary key(ID)
);

-- --------------------------------------

create table PASSANGER (
	ID 			int not null auto_increment,
    FIRST_NAME 	varchar(256),
    LAST_NAME 	varchar(256),
    MIDDLE_NAME varchar(256),
    EMAIL 		varchar(50),
    PHONE 		varchar(10),

    primary key(ID)
);

-- ---------------------------------
create table RESERVATION (
	ID 				int not null auto_increment,
    CHECKED_IN 		tinyint(1),
    NUMBER_OF_BAGS 	int,
    PASSANGER_ID 	int,
    FLIGHT_ID 		int,
    CREATED 		timestamp default current_timestamp,
    
    primary key(ID),
    foreign key(PASSANGER_ID) references PASSANGER(ID) on delete cascade,
    foreign key(FLIGHT_ID) references FLIGHT(ID)
);

-- ---------------------------------

select * from USER;
select * from FLIGHT;
select * from PASSANGER;
select * from RESERVATION;

-- ----------------------------------

drop table USER;
drop table FLIGHT;
drop table PASSANGER;
drop table RESERVATION;

-- ------------------------------------

drop database RESERVATIONS;

