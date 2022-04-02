$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Exemplo_Add_Remove_Elements.feature");
formatter.feature({
  "line": 2,
  "name": "Interação com o elemento Add/Remove Elements",
  "description": "",
  "id": "interação-com-o-elemento-add/remove-elements",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Clicar no link Add/Remove Elements adicionar três elementos e deletar",
  "description": "",
  "id": "interação-com-o-elemento-add/remove-elements;clicar-no-link-add/remove-elements-adicionar-três-elementos-e-deletar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@AddRemoveElements"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu acesso o site de exercícios de automação",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "que eu opto por clicar no link Add/Remove Elements",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "opto por clicar no botão Add Element três vezes",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "quando o sistema apresenta três vezes o botão Delete",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "opto por remover os remover esses três botões",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "volto para a tela inicial",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.queEuAcessoOSiteDeExercíciosDeAutomação()"
});
formatter.result({
  "duration": 6114478200,
  "status": "passed"
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.queEuOptoPorClicarNoLinkAddRemoveElements()"
});
formatter.result({
  "duration": 308365300,
  "status": "passed"
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.optoPorClicarNoBotãoAddElementTrêsVezes()"
});
formatter.result({
  "duration": 2057875300,
  "status": "passed"
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.quandoOSistemaApresentaTrêsVezesOBotãoDelete()"
});
formatter.result({
  "duration": 11076900,
  "status": "passed"
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.optoPorRemoverOsRemoverEssesTrêsBotões()"
});
formatter.result({
  "duration": 6234318700,
  "status": "passed"
});
formatter.match({
  "location": "Steps_Exemplo_Add_Remove_Elements.voltoParaATelaInicial()"
});
formatter.result({
  "duration": 47626600,
  "status": "passed"
});
});