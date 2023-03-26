CREATE TABLE usuarios (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          nome VARCHAR(100) NOT NULL,
                          email VARCHAR(100) UNIQUE NOT NULL,
                          senha VARCHAR(255) NOT NULL,
                          data_nascimento DATE,
                          endereco VARCHAR(255),
                          plano_id INT,
                          FOREIGN KEY (plano_id) REFERENCES planos(id)
);
