$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/loginMantisBT.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "Como um usuario\r\nGostaria de realizar o login no sistema\r\nPara que eu possa utilizar os serviços do sistema",
  "id": "login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Realizar Login",
  "description": "",
  "id": "login;realizar-login",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 12,
      "name": "@RealizarLoginMantisBT"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "informo o usuario \"\u003clogin\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informo a senha \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "deve confirmar tentativa de login",
  "keyword": "Entao "
});
formatter.examples({
  "line": 18,
  "name": "dados validos",
  "description": "",
  "id": "login;realizar-login;dados-validos",
  "rows": [
    {
      "cells": [
        "login",
        "senha"
      ],
      "line": 19,
      "id": "login;realizar-login;dados-validos;1"
    },
    {
      "cells": [
        "rodolfo.rocha",
        "Auto#Mantis#Sel"
      ],
      "line": 20,
      "id": "login;realizar-login;dados-validos;2"
    },
    {
      "cells": [
        "rodolforocha",
        "AutoMantisSel"
      ],
      "line": 21,
      "id": "login;realizar-login;dados-validos;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 4355620900,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Deve realizar login com sucesso",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que o usuario esta na pagina de login do mantisBT",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_o_usuario_esta_na_pagina_de_login_do_mantisBT()"
});
formatter.result({
  "duration": 4453502600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Realizar Login",
  "description": "",
  "id": "login;realizar-login;dados-validos;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 12,
      "name": "@RealizarLoginMantisBT"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "informo o usuario \"rodolfo.rocha\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informo a senha \"Auto#Mantis#Sel\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "deve confirmar tentativa de login",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "rodolfo.rocha",
      "offset": 19
    }
  ],
  "location": "LoginSteps.informo_o_usuario(String)"
});
formatter.result({
  "duration": 358251000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Auto#Mantis#Sel",
      "offset": 17
    }
  ],
  "location": "LoginSteps.informo_a_senha(String)"
});
formatter.result({
  "duration": 259311500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.deve_confirmar_tentativa_de_login()"
});
formatter.result({
  "duration": 39300,
  "status": "passed"
});
formatter.after({
  "duration": 765185400,
  "status": "passed"
});
formatter.before({
  "duration": 2596596300,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Deve realizar login com sucesso",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que o usuario esta na pagina de login do mantisBT",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_o_usuario_esta_na_pagina_de_login_do_mantisBT()"
});
formatter.result({
  "duration": 4445873100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Realizar Login",
  "description": "",
  "id": "login;realizar-login;dados-validos;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 12,
      "name": "@RealizarLoginMantisBT"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "informo o usuario \"rodolforocha\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informo a senha \"AutoMantisSel\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "deve confirmar tentativa de login",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "rodolforocha",
      "offset": 19
    }
  ],
  "location": "LoginSteps.informo_o_usuario(String)"
});
formatter.result({
  "duration": 398796400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutoMantisSel",
      "offset": 17
    }
  ],
  "location": "LoginSteps.informo_a_senha(String)"
});
formatter.result({
  "duration": 364587900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.deve_confirmar_tentativa_de_login()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.after({
  "duration": 1036100400,
  "status": "passed"
});
});