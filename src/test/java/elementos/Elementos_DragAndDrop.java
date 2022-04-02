package elementos;

import org.openqa.selenium.By;

public class Elementos_DragAndDrop {

	private By quadradoA = By.xpath("//div[@id='column-a']");
	private By quadradoB = By.xpath("//div[@id='column-a']");
	private By lnkDragAndDrop = By.xpath("//a[text()='Drag and Drop']");
	
	
	
	public By getQuadradoA() {
		return quadradoA;
	}
	public By getQuadradoB() {
		return quadradoB;
	}
	public By getLnkDragAndDrop() {
		return lnkDragAndDrop;
	}

}
