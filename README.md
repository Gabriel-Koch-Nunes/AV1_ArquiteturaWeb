# Projeto: Gerenciador de Produtos e Categorias

Este projeto é uma API REST desenvolvida com **Spring Boot**, utilizando **MariaDB** como banco de dados relacional. A aplicação gerencia o relacionamento entre duas entidades: `Produto` e `Categoria`, com operações completas de CRUD.

---

##  Tecnologias Utilizadas

- Java 17
- Spring Boot 
- Spring Data JPA
- MariaDB
- Lombok
- Spring DevTools

---

## 🔗 Relacionamento entre Entidades

- Uma **Categoria** pode conter vários **Produtos** (`@OneToMany`)
- Um **Produto** pertence a uma única **Categoria** (`@ManyToOne`)

---

## ⚙️ Configuração do Banco de Dados (MariaDB)

### 1. Instalação do MariaDB

No Windows:
- Baixe o instalador em: https://mariadb.org/download/
- Durante a instalação, defina:
  - Usuário: `root`
  - Senha: 

No Linux:
```bash
sudo apt update
sudo apt install mariadb-server
sudo mysql_secure_installation
```

### 2. Criar o banco de dados

Após instalar, execute:

```sql
CREATE DATABASE produtodb;
```

---

##  Configurações no `application.properties`

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/produtodb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
```

---

## ▶ Como Rodar o Projeto

1. Clone o repositório ou extraia o `.zip`
2. Abra o projeto em uma IDE como IntelliJ ou VS Code
3. Verifique se o MariaDB está rodando
4. Execute a aplicação com:

```bash
./mvnw spring-boot:run
```

Ou diretamente pela IDE com o botão de **Run**

---

##  Testar os Endpoints

Use o Postman, Insomnia ou cURL. Abaixo, exemplos:

### 🔹 Categorias

- **GET** `/categorias`
- **POST** `/categorias`
```json
{
  "nome": "Celular",
  "descricao": "Produto eletrônico"
}
```

- **PUT** `/categorias/{id}`
- **DELETE** `/categorias/{id}`

### 🔹 Produtos

- **GET** `/produtos`
- **POST** `/produtos`
```json
{
  "nome": "Iphone 13",
  "descricao": "Smartphone",
  "preco": 4500,
  "categoria": {
    "id": 1
  }
}
```

- **PUT** `/produtos/{id}`
- **DELETE** `/produtos/{id}`

---

##  Status da Implementação

- [x] Relacionamento entre entidades configurado corretamente com JPA
- [x] Repositórios com `JpaRepository`
- [x] Serviços com regras de negócio e tratamento de exceções
- [x] Controllers REST completos para CRUD
- [x] Banco de dados persistindo corretamente com MariaDB
- [x] Uso de Lombok para reduzir boilerplate
- [x] Código limpo e separado por camadas

---

## 👨‍💻 Desenvolvido por
Gabriel Koch
