package executar;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import core.BaseSelenium;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:Evidencias/Status - Automacao de Testes.html",
		"html:src/test/resources/relatorios/cucumber-reports/",
		"json:src/test/resources/relatorios/cucumber-reports/cucumber.json",
		"junit:src/test/resources/reslatorios/cucumber-reports/cucumber.xml" }, glue = { "" },

		tags = "@AddRemoveElements",

		snippets = SnippetType.CAMELCASE)
public class Execucao {

	@BeforeClass
	public static void iniciaCargaDeTeste() {
		BaseSelenium.inicializador();
	}
	

	@AfterClass
	public static void finalizaTestes() {
		// BaseSelenium.fechaChrome();
		Reporter.loadXMLConfig(new File("Configuracao/extension-config.xml"));
		Reporter.setSystemInfo("Usuário Executor", System.getProperty("user.name"));
		Reporter.setSystemInfo("Sistema Operacional", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("Relatório de execução dos testes automatizados");
	}

}
