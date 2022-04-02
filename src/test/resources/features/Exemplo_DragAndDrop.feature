
Feature: Interação com o elemento Drag and Drop


@DragAndDrop
Scenario: Clicar no link Drag and Drop clicar e arrastar o A para o lugar do B e vice-versa
	Given que eu acesso o site de exercícios de automação
	And que eu opto por clicar no link Drag and Drop
	When opto por clicar no quadrado A e arrastar para o lugar do quadrado B
	And  opto por clicar no quadrado B e arrastar para o lugar do quadrado A
	Then verifico que os quadrados trocam de lugar