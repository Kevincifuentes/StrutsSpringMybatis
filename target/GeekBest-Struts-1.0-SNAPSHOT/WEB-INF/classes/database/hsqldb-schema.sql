CREATE TABLE EVENTOS(
    ID_EVENTO VARCHAR(10) NOT NULL,
    NOMBRE_EVENTO VARCHAR(100),
    DESCRIPCION_EVENTO VARCHAR(500),
    TIPO VARCHAR(100),
    FECHA TIMESTAMP,
PRIMARY KEY (ID_EVENTO));