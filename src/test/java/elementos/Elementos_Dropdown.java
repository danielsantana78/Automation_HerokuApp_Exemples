package elementos;

import org.openqa.selenium.By;

public class Elementos_Dropdown {
	private By lnkDropdown = By.xpath("//a[text()='Dropdown']");
	private By seletDropdown = By.xpath("//select");

	public By getLnkDropdown() {
		return lnkDropdown;
	}

	public By getSeletDropdown() {
		return seletDropdown;
	}
}