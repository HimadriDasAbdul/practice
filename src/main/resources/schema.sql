create table user
(
   id integer not null,
  username varchar(50) not null,
   password varchar(10) not null,
displayName varchar(150),
   --primary key(id)
);

insert into user
values(1,'dassshim','dassshim','Himadri Das');


insert into user(id,username,password,displayname)
values(1,'dassshim','dassshim','Himadri Das');
