CREATE TABLE titulo_categoria (
                                titulo_id INT,
                                categoria_id INT,
                                FOREIGN KEY (titulo_id) REFERENCES titulos(id),
                                FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);