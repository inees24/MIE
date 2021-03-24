CREATE DATABASE MIE;

CREATE TABLE NIVEAU
(
	id_niveau int(1),
	nom_niveau varchar(25),
constraint PK_id_niveau primary key (id_niveau))
ENGINE=INNODB;


CREATE TABLE MATIERE
(
	id_matiere int(1),
	nom_matiere varchar(25),
	id_niveau int(1),
constraint PK_id_matiere primary key (id_matiere))
ENGINE=INNODB;


CREATE TABLE EXERCICE
(
	id_exercice int(1),
	nom_exercice varchar(25),
	id_niveau int(1),
	id_matiere int(1),
constraint PK_id_exercice primary key (id_exercice))
ENGINE=INNODB;


CREATE TABLE UTILISATEUR
(
	id_utilisateur int(5) NOT NULL,
	mdp int(10) NOT NULL,
	nom varchar(25),
	prenom varchar(25),
	tel int(10),
	mail varchar(50),
constraint PK_id_utilisateur primary key (id_utilisateur))
ENGINE=INNODB;