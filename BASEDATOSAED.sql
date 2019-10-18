DROP DATABASE IF EXISTS db_bricolaje;

CREATE DATABASE db_bricolaje;

USE db_bricolaje;

CREATE TABLE piezas(
clave CHAR(3) PRIMARY KEY,
descripcion VARCHAR(30),
precio FLOAT(10,2)
);

CREATE TABLE almacenes(
numero INT PRIMARY KEY AUTO_INCREMENT,
descripcion VARCHAR(30),
direccion VARCHAR(30)
);

CREATE TABLE estanterias(
nombre CHAR(3) NOT NULL,
num_almacen INT NOT NULL, 
FOREIGN KEY (num_almacen) REFERENCES almacenes(numero)
ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(nombre, num_almacen)
);

CREATE TABLE se_almacenan(
cantidad INT,
nom_estanteria CHAR(3) NOT NULL,
clave_pieza CHAR(3) NOT NULL,
num_almacen INT NOT NULL,
FOREIGN KEY(nom_estanteria) REFERENCES estanterias(nombre)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(num_almacen) REFERENCES estanterias(num_almacen)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(clave_pieza) REFERENCES piezas(clave)
ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(clave_pieza, nom_estanteria, num_almacen)
);

CREATE TABLE compone(
clave_componente CHAR(3) NOT NULL,
clave_pieza CHAR(3) NOT NULL,

FOREIGN KEY(clave_componente) REFERENCES piezas(clave)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(clave_pieza) REFERENCES piezas(clave)
ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(clave_componente, clave_pieza)
);

INSERT INTO piezas VALUES ("TU1","TUERCA 1MM","12.2"),
						  ("BI5","BISAGRA 5","5"),
                          ("CE7","CERRADURA 7 DIENTES","50"),
                          ("TM2","TABLA MADERA 2 M","20"),
                          ("PU1","PUERTA ESTILO 1","200");
                          
                           
INSERT INTO almacenes VALUES (null,"Almacen Principal","C/ Malteser EL Portiño 47"),
							(null,"Almacen Vegueta","C/ Vegetta 777");
                            
INSERT INTO estanterias(nombre,num_almacen) VALUES ("AKR","1"),
													("DHK","1"),
													("LAT","2"),
													("ORM","2");
											
INSERT INTO compone VALUES ("CE7", "TU1"),
("TU1", "CE7");
                                                    




