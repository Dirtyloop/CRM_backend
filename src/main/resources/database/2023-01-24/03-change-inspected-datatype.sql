--liquibase formatted sql
--changeset dirtyloop:3
alter table customer modify inspected varchar(3) not null;