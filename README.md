# CRUD de Usuários – Spring Boot + Swagger

Projeto **CRUD de Usuários** desenvolvido com **Spring Boot** no backend, com o objetivo de demonstrar fundamentos de desenvolvimento backend via API REST.

Este projeto foi criado com foco em **aprendizado prático** e preparação para **vagas júnior** em desenvolvimento Java.

---

## 🛠️ Tecnologias Utilizadas

### Documentação

* Swagger (Springdoc OpenAPI)

### Backend

* Java 21
* Spring web
* Spring Data JPA
* Spring Devtools
* MySQL
* Maven

  
---

## 📌 Funcionalidades

* Documentação automática da API com Swagger UI

* Criar usuário (nome e email)

* Listar usuários

* Atualizar usuário por ID

* Deletar usuário por ID

* Validação de email único


---

## 📂 Estrutura do Projeto

### Backend (Spring Boot)

```
src/main/java/com/misael/costa/CrudUsuarios
 ├── controller
 ├── service
 ├── repository
 └── entity
```

---

## 🚀 Como Executar o Projeto

### 📄 Documentação da API (Swagger)

Após iniciar o backend, a documentação da API estará disponível em:

```
http://localhost:8080/swagger-ui.html
```

ou

```
http://localhost:8080/swagger-ui/index.html
```

Através do Swagger é possível:

* Visualizar todos os endpoints
* Testar requisições diretamente no navegador
* Ver modelos de dados (Schemas)

---


### 1️⃣ Backend

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Configure o banco MySQL no `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/crud_usuarios
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.ddl-auto=update
spring.jpa.shows-sql=true

```

3. Execute o projeto Spring Boot.

O backend ficará disponível em:

```
http://localhost:8080/user
```

---

## 🔗 Endpoints da API

| Método | Endpoint       | Descrição         |
| ------ | -------------- | ----------------- |
| POST   | `/user/create` | Criar usuário     |
| GET    | `user/list`       | Listar usuários   |
| PUT    | `/user/{id}`   | Atualizar usuário |
| DELETE | `/user/{id}`   | Deletar usuário   |

---

## 🧪 Exemplo de JSON (POST / PUT)

```json
{
  "name": "joao",
  "email": "joao@gmail.com"
}
```

---

## 🧠 Conceitos Aplicados

* Arquitetura em camadas (Controller, Service, Repository)
* API REST
* Spring Data JPA
* Validação de dados
* Tratamento de erros
* Consumo de API com Fetch

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para:

* Consolidar fundamentos de Spring Boot
* Praticar CRUD real com banco de dados
* Servir como projeto de portfólio para vagas júnior

---

## 👨‍💻 Autor

**Misael Ferreira da Costa**
Estudante de Análise e Desenvolvimento de Sistemas
Foco em Backend Java | Spring Boot

---

## 📌 Observações
* Projeto incial ao longo do tempo teremos alteraçoes
* Ideal para estudos e demonstração em entrevistas
---

⭐ Se gostou do projeto, deixe uma estrela no repositório!

