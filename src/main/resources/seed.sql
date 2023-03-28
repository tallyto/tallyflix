DELETE FROM series;

DELETE FROM produtoras;


INSERT INTO produtoras (id, nome, pais_origem) VALUES (1, 'Netflix', 'Estados Unidos');
INSERT INTO produtoras (id, nome, pais_origem) VALUES (2, 'HBO', 'Estados Unidos');
INSERT INTO produtoras (id, nome, pais_origem) VALUES (3, 'BBC', 'Reino Unido');
INSERT INTO series (id,titulo, sinopse, classificacao_etaria, produtora_id) VALUES (1,'Stranger Things', 'Quando um jovem desaparece, sua mãe, um chefe de polícia e seus amigos devem confrontar forças sobrenaturais aterrorizantes para recuperá-lo.', 16, 1);
INSERT INTO series (id,titulo, sinopse, classificacao_etaria, produtora_id) VALUES (2,'Breaking Bad', 'Um professor de química do ensino médio diagnosticado com câncer de pulmão inoperável se volta para a fabricação e venda de metanfetamina para garantir o futuro de sua família.', 18, 2);
INSERT INTO series (id,titulo, sinopse, classificacao_etaria, produtora_id) VALUES (3,'Game of Thrones','Nove famílias nobres lutam pelo controle das terras de Westeros, enquanto um antigo inimigo retorna após estar adormecido por milênios.', 18, 3);
