#language: pt
#encoding: UTF-8
@RegistrarIssue @End2End
Funcionalidade: Registrar Issue
  Como um usuario
  Gostaria de poder registrar problemas
  para que eu possa acompanhar o desenvolvimento de soluções para o problema

  Contexto: Deve registrar Issue
    Dado um usuario logado no sistema

  Esquema do Cenario: Registrar Issue
    Quando um usuario logar no sistema "<usuario>", "<senha>"
    E clicar no link report issue
    E selecionar o projeto do usuario logado "<usuario>"
    E clicar no botao select project
    E selecionar a categoria do proteto "<categoria>"
    E informar um titulo "<titulo>"
    E informar uma descricao "<descricao>"
    E clicar no botao submit report
    Entao um issue deve ser cadastrado

    Exemplos: dados obrigatorios preenchidos
      | usuario       | senha           | categoria            | titulo     | descricao                              |
      | rodolfo.rocha | Auto#Mantis#Sel | [All Projects] Teste | Issue_Test | erro ao tentar salvar usuario no banco |
      
     #Exemplos: dados obrigatorios faltando
      #| usuario       | senha           | categoria            | titulo     | descricao                              |
      #| rodolfo.rocha | Auto#Mantis#Sel | [All Projects] Teste | Issue_Test |                                        |
