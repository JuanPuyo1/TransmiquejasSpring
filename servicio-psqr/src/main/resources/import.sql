INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('100', 'Andres', 'Perez', 'aperez@gmail.com', NOW());
INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('200', 'Rocio', 'Angel', 'rangel@gmail.com', NOW());
INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('300', 'Jorge', 'Quintero', 'jquintero@gmail.com', NOW());
INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('400', 'Ana', 'Lozano', 'alozano@gmail.com', NOW());
INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('500', 'Pedro', 'Contreras', 'pcontreras@gmail.com', NOW());

INSERT INTO tipos_psqr(descripcion) VALUES ('Queja');
INSERT INTO tipos_psqr(descripcion) VALUES ('Reclamo');

INSERT INTO motivos(descripcion) VALUES ('Robo');
INSERT INTO motivos(descripcion) VALUES ('Choque');

INSERT INTO rutas(nombre_ruta) VALUES ('H75');
INSERT INTO rutas(nombre_ruta) VALUES ('C15');

INSERT INTO estaciones(nombre_estacion) VALUES ('Jimenez');
INSERT INTO estaciones(nombre_estacion) VALUES ('Aguas');

INSERT INTO estados(descripcion_estado) VALUES ('No respondido');
INSERT INTO estados(descripcion_estado) VALUES ('Respondido');


INSERT INTO psqr(create_at, pasajero_id,id_tipo,id_motivo,id_ruta,id_estacion,id_estado) VALUES(NOW(),2,1,1,1,1,1);
INSERT INTO psqr(create_at, pasajero_id,id_tipo,id_motivo,id_ruta,id_estacion,id_estado) VALUES(NOW(),2,2,2,1,1,1);