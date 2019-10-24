
create table user
(
    id           integer auto_increment primary key,
    account_id   varchar(100),
    name         varchar(50),
    token        varchar(36),
    gmt_create   bigint,
    gmt_modified bigint,
    bio          varchar(256),
    avatar_url   varchar(100)
);
