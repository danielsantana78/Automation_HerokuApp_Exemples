package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_DragAndDrop;

public class Steps_DragAndDrop {
	
	private Pagina_DragAndDrop DragAndDrop = new Pagina_DragAndDrop();
	
	@Given("^que eu opto por clicar no link Drag and Drop$")
	public void queEuOptoPorClicarNoLinkDragAndDrop() {
		DragAndDrop.clicarEmDragAndDrop();
	}

	@When("^opto por clicar no quadrado A e arrastar para o lugar do quadrado B$")
	public void optoPorClicarNoQuadradoAEArrastarParaOLugarDoQuadradoB(By elemento,By elemento1,By elemento2) {
		DragAndDrop.clicarQuadradoAArrastarLugarQuadradoB(elemento,elemento1,elemento2);
	}

	@When("^opto por clicar no quadrado B e arrastar para o lugar do quadrado A$")
	public void optoPorClicarNoQuadradoBEArrastarParaOLugarDoQuadradoA() {
	
	}

	@Then("^verifico que os quadrados trocam de lugar$")
	public void verificoQueOsQuadradosTrocamDeLugar() {
	
	}
}
