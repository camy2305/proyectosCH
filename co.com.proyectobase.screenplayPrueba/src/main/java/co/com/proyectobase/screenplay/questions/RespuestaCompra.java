package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.CompaVestidoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RespuestaCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        // TODO Auto-generated method stub
        return Text.of(CompaVestidoPage.RESP_INFORMACIONENVIADA).viewedBy(actor).asString();
    }
    public static Question es()  {
        return new RespuestaCompra();

    }

}
