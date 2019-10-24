-- begin CHECKDCCONCEPT_A_MANY_TO_MANY_B
create table CHECKDCCONCEPT_A_MANY_TO_MANY_B (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    A_ID varchar(36),
    B_ID varchar(36),
    --
    primary key (ID)
)^
-- end CHECKDCCONCEPT_A_MANY_TO_MANY_B
-- begin CHECKDCCONCEPT_A
create table CHECKDCCONCEPT_A (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end CHECKDCCONCEPT_A
-- begin CHECKDCCONCEPT_B
create table CHECKDCCONCEPT_B (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CHECKDCCONCEPT_B
