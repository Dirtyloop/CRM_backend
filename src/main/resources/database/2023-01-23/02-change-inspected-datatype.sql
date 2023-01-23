--liquibase formatted sql
--changeset dirtyloop:2
alter table customer modify inspected varchar(3);