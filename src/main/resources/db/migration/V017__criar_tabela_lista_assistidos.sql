CREATE TABLE lista_assistidos (
                                  id INT NOT NULL AUTO_INCREMENT,
                                  usuario_id INT,
                                  filme_id INT,
                                  serie_id INT,
                                  episodio_id INT,
                                  tempo_assistido TIME,
                                  PRIMARY KEY (id),
                                  FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
                                  FOREIGN KEY (filme_id) REFERENCES filmes(id),
                                  FOREIGN KEY (serie_id) REFERENCES series(id),
                                  FOREIGN KEY (episodio_id) REFERENCES episodios(id)
);
