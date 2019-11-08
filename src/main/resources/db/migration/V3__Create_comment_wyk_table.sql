
create table comment
(
    id integer auto_increment,
    parent_id integer not null,
    type int not null,
    commentator int not null,
    gmt_create bigint not null,
    gmt_modified bigint,
    like_count integer default 0,
    constraint comment_pk
        primary key (id)
)CHARACTER SET utf8;