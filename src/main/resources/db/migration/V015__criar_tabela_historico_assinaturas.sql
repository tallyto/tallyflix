CREATE TABLE historico_assinaturas (
                                       id INT NOT NULL AUTO_INCREMENT,
                                       usuario_id INT,
                                       tipo VARCHAR(255) NOT NULL,
                                       data_inicio DATE NOT NULL,
                                       data_fim DATE NOT NULL,
                                       valor DECIMAL(10,2),
                                       PRIMARY KEY (id),
                                       FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
