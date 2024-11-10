
# Spring User API com JUnit e Mockito

Este projecto é uma API de utilizadores desenvolvida com **Spring Boot**, utilizando **JUnit 5** para testes unitários, **Mockito** para mocks em testes, **JPA** para persistência de dados, **H2** como base de dados em memória, e uma **arquitectura limpa** que facilita a manutenção e o crescimento do código.

## Estrutura do Projecto

Abaixo está a estrutura do projecto, organizada para uma clara separação de responsabilidades e aplicando os princípios de arquitectura limpa:

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ucan
│   │   │       └── edu
│   │   │           └── userapi
│   │   │               ├── App.java                   # Classe principal para inicialização do Spring Boot
│   │   │               ├── config                     # Configurações da aplicação
│   │   │               │   ├── LocalConfig.java
│   │   │               │   └── ModelMapperConfig.java
│   │   │               ├── domain                     # Camada de domínio
│   │   │               │   ├── dto
│   │   │               │   │   └── UserDTO.java       # DTO para transferência de dados do utilizador
│   │   │               │   └── User.java              # Entidade de utilizador
│   │   │               ├── repositories               # Interfaces para a camada de persistência
│   │   │               │   └── UserRepository.java
│   │   │               ├── resources                  # Controladores e tratadores de excepções
│   │   │               │   ├── exceptions
│   │   │               │   │   ├── ResourceEcxeptionHandler.java
│   │   │               │   │   └── StandardError.java
│   │   │               │   └── UserResource.java      # Controlador REST de utilizador
│   │   │               └── services                   # Lógica de negócio e excepções de serviço
│   │   │                   ├── exceptions
│   │   │                   │   ├── DataIntegratyViolationException.java
│   │   │                   │   └── ObjectNotFoundException.java
│   │   │                   ├── impl
│   │   │                   │   └── UserServiceImpl.java
│   │   │                   └── UserService.java
│   │   └── resources
```

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** - estruturação do projecto e criação da API REST
- **JPA/Hibernate** - mapeamento objecto-relacional
- **H2 Database** - base de dados em memória para ambiente de desenvolvimento e testes
- **JUnit 5** - criação e execução de testes unitários
- **Mockito** - criação de mocks e simulação de dependências em testes

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/amarildomiguel/spring-user-api-junit-mockito.git
   ```
2. Navegue até o directório do projecto:
   ```bash
   cd spring-user-api-junit-mockito
   ```
3. Compile o projecto:
   ```bash
   ./mvnw clean install
   ```

## Executar a Aplicação

Para iniciar a aplicação com o servidor embutido do Spring Boot, execute o seguinte comando:

```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

## Executar os Testes

Para rodar os testes unitários utilizando **JUnit 5** e **Mockito**, execute:

```bash
./mvnw test
```

## Endpoints da API

Abaixo estão alguns exemplos de endpoints disponíveis na API:

- **GET /api/users** - Retorna a lista de utilizadores.
- **POST /api/users** - Cria um novo utilizador.
- **GET /api/users/{id}** - Retorna um utilizador específico.
- **PUT /api/users/{id}** - Actualiza um utilizador existente.
- **DELETE /api/users/{id}** - Remove um utilizador.

## Base de Dados

O projecto utiliza o **H2 Database** como base de dados em memória, que é inicializada automaticamente com dados de teste ao iniciar a aplicação. Para aceder à consola do H2, utilize:

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: 
