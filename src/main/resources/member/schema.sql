drop table if exists login CASCADE;

CREATE TABLE login (
    index bigint generated by default as identity,
    email varchar(100),
    passwd varchar(50),
    primary key (index)
)