package paginas;

import core.BaseSelenium;
import elementos.Elementos_Dropdown;

public class Pagina_Dropdown extends BaseSelenium {

	private Elementos_Dropdown Dropdown = new Elementos_Dropdown();

	public void clicarNoLinkDropdown() {
		esperarPadrao(2);
		clicar(Dropdown.getLnkDropdown());
	}
	public void clicarNaSetaParaBaixo() {
		for (int i = 0; i < 2; i++) {
			escolheNoCombo();
		}
	}

	public void escolheNoCombo() {
		esperarPadrao(2);
		comboBoxPorTexto(Dropdown.getSeletDropdown(), "Option 1");
		esperarPadrao(2);
		comboBoxPorTexto(Dropdown.getSeletDropdown(), "Option 2");
		esperarPadrao(2);
	}
}
