create database mybatis_board;

use mybatis_board;

create table user(
        userId int primary key auto_incremenet,
        name varchar(255),
        authId varchar(255),
        password varchar(255));
