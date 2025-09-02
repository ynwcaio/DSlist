# Projeto `dev`
---

## Tecnologias Usadas

* **Java 21**: A linguagem de programação do projeto.
* **Spring Boot 3.5.4**: A principal ferramenta para criar a aplicação.
* **Spring Data JPA**: Uma ferramenta que ajuda a mexer com bancos de dados de um jeito mais fácil.
* **Spring Web**: Uma ferramenta para criar APIs REST (tipo um sistema que se comunica com outros sistemas).
* **PostgreSQL**: O banco de dados que o projeto usa.
* **H2 Database**: Um banco de dados em memória, que é ótimo para testar o projeto sem precisar de uma instalação completa.

---

## Como Rodar o Projeto

1.  **Pré-requisitos**:
    * **Java JDK 21** instalado na sua máquina.
    * **Maven** instalado.

2.  **Passo a passo**:
    * Abra o terminal na pasta do projeto.
    * Execute o seguinte comando para rodar o projeto:
        ```bash
        mvn spring-boot:run
        ```

3.  **Observação**:
    * Se você quiser usar o PostgreSQL, você precisa configurar a conexão no arquivo `application.properties` ou `application.yml`, que fica na pasta `src/main/resources`.
