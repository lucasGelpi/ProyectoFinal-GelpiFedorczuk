INSERT INTO CLIENTE
(dni, nombre, apellido, fecha_Nacimiento)
values
(33982460, 'Juan', 'Perez', '1990-04-03'),
(33562460, 'Azucena', 'García', '1988-11-04'),
(33982831, 'Ibrian', 'Festorazzi', '2003-08-23'),
(12482460, 'Serafin' , 'Lopez', '1992-09-11');

INSERT INTO PRODUCTO
(producto_Id, stock, descripcion, precio)
values
(501, 20, 'Remera Azul', 4500),
(502, 20, 'Pantalon Celeste', 7000),
(503, 20, 'Pantalon Verde', 7500),
(504, 20, 'Campera Negra', 15000);

INSERT INTO COMPROBANTE
(comprobante_Id, fecha_Compra, cantidad, total_Compra)
values
(101, '2022-12-03', 3, 14000),
(102, '2022-03-22', 2, 12530),
(103, '2022-05-18', 4, 23800),
(104, '2022-11-12', 7, 32745);