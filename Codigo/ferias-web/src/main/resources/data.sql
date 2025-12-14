INSERT INTO SERVIDOR (ID, CPF, NOME) VALUES
    (1, '12345678901', 'João Silva'),
    (2, '98765432100', 'Maria Oliveira'),
    (3, '45678912300', 'Carlos Santos');

INSERT INTO FERIAS (ID, DESCRICAO, DT_INICIAL, DT_FINAL, STATUS, ID_SERVIDOR) VALUES
    (1, 'Férias Janeiro', '2025-01-10', '2025-01-25', 'A', 1),
    (2, 'Férias Fevereiro', '2025-02-05', '2025-02-20', 'F', 2),
    (3, 'Férias Março', '2025-03-01', '2025-03-15', 'F', 3);

INSERT INTO LOCAL (ID, DESCRICAO, DT_INICIAL, DT_FINAL, PAIS, REGIAO, ID_FERIAS) VALUES
    (1, 'Praia', '2025-01-10', '2025-01-25', 'Brasil', 'Nordeste', 1),
    (2, 'Serra', '2025-02-05', '2025-02-20', 'Brasil', 'Sul', 2),
    (3, 'Exterior', '2025-03-01', '2025-03-15', 'Chile', 'América do Sul', 3),
    (4, 'Exterior', '2025-03-01', '2025-03-15', 'Peru', 'América do Sul', 3);

INSERT INTO PAGAMENTO (ID, DT, TIPO, VALOR, ID_FERIAS) VALUES
    (1, '2025-01-05', 'P', 2500.00, 1),
    (2, '2025-02-01', 'CD', 3000.00, 2),
    (3, '2025-02-25', 'CC', 2800.00, 3);
