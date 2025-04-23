# AV1_ArquiteturaWeb
Este projeto é uma API REST desenvolvida com Spring Boot, utilizando MariaDB como banco de dados relacional. A
aplicação gerencia o relacionamento entre duas entidades: Produto e Categoria, com operações completas de CRUD.
Tecnologias Utilizadas:
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MariaDB
- Lombok
- Spring DevTools
Relacionamento entre Entidades:
- Uma Categoria pode conter vários Produtos (@OneToMany)
- Um Produto pertence a uma única Categoria (@ManyToOne)
Configuração do Banco de Dados (MariaDB):
1. Instale o MariaDB:
 - Windows: https://mariadb.org/download/

 2. Crie o banco de dados:
 CREATE DATABASE produtodb;
Configurações no application.properties:
spring.datasource.url=jdbc:mariadb://localhost:3306/produtodb
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
Como Rodar o Projeto:
1. Abra na IDE
2. Execute com ./mvnw spring-boot:run ou pelo botão Run
Testar os Endpoints:
Categorias:
- GET /categorias
- POST /categorias
 {
 "nome": "Eletrônicos",
 "descricao": "Produtos eletrônicos em geral"
 }
Produtos:
- GET /produtos
- POST /produtos
 {
 "nome": "Notebook",
 "descricao": "Notebook gamer",
 "preco": 4500,
 "categoria": { "id": 1 }
 }
Status da Implementação:
[x] Relacionamento com JPA
[x] Repositórios com JpaRepository
[x] CRUD completo com controllers e services
[x] Lombok aplicado
[x] Banco funcionando com MariaDB
Desenvolvido por: Gabriel Koch
