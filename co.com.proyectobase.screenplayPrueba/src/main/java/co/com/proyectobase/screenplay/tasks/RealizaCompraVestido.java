package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.CompaVestidoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RealizaCompraVestido implements Task {
    private CompaVestidoPage compraVestidoPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText("Price: Highest first").from(CompaVestidoPage.lISTA_ORDENAR));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_SELECCION));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_SELECCION2));
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {}
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_AGREGARCARRITO));

        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_PROCEDERPAGO));
        //actor.attemptsTo(Click.on(CompaVestidoPage.BTN_PASARPORCAJA));

        actor.attemptsTo(Click.on(CompaVestidoPage.LBL_EMAIL));
        actor.attemptsTo(Enter.theValue("juanca2305@gmail.com").into(CompaVestidoPage.LBL_EMAIL));
        actor.attemptsTo(Click.on(CompaVestidoPage.LBL_PASSWORD));
        actor.attemptsTo(Enter.theValue("12345").into(CompaVestidoPage.LBL_PASSWORD));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_REGISTRARSE));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_PASARPORCAJA2));
        actor.attemptsTo(Click.on(CompaVestidoPage.CHECK_ACEPTARTERMINOS));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_PASARPORCAJA3));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_TRANFERENCIA));
        actor.attemptsTo(Click.on(CompaVestidoPage.BTN_CONFIRMARORDEN));

    }
    public static RealizaCompraVestido RealizarCompra() {
        return Tasks.instrumented(RealizaCompraVestido.class);
    }
}
