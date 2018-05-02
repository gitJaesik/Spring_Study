drop table if exists person;

create table person (id int primary key auto_increment, name varchar, sex varchar );

insert into person (name) value('jaesik', 'male');
