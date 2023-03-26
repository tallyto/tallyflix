CREATE TABLE titulos (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(100) NOT NULL,
                        sinopse TEXT,
                        data_lancamento DATE,
                        produtora_id INT,
                        FOREIGN KEY (produtora_id) REFERENCES produtoras(id)
);
