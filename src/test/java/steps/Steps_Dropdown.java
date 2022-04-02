package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_Dropdown;

public class Steps_Dropdown {

	private Pagina_Dropdown Dropdown = new Pagina_Dropdown();

	@Given("^que eu opto por clicar no link Dropdown$")
	public void queEuOptoPorClicarNoLinkDropdown() throws Throwable {
		Dropdown.clicarNoLinkDropdown();
	}

	@When("^opto por clicar na seta para baixo$")
	public void optoPorClicarNaSetaParaBaixo() throws Throwable {
		Dropdown.clicarNaSetaParaBaixo();
	}

	@Then("^o sistema apresenta a opção escolhida$")
	public void oSistemaApresentaAOpçãoEscolhida() throws Throwable {
	    
	}
}
