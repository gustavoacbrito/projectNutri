
# API Rest Java com Spring Boot - Nutrição

Este projeto consiste em uma API Restful desenvolvida em Java com o framework Spring Boot. O objetivo principal é fornecer uma solução para o cadastro de pacientes, armazenamento de dados de avaliações nutricionais e geração de resultados para avaliação dos pacientes. Através desse sistema, busca-se facilitar e aprimorar o trabalho da nutricionista, proporcionando uma plataforma eficiente e confiável para a gestão de informações e o acompanhamento dos pacientes.
 
## ✅Pré-requisitos

Certifique-se de ter os seguintes requisitos instalados em seu sistema:

- Java JDK 17
- Gradle 7.0 ou superior
- MySQL

## Configuração do banco de dados

O banco de dados utilizado neste projeto é o MySQL. Antes de executar a aplicação, é necessário criar um banco de dados e configurar as informações de conexão no arquivo `application.properties`.

## Executando a aplicação

Para executar a aplicação, siga os passos abaixo:

1. Clone este repositório para o seu ambiente local.
2. Navegue até o diretório raiz do projeto.
3. Abra um terminal e execute o seguinte comando para iniciar a aplicação: `gradlebootRun` 
4. A aplicação será executada e estará disponível no endereço `http://localhost:8080`.

## Endpoints Disponíveis

| Método | Endpoint                                | Descrição                                       |
| ------ | --------------------------------------- | ----------------------------------------------- |
| GET    | `/pacientes`                            | Retorna a lista de todos os pacientes           |
| GET    | `/pacientes/paciente/{nome}`             | Busca pacientes cujo nome contenha o valor      |
| GET    | `/pacientes/{id}`                        | Retorna os detalhes de um paciente específico   |
| POST   | `/pacientes`                            | Adiciona um novo paciente                       |
| POST   | `/pacientes/lista`                       | Adiciona uma lista de pacientes                 |
| PUT    | `/pacientes/{id}`                        | Atualiza os dados de um paciente específico     |
| DELETE | `/pacientes/{id}`                        | Deleta um paciente do sistema                   |



## Contribuição

Se você deseja contribuir com este projeto, fique à vontade para abrir uma pull request. Todas as contribuições serão bem-vindas!

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).

