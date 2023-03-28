CREATE TABLE series (
                        id INT NOT NULL AUTO_INCREMENT,
                        titulo VARCHAR(255) NOT NULL,
                        sinopse TEXT,
                        classificacao_etaria INT,
                        produtora_id INT,
                        PRIMARY KEY (id),
                        FOREIGN KEY (produtora_id) REFERENCES produtoras(id)
);
