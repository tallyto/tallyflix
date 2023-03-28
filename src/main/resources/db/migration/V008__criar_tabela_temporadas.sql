CREATE TABLE temporadas (
                            id INT NOT NULL AUTO_INCREMENT,
                            numero INT NOT NULL,
                            serie_id INT,
                            PRIMARY KEY (id),
                            FOREIGN KEY (serie_id) REFERENCES series(id)
);
