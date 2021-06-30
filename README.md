# Aula 1 - Introdução a Spring - TT

## Prática Complementar - Cenário REST

Este repositório contém um esboço para um cenário REST no qual deseja-se armazenar, alterar, excluir Carros de um "banco de dados" (ainda feito de maneira estática).

O sistema armazena o modelo, a marca e o ano de um carro em um Map que simula uma tabela no banco.

O sistema roda na porta 8080

- GET ````(/aula1/tt/car)````
  - retorna uma lista com todos os carros

- GET ````(/aula1/tt/car/{id})````
  - retorna um carro a partir de seu id

- POST ````(/aula1/tt/car)````
  - Adiciona um carro ao "banco de dados"
  - Body request
  ````
  {
    "modelo": "String",
    "marca": "String",
    "ano": Integer
  }
  ````
  
- PUT ````(/aula1/tt/car/{id})````
  - Altera um carro já existente no "banco" através do seu id
  - Body request
  ````
  {
    "modelo": "String",
    "marca": "String",
    "ano": Integer
  }
  ````
  
- DELETE ````(/aula1/tt/car/{id})````
  - remove um carro a partir do seu id e o retorna
