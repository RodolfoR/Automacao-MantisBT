#language: pt
#encoding: UTF-8
@Login @End2End
Funcionalidade: Login
  Como um usuario
  Gostaria de realizar o login no sistema
  Para que eu possa utilizar os serviços do sistema

  Contexto: Deve realizar login com sucesso
    Dado que o usuario esta na pagina de login do mantisBT

  @RealizarLoginMantisBT @End2End
  Esquema do Cenario: Realizar Login
    Quando informo o usuario "<login>"
    E informo a senha "<senha>"
    E clicar no botao de login
    Entao deve confirmar tentativa de login de status "<status>"

    Exemplos: dados validos
      | login         | senha           | status |
      | rodolfo.rocha | Auto#Mantis#Sel | OK     |

    Exemplos: dados invalidos
      | login   | senha     | status |
      | jose123 | joseSenha | FALHA  |
