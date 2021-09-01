create table _status(
idstatus int not null auto_increment,
statusdesc varchar(50),
primary key(idstatus)
)
;

create table clients(
idclient int not null auto_increment,
_name varchar(50),
lastname varchar(50),
dni varchar(13),
phone varchar(13),
idstatus int,
primary key(idclient),
constraint fk_client_status foreign key(idstatus) references _status(idstatus)
)
;

create table addresses(
idaddress int not null auto_increment,
address varchar(100),
idclient int,
idstatus int,
primary key(idaddress),
constraint fk_address_client foreign key(idclient) references clients(idclient),
constraint fk_address_status foreign key(idstatus) references _status(idstatus)
)
;
