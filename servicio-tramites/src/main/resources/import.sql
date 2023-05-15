
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

INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('100', 'Andres', 'Perez', 'aperez@gmail.com', NOW());
INSERT INTO pasajeros(codigo, nombre, apellido, email, create_at ) VALUES('200', 'Rocio', 'Angel', 'rangel@gmail.com', NOW());

INSERT INTO psqr(create_at, pasajero_id,id_tipo,id_motivo,id_ruta,id_estacion,id_estado) VALUES(NOW(),2,1,1,1,1,1);
INSERT INTO psqr(create_at, pasajero_id,id_tipo,id_motivo,id_ruta,id_estacion,id_estado) VALUES(NOW(),2,2,2,1,1,2);

INSERT INTO tramitadores(codigo, nombre, apellido, email, create_at, id_tipo) VALUES('100', 'Andres', 'Perez', 'aperez@gmail.com', NOW(),2);
INSERT INTO tramitadores(codigo, nombre, apellido, email, create_at, id_tipo) VALUES('200', 'Rocio', 'Angel', 'rangel@gmail.com', NOW(),1);

INSERT INTO asesores(codigo, nombre, apellido, email, create_at,id_tramitador) VALUES('200', 'Rocio', 'Angel', 'rangel@gmail.com', NOW(),1);
INSERT INTO asesores(codigo, nombre, apellido, email, create_at,id_tramitador) VALUES('300', 'Alejandra', 'Rocha', 'rocha@gmail.com', NOW(),1);

INSERT INTO asesor_psqr(id_asesor,id_psqr) VALUES (1,1);

INSERT INTO respuestas(Respuesta,create_at, psqr_id) VALUES ('En este caso comuniquese con la policia', NOW(), 2);

INSERT INTO calificaciones(detalle,id_respuesta) VALUES ('Excelente',1);