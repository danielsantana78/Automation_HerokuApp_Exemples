package paginas;

import org.openqa.selenium.By;

import core.BaseSelenium;
import elementos.Elementos_DragAndDrop;

public class Pagina_DragAndDrop extends BaseSelenium {

	private Elementos_DragAndDrop DragAndDrop = new Elementos_DragAndDrop();

	public void clicarEmDragAndDrop() {
		clicar(DragAndDrop.getLnkDragAndDrop());
	}

	public void clicarQuadradoAArrastarLugarQuadradoB(By elemento, By elemento1, By elemento2) {
	
		 
	}
}
