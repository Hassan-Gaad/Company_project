create table users(
	username varchar(40) primary key,
	pass varchar(40) not null
);

insert into users values('a','a');

insert into users values('b','b');

insert into users values('admin','123');