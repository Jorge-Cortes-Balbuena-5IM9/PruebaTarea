create database UsuariosLab3;
use UsuariosLab3;
create table Usuarios1(
usuario varchar(20),
contraseña varchar(20),
rango varchar(20)
);
insert into Usuarios1 values("jorge@mail.com", "contra","administrador");
insert into Usuarios1 values("kemry@mail.com", "contra1","normal");
select rango from Usuarios1 where usuario = "jorge@mail.com";
select * from Usuarios1 where usuario = "jorge@mail.com" and contraseña = "contra";
