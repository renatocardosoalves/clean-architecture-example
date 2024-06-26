create table if not exists users
(
    id       uuid        not null primary key,
    username varchar(50) not null,
    password varchar(50) not null,
    email    varchar(50) not null
)