create table question
(
    id            integer auto_increment primary key,
    title         varchar(50),
    description   varchar(4096),
    gmt_create    bigint,
    gmt_modified  bigint,
    creator       integer not null,
    comment_count integer default 0,
    view_count    integer default 0,
    like_count    integer default 0,
    tag           varchar(256)
);