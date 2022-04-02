package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_Add_Remove_Elements;

public class Steps_Exemplo_Add_Remove_Elements {
	
	private Pagina_Add_Remove_Elements Add_Remove_Elements = new Pagina_Add_Remove_Elements();
	
	@Given("^que eu acesso o site de exercícios de automação$")
	public void queEuAcessoOSiteDeExercíciosDeAutomação() throws Throwable {
		Add_Remove_Elements.navegarParaUrl();
	}

	@Given("^que eu opto por clicar no link Add/Remove Elements$")
	public void queEuOptoPorClicarNoLinkAddRemoveElements() throws Throwable {
		Add_Remove_Elements.clicarNoLinkAddRemoveElement();
	}

	@When("^opto por clicar no botão Add Element três vezes$")
	public void optoPorClicarNoBotãoAddElementTrêsVezes() throws Throwable {
		Add_Remove_Elements.clicarNoBotaoAddElementTresVezes();
	}

	@When("^quando o sistema apresenta três vezes o botão Delete$")
	public void quandoOSistemaApresentaTrêsVezesOBotãoDelete() throws Throwable {
		Add_Remove_Elements.apresentaTresVezesOBotaoDelete();
	}

	@Then("^opto por remover os remover esses três botões$")
	public void optoPorRemoverOsRemoverEssesTrêsBotões() throws Throwable {
		Add_Remove_Elements.removeOsBotoesDelete();
	}

	@Then("^volto para a tela inicial$")
	public void voltoParaATelaInicial() throws Throwable {
		Add_Remove_Elements.voltarParaTelaInicial();
	}

}



