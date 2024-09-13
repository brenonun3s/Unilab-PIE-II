-- Banco de Dados em Teste, fiz uma modelagem básica mas ainda estou verificando

CREATE TABLE usuario (
    id INT AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    PRIMARY KEY (id)
);

INSERT INTO usuario (nome, email)
VALUES ('Breno', 'breno@example.com');

CREATE TABLE agendamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(100),
    status ENUM('Aguardando', 'Confirmado', 'Cancelado') DEFAULT 'Aguardando',
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

SELECT * FROM usuario;
SELECT * FROM agendamento;

