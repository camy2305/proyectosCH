package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.CompaVestidoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class IngresarPaginaVestidos implements Task {
    private CompaVestidoPage compraVestidoPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(compraVestidoPage));
    actor.attemptsTo(Click.on(CompaVestidoPage.BTN_DRESSES));

    }

    public static IngresarPaginaVestidos IngresarVestidos() {
        return Tasks.instrumented(IngresarPaginaVestidos.class);
    }
}
