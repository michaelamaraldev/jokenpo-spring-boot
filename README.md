# Jokenpô - API REST com Java e Spring Boot

![Java](https://img.shields.io/badge/Java-21-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green.svg)
![Maven](https://img.shields.io/badge/Maven-4.0-red.svg)

## 📖 Sobre o Projeto

Esta é uma API RESTful para um jogo de **Jokenpô** (Pedra, Papel e Tesoura).

A API foi projetada para ser consumida por um front-end, gerenciando toda a lógica e o estado do jogo no lado do servidor.

## ✨ Funcionalidades

-   Inicia uma nova sessão de jogo para um jogador.
-   Permite que o jogador faça uma jogada (`PEDRA`, `PAPEL` ou `TESOURA`).
-   Gera uma jogada aleatória para o computador.
-   Compara as jogadas e determina o vencedor de cada rodada.
-   Mantém um placar de vitórias entre o jogador e o computador.
-   Permite iniciar uma nova rodada, mantendo o placar geral.

## 🛠️ Tecnologias

-   **Java 21+**
-   **Spring Boot**
-   **Spring Web**
-   **Maven** para gerenciamento de dependências

## 🔌 Endpoints da API

A URL base para todos os endpoints é `http://localhost:8080/api/game`.

| Endpoint          | Método | Descrição                                    | Parâmetros / Corpo (Body) da Requisição      |
| ----------------- | ------ | ---------------------------------------------- | --------------------------------------------- |
| `/start`          | `POST` | Inicia um novo jogo e define o nome do jogador. | Parâmetro de URL: `?nomeJogador=Michael`      |
| `/jogada`         | `POST` | Envia a jogada do jogador e obtém o resultado. | Corpo JSON: `{ "jogada": "PEDRA" }`           |
| `/nova-rodada`    | `POST` | Reseta o estado da rodada para jogar novamente. | N/A                                           |
| `/status`         | `GET`  | Retorna o placar atual do jogo.                | N/A                                           |

## 🚀 Como Executar Localmente

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    ```
2.  **Navegue até a pasta do projeto:**
    ```bash
    cd seu-repositorio
    ```
3.  **Execute a aplicação com o Maven Wrapper:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A API estará disponível em http://localhost:8080. Você pode usar o Postman (como eu usei) ou outra ferramenta para testar os endpoints. :)

5.  Muito obrigado!!!
