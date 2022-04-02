package elementos;

import org.openqa.selenium.By;

public class Elementos_AddRemoveElement {

	private By lnkAddRemoveElements = By.xpath("//li//a[text()='Add/Remove Elements']");
	private By btnAddElement = By.xpath("//div//button[text()='Add Element']");
	private static By btn1 = By.xpath("//div//button[text()='Delete'][1]");
	private By btn2 = By.xpath("//div//button[text()='Delete'][2]");
	private By btn3 = By.xpath("//div//button[text()='Delete'][3]");
	
	

	public By getLnkAddRemoveElements() {
		return lnkAddRemoveElements;
	}

	public By getBtnAddElement() {
		return btnAddElement;
	}

	public static By getBtn1() {
		return btn1;
	}
	
	public By getBtn2() {
		return btn2;
	}
	
	public By getBtn3() {
		return btn3;
	}
}
