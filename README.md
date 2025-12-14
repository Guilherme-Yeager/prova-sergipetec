# FeriasApi

### Endpoints

- GET servidores/{id}/ferias — Retorna todas as férias cadastradas de um servidor específico
- GET /ferias/{id} — Retorna uma férias por id
- GET /locais — Retorna todos os "países " e "datas iniciais" de todos os locais cadastrados

### Sobre o banco - banco de dados em memória (H2)
O sistema utiliza o **H2 em modo in-memory**, o que significa que:
- Os dados existem apenas enquanto a aplicação está em execução;
- Não é necessário instalar nenhum banco de dados externo;
- O banco é recriado a cada inicialização da aplicação.

O console web do H2 pode ser acessada em:
- `/h2-console`

---

### Inicialização de Dados
O projeto possui um arquivo **`ferias-web/src/main/resources/data.sql`**, responsável por **inserir dados iniciais** no banco de dados no momento em que a aplicação é iniciada.  
Isso facilita testes e validações, permitindo que o sistema já comece com registros previamente cadastrados, sem a necessidade de inserções manuais.

###  Subir com Docker

```bash
cd codigo/ferias-web/

# Windows
mvnw.cmd clean package

# Linux / macOS
./mvnw clean package

docker compose up --build
```

API disponível em: http://localhost:8080 <br>
Console H2-db disponível em: http://localhost:8080/h2-console
