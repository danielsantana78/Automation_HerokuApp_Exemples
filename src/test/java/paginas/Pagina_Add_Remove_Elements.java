package paginas;

import org.openqa.selenium.By;

import core.BaseSelenium;
import elementos.Elementos_AddRemoveElement;

public class Pagina_Add_Remove_Elements extends BaseSelenium {

	private Elementos_AddRemoveElement ElementAddRemoveElement = new Elementos_AddRemoveElement();

	public void clicarNoLinkAddRemoveElement() {
		clicar(ElementAddRemoveElement.getLnkAddRemoveElements());
	}

	public void clicarNoBotaoAddElementTresVezes() {
		for (int i = 0; i < 100; i++) {				
			clicar(By.xpath("//div//button[text()='Add Element']"));
		}			
	}

	public void apresentaTresVezesOBotaoDelete() {
		validarSeElementoExiste(By.xpath("//div//button[text()='Add Element']"));
	}

	public void removeOsBotoesDelete() {
		esperarPadrao(3);
		for (int i = 0; i < 100; i++) {
			clicar(Elementos_AddRemoveElement.getBtn1());
		}
	}

	public void voltarParaTelaInicial() {
		botaoVoltarDoNavegador();		
	}
}
