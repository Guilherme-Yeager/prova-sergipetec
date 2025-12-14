# FeriasApi

### Endpoints

- GET servidores/{id}/ferias — Retorna todas as férias cadastradas de um servidor específico
- GET /ferias/{id} — Retorna uma férias por id
- GET /locais — Retorna todos os "países " e "datas iniciais" de todos os locais cadastrados

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
