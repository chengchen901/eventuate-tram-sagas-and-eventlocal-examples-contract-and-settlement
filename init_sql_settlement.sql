create table settlement
(
    id          int auto_increment
        primary key,
    contract_id int          not null,
    content     varchar(255) not null,
    state       varchar(50)  not null
);