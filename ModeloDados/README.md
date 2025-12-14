# DD

### Servidor

| Campo | Tipo   | PK | UNIQUE KEY | FK | Null |
|-------|--------|----|------------|----|------|
| id    | Long   | *  |            |    |      |
| nome  | String |    |            |    |      |
| cpf   | String |    | *          |    |      |

---

### Ferias

| Campo        | Tipo                           | PK | UNIQUE KEY | FK | Null | Descrição |
|--------------|--------------------------------|----|------------|----|------|-----------|
| id           | Long                           | *  |            |    |      |           |
| dataInicial  | LocalDateTime                  |    |            |    |      |           |
| dataFinal    | LocalDateTime                  |    |            |    |      |           |
| status       | enum("C","A","E","D")          |    |            |    |      | Cancela, agendada, em andamento e concluída. |
| descricao    | String                         |    |            |    | *    |           |
| id_servidor  | Long                           |    |            | *  |      |           |

---

### Local

| Campo        | Tipo           | PK | UNIQUE KEY | FK | Null | Descrição |
|--------------|----------------|----|------------|----|------|-----------|
| id           | Long           | *  |            |    |      |           |
| pais         | String         |    |            |    |      |           |
| regiao       | String         |    |            |    |      | Cidade, estado, província... |
| dataInicial  | LocalDateTime  |    |            |    |      |           |
| dataFinal    | LocalDateTime  |    |            |    |      |           |
| descricao    | String         |    |            |    | *    |           |
| id_ferias    | Long           |    |            | *  |      |           |

---

### Pagamento

| Campo      | Tipo        | PK | UNIQUE KEY | FK | Null | Descrição |
|------------|-------------|----|------------|----|------|-----------|
| id         | Long        | *  |            |    |      |           |
| valor      | BigDecimal  |    |            |    |      |           |
| data       | LocalDate   |    |            |    |      |           |
| tipo       | enum("P", "CC", "CD", "D")        |    |            |    |      | Pix, cartão de crédito, cartão de débito e dinheiro. |
| descricao  | String      |    |            |    | *    |           |
| feriasId   | Long        |    |            | *  |      |           |

### Cardinalidades

- Um servidor pode estar associado a várias férias (1:N);
- Uma férias pode estar associada a um ou vários locais (1:N);
- Uma férias pode estar associada a nenhum ou vários pagamentos (0:N);
- Um pagamento pode estar associado somente a uma férias (N:1);
- Um local pode estar associado somente a uma férias (N:1).
