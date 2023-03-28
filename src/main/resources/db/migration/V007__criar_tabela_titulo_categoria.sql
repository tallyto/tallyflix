CREATE TABLE titulo_categoria (
                                filme_id INT,
                                categoria_id INT,
                                serie_id INT,
                                FOREIGN KEY (filme_id) REFERENCES filmes(id),
                                FOREIGN KEY (categoria_id) REFERENCES categorias(id),
                                FOREIGN KEY (serie_id) REFERENCES series(id)
);
