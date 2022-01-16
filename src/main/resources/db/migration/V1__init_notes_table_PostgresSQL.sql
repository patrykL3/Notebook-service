drop table if exists notes;
CREATE TABLE notes (
    id serial PRIMARY KEY,
    title varchar(100) not null,
    description varchar(100) not null,
    importance_flag boolean
);