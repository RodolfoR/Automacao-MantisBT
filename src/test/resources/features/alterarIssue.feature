#language: pt
#encoding: UTF-8

Funcionalidade: Alterar Registro Issue

Contexto: Alterar dados de um Registro de Issue
	Dado um usuario logado no sistema
	E um registro de Issue
	
	Esquema do Cenario: Alterar Issue
		Quando um usuario logar no sistema "<usuario>", "<senha>"
		E clicar no link my view
		E clicar no primeiro registro reportado pelo usuario
		E adicionar uma nota de observação
		E clicar no botao adicionar nota
		
