# 🏢 ImobiGest - Sistema de Gestão Imobiliária

> ⚠️ **Projeto em desenvolvimento ativo**  
> Este sistema está em evolução contínua e novas funcionalidades estão sendo implementadas progressivamente.

---

## 📌 Sobre o Projeto

O **ImobiGest** é uma aplicação web para gerenciamento de imóveis, desenvolvida com Spring Boot utilizando arquitetura MVC.

O objetivo do projeto é simular um sistema real de gestão imobiliária, aplicando boas práticas de desenvolvimento backend, organização em camadas e integração com frontend via Thymeleaf.

Atualmente o sistema permite:

- Cadastro de imóveis
- Listagem dinâmica de imóveis
- Persistência em banco de dados
- Relacionamento entre entidades

Novas funcionalidades estão sendo planejadas e implementadas.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- Maven
- H2 / MySQL

---

## 🏗 Arquitetura

O projeto segue o padrão **MVC (Model-View-Controller)**:

Controller  
→ Camada responsável por receber e tratar requisições HTTP  

Service  
→ Camada de regra de negócio  

Repository  
→ Camada de acesso a dados (Spring Data JPA)  

Entity  
→ Modelo de domínio mapeado com JPA  

Templates  
→ Interface construída com Thymeleaf  

---

## 🏠 Funcionalidades Implementadas

- ✅ Cadastro de imóveis
- ✅ Listagem dinâmica de imóveis
- ✅ Enum persistido como STRING
- ✅ Relacionamento `@ManyToOne`
- ✅ Estrutura preparada para CRUD completo

---

## 🔄 Roadmap (Em Desenvolvimento)

Próximas evoluções planejadas:

- Implementar atualização e exclusão completas
- Dashboard com métricas dinâmicas
- Autenticação e controle de acesso
- Paginação e filtros
- Validações com Bean Validation
- API REST paralela
- Deploy em ambiente cloud
