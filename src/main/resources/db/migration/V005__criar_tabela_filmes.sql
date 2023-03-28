CREATE TABLE filmes (
                        id INT NOT NULL AUTO_INCREMENT,
                        titulo VARCHAR(255) NOT NULL,
                        descricao TEXT,
                        lancamento DATE,
                        duracao TIME,
                        classificacao_indicativa VARCHAR(5),
                        PRIMARY KEY (id)
);
