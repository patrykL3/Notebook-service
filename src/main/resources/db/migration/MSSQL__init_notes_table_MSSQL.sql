drop table if exists notes;
create table notes(
    id int identity(1,1) primary key,
    title varchar(100) not null,
    description varchar(100) not null,
    importance_flag bit
)