CREATE TABLE planos (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(100) NOT NULL,
                        descricao TEXT,
                        preco DECIMAL(10, 2) NOT NULL
);