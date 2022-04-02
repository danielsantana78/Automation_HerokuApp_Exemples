Feature: Interação com o elemento Dropdown

user story: eu como po quero quero   para escolh e 

@Dropdown
Scenario: Clicar no link Dropdown e escolher uma opção
	Given que eu acesso o site de exercícios de automação
	And que eu opto por clicar no link Dropdown
	When opto por clicar na seta para baixo
	Then o sistema apresenta a opção escolhida
	And volto para a tela inicial
