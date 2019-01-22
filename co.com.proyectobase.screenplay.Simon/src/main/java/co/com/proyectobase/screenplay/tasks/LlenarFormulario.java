package co.com.proyectobase.screenplay.tasks;


import co.com.proyectobase.screenplay.userinterface.IngresoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LlenarFormulario implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(IngresoPage.LISTA2));
		actor.attemptsTo(Click.on(IngresoPage.TIPO_DOC));
	
		
		actor.attemptsTo(Click.on(IngresoPage.NUM_ID));
		actor.attemptsTo(Enter.theValue("123456789").into(IngresoPage.NUM_ID));
		actor.attemptsTo(Click.on(IngresoPage.NOMBRE));
		actor.attemptsTo(Enter.theValue("JUAN").into(IngresoPage.NOMBRE));
		actor.attemptsTo(Click.on(IngresoPage.APELLIDOS));
		actor.attemptsTo(Enter.theValue("RUIZ").into(IngresoPage.APELLIDOS));
		
		actor.attemptsTo(Click.on(IngresoPage.LISTA3));
		actor.attemptsTo(Click.on(IngresoPage.SEXO));
		actor.attemptsTo(Click.on(IngresoPage.F_NAC));
		actor.attemptsTo(Enter.theValue("25041999").into(IngresoPage.F_NAC));
		actor.attemptsTo(Click.on(IngresoPage.CLAVE));
		actor.attemptsTo(Enter.theValue("CHOUCAIR123").into(IngresoPage.CLAVE));
		actor.attemptsTo(Click.on(IngresoPage.CONF_CLAVE));
		actor.attemptsTo(Enter.theValue("CHOUCAIR123").into(IngresoPage.CONF_CLAVE));
		actor.attemptsTo(Click.on(IngresoPage.LISTA4));
		actor.attemptsTo(Click.on(IngresoPage.MUNICIPIO));
		actor.attemptsTo(Click.on(IngresoPage.LISTA5));
		actor.attemptsTo(Click.on(IngresoPage.ESTRATO));
			
		
		
		actor.attemptsTo(Click.on(IngresoPage.CORREO));
		actor.attemptsTo((Enter.theValue("JUANRUIZ@HOTMAIL.COM").into(IngresoPage.CORREO)));
		actor.attemptsTo(Click.on(IngresoPage.TELEFONO));
		actor.attemptsTo((Enter.theValue("1234567").into(IngresoPage.TELEFONO)));
		actor.attemptsTo(Click.on(IngresoPage.CHECK1));
		actor.attemptsTo(Click.on(IngresoPage.CHECK2));
		actor.attemptsTo(Click.on(IngresoPage.BTN_DIR));
	
	}
	
	public static LlenarFormulario informacion() {
		return Tasks.instrumented(LlenarFormulario.class);
		
	}

}
