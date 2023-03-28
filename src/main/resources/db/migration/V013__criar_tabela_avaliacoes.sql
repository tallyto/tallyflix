CREATE TABLE avaliacoes (
                            id INT NOT NULL AUTO_INCREMENT,
                            usuario_id INT,
                            filme_id INT,
                            serie_id INT,
                            pontuacao INT,
                            comentario TEXT,
                            PRIMARY KEY (id),
                            FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
                            FOREIGN KEY (filme_id) REFERENCES filmes(id),
                            FOREIGN KEY (serie_id) REFERENCES series(id)
);
