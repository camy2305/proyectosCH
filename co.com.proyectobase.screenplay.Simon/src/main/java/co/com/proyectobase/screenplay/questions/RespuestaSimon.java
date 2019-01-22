package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.tasks.LlenarFormulario;

import co.com.proyectobase.screenplay.userinterface.IngresoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RespuestaSimon implements Question <String>  {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(IngresoPage.RESPUESTA).viewedBy(actor).asString();
	}

	public static RespuestaSimon Rsimon() {
		return new RespuestaSimon();
		
	}
}
