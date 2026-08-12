# ImobiGest — Gestão Imobiliária

![Java 17](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4-6DB33F?logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?logo=thymeleaf&logoColor=white)

Aplicação web para gerenciamento de imóveis, construída com Spring Boot e arquitetura MVC. O projeto aplica organização em camadas, validação de dados e persistência relacional.

> **Status:** projeto acadêmico em desenvolvimento.

## Funcionalidades implementadas

- cadastro de imóveis;
- listagem dinâmica;
- persistência em PostgreSQL;
- relacionamentos entre entidades com JPA;
- validação de dados;
- interface server-side com Thymeleaf.

## Stack

- Java 17
- Spring Boot 3.4
- Spring MVC
- Spring Data JPA
- Thymeleaf
- PostgreSQL
- Maven
- Lombok

## Arquitetura

~~~text
Controller
   ↓
Service
   ↓
Repository
   ↓
PostgreSQL
~~~

## Como executar

~~~bash
git clone https://github.com/arthur-amancio/Gestao-de-Imoveis.git
cd Gestao-de-Imoveis/gestao
mvn spring-boot:run
~~~

Configure previamente:

- DATABASE_URL
- PGUSER
- PGPASSWORD
- PORT, opcional

A aplicação usa a porta 8080 quando PORT não é informada.

## Próximas evoluções

- concluir atualização e exclusão do CRUD;
- adicionar autenticação e controle de acesso;
- criar filtros e paginação;
- implementar dashboard com métricas;
- ampliar validações e testes;
- preparar o deploy em nuvem.

## Autor

Desenvolvido por [Arthur Amancio Francisco](https://www.linkedin.com/in/arthur-amancio-francisco/) como projeto de estudo e portfólio.
