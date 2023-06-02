# Restaurante API

API para expor um CRUD de um domínio de Restaurante.

### Features

- [x] Cadastrar restaurantes no banco de dados
- [x] Visualizar todos os restaurantes do banco de dados
- [x] Visualizar um restaurante específico já salvo no banco de dados
- [x] Atualizar um restaurante já salvo no banco de dados
- [x] Deletar um restaurante já salvo no banco de dados
- [x] Cadastrar produtos no banco de dados
- [x] Visualizar todos os produtos do banco de dados
- [x] Visualizar um produto específico já salvo no banco de dados
- [x] Atualizar um produto já salvo no banco de dados
- [x] Deletar um produto já salvo no banco de dados

### Tecnologias e Ferramentas Utilizadas

| Ferramenta        | Versão   |
|-------------------|----------|
| Java JDK          | 17       |
| Git               | 2.**     |
| Gradle            | 7.**     |
| Postman           | 9.**     |

| Dependência                    | Versão                  |
|--------------------------------|-------------------------|
| spring initialzr               | [https://start.spring.io/](https://start.spring.io/) |
| spring-boot-starter-web        | 2.7.3                   |
| spring-boot-starter-data-jpa   | 2.7.3                   |
| lombok                         | 1.18.24                 |
| springfox-boot-starter         | 3.0.0                   |
| h2                             | 2.1.214                 |

**Observação:** Visando facilitar a demonstração da aplicação, é recomendado instalar apenas o IntelliJ IDEA e rodar o projeto através da IDE.

### Executando a Aplicação

No Terminal/Console:

1. Faça um clone do projeto na sua máquina: `git clone https://github.com/cami-la/restaurante-api.git`
2. Entre na pasta raiz do projeto: `cd restaurante-api`
3. Execute o comando: `./gradlew bootrun`
4. Com a aplicação em execução, acesse: [http://localhost:8081/swagger-ui/](http://localhost:8081/swagger-ui/)

![Restaurante API Swagger UI](https://i.imgur.com/pfubmkj.png)
