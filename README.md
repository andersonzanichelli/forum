#Forum Server#

create database forum character set utf8;
create user 'forum'@'localhost' identified by 'forum';
grant all privileges on forum.* to 'forum'@'localhost';