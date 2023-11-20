--liquibase formatted sql
--changeset dirtyloop:4
create table acUnit(
    id bigint not null auto_increment PRIMARY KEY,
    customer_id bigint not null,
    model varchar(64) not null,
    power float not null,
    serial_number varchar(16) not null,
    instal_date date not null
);