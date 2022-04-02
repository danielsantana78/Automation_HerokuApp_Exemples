package core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSelenium {

	private static long timeOut = 20;
	private static String url = "http://the-internet.herokuapp.com";
	private static String chromeAgent = "webdriver.chrome.driver";
	private static String caminhoDoPrintErro = System.getProperty("user.dir") + File.separator +"src" + File.separator
			+ "test" + File.separator + "resources" + File.separator + "PrintsErro" + File.separator;
	public static String caminhoDoPrintOk = System.getProperty("user.dir") + File.separator +"src" + File.separator
			+ "test" + File.separator + "resources" + File.separator + "PrintsConcluido" + File.separator;
	private static String caminhoDriver = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "test" + File.separator + "resources" + File.separator + "navegador" + File.separator
			+ "chromedriver.exe"; // system.getproperty tras informações, propriedades do sistema utilizado
									// "windows"
	private static WebDriver driver;
	private static WebDriverWait wait;

	public static void iniciaChrome() {   // pode ser tbm - public static
		System.setProperty(chromeAgent, caminhoDriver);
		driver = new ChromeDriver();	
	}
	
	public static void inicializador() {
		if (driver == null) {
			iniciaChrome();
		}
	}

	public static void fechaChrome() {
		driver.quit();
	}

	public WebElement procurar(By elemento) {
		return driver.findElement(elemento);
	}
	
	public void clicar(By elemento) {
		procurar(elemento).click();
	}

	public void escreveNoCampo(By elemento, String textoParaSerDigitado) {
		procurar(elemento).sendKeys(textoParaSerDigitado);
	}

	public void escrever(By elemento, String texto) {
		procurar(elemento).sendKeys(texto);
	}
	
	public String extrairTextoDoElemento(By elemento) {
		return procurar(elemento).getText();
	}

	public void comboBoxPorTexto(By elemento, String itemDoCombo) {
		comboBox(elemento).selectByVisibleText(itemDoCombo);
	}

	public void comboBoxPorValor(By elemento, String valorDoCombo) {
		comboBox(elemento).selectByValue(valorDoCombo);
	}

	public void comboBoxPorIndex(By elemento, int indexDoCombo) {
		comboBox(elemento).selectByIndex(indexDoCombo);
	}

	private Select comboBox(By elemento) {
		return new Select(procurar(elemento));
	}

	public void navegarParaUrl() {
		driver.navigate().to(url);
		maximize();
	}

	public Navigation navegador() {
		return driver.navigate();
	}

	public void urlDoSite(String urlDoSite) { //String urlDoSite
		navegador().to(urlDoSite);
	}

	public void botaoVoltarDoNavegador() {
		navegador().back();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	
	public WebElement esperarSerVisivel(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(0))
				.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}
	public WebElement esperarSerClicavel(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public WebElement esperarElementoExistir(By elemento) {
		return new WebDriverWait(BaseSelenium.driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(procurar(elemento)));
	}

	public WebElement aguardaElementoDinamico(By elemento){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(15))
			.pollingEvery(Duration.ofSeconds(20))
			.ignoring(NoSuchElementException.class);
		
			return wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

	public Boolean aguardaElementoDinamicoPorTexto(By elemento){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(15))
			.pollingEvery(Duration.ofSeconds(2))
			.withMessage("Concluido")
			.ignoring(NoSuchElementException.class)
			.ignoring(TimeoutException.class);
			
			return wait.until(ExpectedConditions.textToBePresentInElementLocated(elemento,"concluido"));
}
	public String extrairAtributo(By elemento, String atributo) {
		return procurar(elemento).getAttribute(atributo);
	}
	
	public Boolean esperarElementoSelect(By elemento) {
		return new WebDriverWait(driver,Duration.ofSeconds(1500))
				.until(ExpectedConditions.elementToBeSelected(procurar(elemento)));
		}
	public Boolean esperarSelect(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeSelected(procurar(elemento)));
	}
	
	public void moverParaElemento(By elemento) {
		Actions action = new Actions(driver);
		WebElement element = procurar(elemento);
		action.moveToElement(element).build().perform();

	}
	public void moverParaElemento(WebElement elemento) {
		Actions action = new Actions(driver);
		action.moveToElement(elemento).click().build().perform();
}
	
	public void mouseHover(WebElement elemento) {
		Actions actionProvider = new Actions(driver);
	      actionProvider.dragAndDrop(elemento, elemento).build().perform();
	}
	
	
	public Boolean existe(By elemento) {
		try {
			return !driver.findElements(elemento).isEmpty();
		} catch (Exception e) {
			return false;
		}
	}
	public void tirarPrintDaTela() throws IOException {
		File print = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
		File destino = new File(caminhoDoPrintErro + "test" + new Random().nextInt(20) + ".png");
		FileUtils.copyFile(print, destino);
	
	}
	public void tirarPrintPassou() {
		File print = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
		File destino = new File(caminhoDoPrintOk + "test" + new Random().nextInt(20) + ".png");
		try {
			FileUtils.copyFile(print, destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void esperarPadrao (int tempoEmSegundos) {
			try {
				Thread.sleep(tempoEmSegundos * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		 public boolean validarSeElementoExiste(By elemento) {
				int contador = driver.findElements(elemento).size();
				return contador > 0 ? Boolean.TRUE : Boolean.FALSE;
		 }
		 
		 public void esperarPaginaSerCarregada() {
				try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
									
				} catch (Exception e) {
					Assert.fail(LocalDateTime.now() + " --  Página atual não foi carregada totalmente em 15 segundos" + e.getMessage());
					
				}
			}
		 
		 
			
}