create table user(
	id int(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username varchar(255) not null unique ,
  password varchar(255) not null,
  isActive boolean default false
  );


create table sys_log(
	id int(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  requert_id varchar(255) not null ,
  url varchar(255) not null ,
  action varchar(255) not null,
  jwt varchar(255) ,
  type varchar(20) ,
  request_body text,
  response_body text
  );
