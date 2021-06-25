#language: pt

Funcionalidade: Login
	Como um usuario
	Gostaria de realizar o login no sistema
	Para que eu possa utilizar os serviços do sistema
	
Contexto: Deve realizar login com sucesso
	Dado que o usuario esta na pagina de login do mantisBT 
	
	
Cenario: deve realizar login com sucesso 
	Quando informo o usuario <login>
	E informo a senha <senha>
	Entao deve exibir a pagina inicial

Cenario: deve falhar o login
	Quando informo o usuario <login>
	E informo a senha <senha>
	Entao deve exibir a mensagem de erro

Exemplos:
	|login           |senha             |
	|rodolfo.rocha   |Auto#Mantis#Sel   |
	|jose_123        |jose_senha        |
	|                |                  |