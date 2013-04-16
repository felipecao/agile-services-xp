$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("br.unirio/calculadora.feature");
formatter.feature({
  "id": "calculadora",
  "description": "\nComo uma pessoa com contas a pagar\nEu quero usar uma calculadora\nPara que minhas contas sejam mais rapidas e precisas",
  "name": "Calculadora",
  "keyword": "Funcionalidade",
  "line": 3,
  "comments": [
    {
      "value": "#language: pt",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "calculadora;soma-basica",
  "description": "",
  "name": "Soma basica",
  "keyword": "Cenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "que eu quero somar \"6\" e \"8\"",
  "keyword": "Dado ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 20
    },
    {
      "val": "8",
      "offset": 26
    }
  ],
  "location": "CalculadoraSteps.que_eu_quero_somar(Integer,Integer)"
});
formatter.result({
  "duration": 84242000,
  "status": "passed"
});
formatter.step({
  "name": "eu informo os parametros usando o operador mais",
  "keyword": "Quando ",
  "line": 11
});
formatter.match({
  "location": "CalculadoraSteps.eu_informo_os_parametros_usando_o_operador_mais()"
});
formatter.result({
  "duration": 11000,
  "status": "passed"
});
formatter.step({
  "name": "o resultado deve ser \"14\"",
  "keyword": "Entao ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "14",
      "offset": 22
    }
  ],
  "location": "CalculadoraSteps.o_resultado_deve_ser(int)"
});
formatter.result({
  "duration": 1911000,
  "status": "passed"
});
formatter.uri("br.unirio/servicoDadosAreasNegocio.feature");
formatter.feature({
  "id": "servico-de-dados---areas-de-negocio",
  "description": "\nComo um fiscal de obras em campo\nEu quero ter um servico de dados de areas de negocio\nPara poder selecionar uma obra e informar seus dados",
  "name": "Servico de Dados - Areas de Negocio",
  "keyword": "Funcionalidade",
  "line": 3,
  "comments": [
    {
      "value": "#language: pt",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "servico-de-dados---areas-de-negocio;busca-de-todas-as-areas-de-negocio",
  "description": "",
  "name": "Busca de todas as areas de negocio",
  "keyword": "Cenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "que o cadastro das areas de negocio da Petrobras contem as areas \"AREA 1\" e \"AREA 2\"",
  "keyword": "Dado ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "AREA 1",
      "offset": 66
    },
    {
      "val": "AREA 2",
      "offset": 77
    }
  ],
  "location": "ServicoAreaNegocioSteps.que_o_cadastro_das_areas_de_negocio_da_Petrobras_contem_as_areas_e(String,String)"
});
formatter.result({
  "duration": 606000,
  "status": "passed"
});
formatter.step({
  "name": "eu invocar o servico para recuperar as areas de negocio",
  "keyword": "Quando ",
  "line": 11
});
formatter.match({
  "location": "ServicoAreaNegocioSteps.eu_invocar_o_servico_para_recuperar_as_areas_de_negocio()"
});
formatter.result({
  "duration": 11000,
  "status": "passed"
});
formatter.step({
  "name": "o resultado tem tamanho \"2\"",
  "keyword": "Entao ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "ServicoAreaNegocioSteps.o_resultado_tem_tamanho(int)"
});
formatter.result({
  "duration": 61000,
  "status": "passed"
});
formatter.step({
  "name": "contem somente as areas \"AREA 1\" e \"AREA 2\"",
  "keyword": "E ",
  "line": 13
});
formatter.match({
  "arguments": [
    {
      "val": "AREA 1",
      "offset": 25
    },
    {
      "val": "AREA 2",
      "offset": 36
    }
  ],
  "location": "ServicoAreaNegocioSteps.contem_somente_as_areas_e(String,String)"
});
formatter.result({
  "duration": 63000,
  "status": "passed"
});
});