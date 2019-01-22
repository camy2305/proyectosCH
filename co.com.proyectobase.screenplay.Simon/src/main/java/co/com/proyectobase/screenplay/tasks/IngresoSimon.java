package co.com.proyectobase.screenplay.tasks;



import co.com.proyectobase.screenplay.userinterface.IngresoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class IngresoSimon implements Task {

	private IngresoPage ingresoPage;
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Open.browserOn(ingresoPage));
		actor.attemptsTo(Click.on(IngresoPage.LISTA1));
		actor.attemptsTo(Click.on(IngresoPage.SELECCIONAR));
		
	}

	public static IngresoSimon lapaginaingresar() {
		return Tasks.instrumented(IngresoSimon.class);
		
	}
}
