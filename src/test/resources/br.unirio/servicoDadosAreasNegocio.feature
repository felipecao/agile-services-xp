#language: pt

Funcionalidade: Servico de Dados - Areas de Negocio

Como um fiscal de obras em campo
Eu quero ter um servico de dados de areas de negocio
Para poder selecionar uma obra e informar seus dados

Cenario: Busca de todas as areas de negocio
Dado que o cadastro das areas de negocio da Petrobras contem as areas "AREA 1" e "AREA 2"
Quando eu invocar o servico para recuperar as areas de negocio
Entao o resultado tem tamanho "2"
E contem somente as areas "AREA 1" e "AREA 2"