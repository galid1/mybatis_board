create database mybatis_board;

use mybatis_board;

create table user(
        userId int primary key auto_incremenet,
        name varchar(255),
        authId varchar(255),
        password varchar(255));

create table board(
	boardId int primary key auto_increment,
	title varchar(255),
	contents varchar(255),
	createdAt datetime,
	lastModifiedAt datetime,
	writer long);
