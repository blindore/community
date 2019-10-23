create table NOTIFICATION
(
    ID            INTEGER  auto_increment primary key,
    NOTIFIER      INTEGER           not null,
    RECEIVER      INTEGER           not null,
    OUTER_ID       INTEGER           not null,
    TYPE          INTEGER           not null,
    GMT_CREATE    BIGINT            not null,
    STATUS        INTEGER default 0 not null,
    NOTIFIER_NAME VARCHAR(100),
    OUTER_TITLE   VARCHAR(256)
);