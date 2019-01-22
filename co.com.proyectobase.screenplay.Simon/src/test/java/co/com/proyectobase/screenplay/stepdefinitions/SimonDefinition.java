package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;


import co.com.proyectobase.screenplay.questions.RespuestaSimon;
import co.com.proyectobase.screenplay.tasks.IngresoSimon;
import co.com.proyectobase.screenplay.tasks.LlenarFormulario;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SimonDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor juan = Actor.named("Juan");
	
	@Before
	public void configuracionInicial() {
		juan.can(BrowseTheWeb.with(hisBrowser));
	}

	@Dado("^que Juan quiere ingresar a la pagina simon$")
	public void queJuanQuiereIngresarALaPaginaSimon(){
		juan.wasAbleTo(IngresoSimon.lapaginaingresar());
	}

	@Cuando("^cuando ingresa todos los datos$")
	public void cuandoIngresaTodosLosDatos()  {
		juan.wasAbleTo(LlenarFormulario.informacion());
	}

	@Entonces("^el deberia visualizar el registro exitoso$")
	public void elDeberiaVisualizarElRegistroExitoso() {
		juan.should(seeThat(RespuestaSimon.Rsimon(), equalTo("Solicitud de Registro")));
	}

	
}
