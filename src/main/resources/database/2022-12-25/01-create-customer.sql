--liquibase formatted sql
--changeset dirtyloop:1
create table customer (
    id bigint not null auto_increment PRIMARY KEY,
    name varchar(255) not null,
    company varchar(255) not null,
    nip varchar(255) not null,
    street varchar(255) not null,
    postalCode varchar(255) not null,
    city varchar(255) not null,
    units bigint not null,
    inspected boolean not null
 );