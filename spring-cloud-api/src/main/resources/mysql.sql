
create database db01;
use db01;

insert into dept (dname, db_source)
values ('开发部', database());
insert into dept (dname, db_source)
values ('人事部', database());
insert into dept (dname, db_source)
values ('财务部', database());
insert into dept (dname, db_source)
values ('市场部', database());
insert into dept (dname, db_source)
values ('运维部', database());