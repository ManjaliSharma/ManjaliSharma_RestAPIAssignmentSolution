insert into employee values(1, 'MANJALI@MAIL.COM', 'MANJALI', 'SHARMA');
insert into employee values(2, 'MANJALIK@MAIL.COM', 'MANJALI', 'KUMARI');
insert into employee values(3, 'ANJALI@MAIL.COM', 'ANJALI', 'SINGH');
insert into employee values(4, 'ANJANI@MAIL.COM', 'ANJANI', 'MUDEPI');
insert into employee values(5, 'ANJANEYA@MAIL.COM', 'ANJANEYA', 'SHAKYA');
insert into employee values(6, 'AMAN@MAIL.COM', 'AMAN', 'SHARMA');
insert into employee values(7, 'NAMAN@MAIL.COM', 'NAMAN', 'GUPTA');
insert into employee values(8, 'CHAMAN@MAIL.COM', 'CHAMAN', 'SRIVASTAV');

insert into roles (role_id, name)values (1,'ADMIN');
insert into roles (role_id, name)values (2,'USER');

insert into users (user_id,username,password) values(1,'admin','$2a$12$7u8MNzd0El9uI26m8hFsb.YUUtv2zxoq97EgWR8x9Rffp0YzXdwsK');
insert into users (user_id,username,password) values(2,'user','$2a$12$FCgETDvhA4XPg4YtsEXYMuJZWWRkBviB07TiDj3SdmUeZNIOQeNX6');
insert into users_roles(user_id,role_id)values (1,1);


