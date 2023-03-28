CREATE TABLE episodios (
                           id INT NOT NULL AUTO_INCREMENT,
                           numero INT NOT NULL,
                           titulo VARCHAR(255) NOT NULL,
                           duracao TIME,
                           temporada_id INT,
                           PRIMARY KEY (id),
                           FOREIGN KEY (temporada_id) REFERENCES temporadas(id)
);
