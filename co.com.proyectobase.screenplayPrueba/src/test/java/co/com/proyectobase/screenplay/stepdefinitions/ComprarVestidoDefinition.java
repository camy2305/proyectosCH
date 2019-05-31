package co.com.proyectobase.screenplay.stepdefinitions;
import co.com.proyectobase.screenplay.questions.RespuestaCompra;
import co.com.proyectobase.screenplay.tasks.IngresarPaginaVestidos;
import co.com.proyectobase.screenplay.tasks.RealizaCompraVestido;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ComprarVestidoDefinition {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor Megan = Actor.named("Megan");

    @Before
    public void configuracionInicial() {
        Megan.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^Megan ingresa a la pagina y selecciona vestido$")
    public void MeganIngresaALaPaginaYSeleccionaVestido()  {
        Megan.wasAbleTo(IngresarPaginaVestidos.IngresarVestidos());
    }

    @Cuando("^Megan Realiza compra del vestido$")
    public void meganRealizaCompraDelVestido() {
        Megan.attemptsTo(RealizaCompraVestido.RealizarCompra());
    }

    @Entonces("^Megan  captura comprobante$")
    public void meganCapturaComprobante() {
        Megan.should(seeThat(RespuestaCompra.es(), equalTo("Your order on My Store is complete.")));
    }

}
