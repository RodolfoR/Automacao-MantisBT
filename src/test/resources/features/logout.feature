#language: pt
#encoding: UTF-8

@Logout @End2End
Funcionalidade: Logout
	Como um usuario
	Gostaria de poder realizar o logout do sistema
	para Garantir mais segurança ao sair do sistema
	
	Contexto: deve realizar logout com sucesso
		Dado um usuario logado no sistema
		
	Esquema do Cenario: realizar logout
		Quando estiver logado com o usuario "<login>"
		E e senha "<senha>"
		E clicar no botao Login
		E estiver logado no sistema
		Entao devo sair do sistema quando clicar no link logout
		
	Exemplos: dados validos
      | login         | senha           |
      | rodolfo.rocha | Auto#Mantis#Sel |
	