
Feature: Interação com o elemento Add/Remove Elements


@AddRemoveElements
Scenario: Clicar no link Add/Remove Elements adicionar três elementos e deletar 
	Given que eu acesso o site de exercícios de automação
	And que eu opto por clicar no link Add/Remove Elements
	When opto por clicar no botão Add Element três vezes
	And quando o sistema apresenta três vezes o botão Delete
	Then opto por remover os remover esses três botões
	And volto para a tela inicial