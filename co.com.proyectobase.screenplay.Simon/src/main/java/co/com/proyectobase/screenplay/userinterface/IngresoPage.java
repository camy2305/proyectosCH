package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://simon.inder.gov.co/registro")
public class IngresoPage extends PageObject{
	
	public static final Target LISTA1 = Target.the("label para Seleccionar "
			+ " LISTA1 ").located(By.xpath("//*[@id=\'select2-chosen-15\']"));
	public static final Target SELECCIONAR = Target.the("label para Seleccionar "
			+ " el usuario ").located(By.xpath("//*[@id=\'select2-result-label-29\']"));
	
	public static final Target LISTA2 = Target.the("label para Seleccionar "
			+ " LISTA2 ").located(By.xpath("//*[@id=\'select2-chosen-16\']"));
	public static final Target TIPO_DOC = Target.the("label para Seleccionar "
			+ " TIPO DOCUMNENTO ").located(By.xpath("//*[@id=\'select2-results-16\']/li[2]"));
	public static final Target NUM_ID = Target.the("label para Seleccionar "
			+ " NUMERO DOC ").located(By.xpath("//*[@id=\'numeroidentificacion\']"));
	public static final Target NOMBRE = Target.the("label para ingresar "
			+ " el nombre ").located(By.xpath("//*[@id=\"nombres\"]"));
	public static final Target APELLIDOS = Target.the("label para ingresar "
			+ " apellido ").located(By.xpath("//*[@id=\'apellidos\']"));
	public static final Target LISTA3 = Target.the("label para Seleccionar "
			+ " LISTA1 ").located(By.xpath("//*[@id=\'select2-chosen-17\']"));
	
	public static final Target SEXO = Target.the("label para Seleccionar "
			+ " el SEXO ").located(By.xpath("//*[@id=\'select2-results-17\']/li[2]"));
	public static final Target F_NAC = Target.the("label para Seleccionar "
			+ " el usuario ").located(By.xpath("//*[@id=\'fechanacimiento\']"));
	public static final Target CLAVE = Target.the("label para Seleccionar "
			+ "la clave").located(By.xpath("//*[@id=\'clave_uno\']"));
	public static final Target CONF_CLAVE = Target.the("label para Seleccionar "
			+ "CONFIRMAR la clave").located(By.xpath("//*[@id=\'clave_dos\']"));
	public static final Target LISTA4 = Target.the("label para Seleccionar "
			+ " LISTA1 ").located(By.xpath("//*[@id=\'select2-chosen-19\']"));
	
	public static final Target MUNICIPIO = Target.the("label para Seleccionar "
			+ "la MUNICIPIO").located(By.xpath("//*[@id=\'select2-results-19\']/li[1]"));
	
	public static final Target LISTA5 = Target.the("label para Seleccionar "
			+ "LISTA5").located(By.xpath("//*[@id=\'select2-chosen-28\']"));
	public static final Target ESTRATO = Target.the("label para Seleccionar "
			+ "la ESTRATO").located(By.xpath("//*[@class=\'select2-results\']/li[1]"));
	
	
	public static final Target CORREO = Target.the("label para Seleccionar "
			+ "EL CORREO").located(By.xpath("//*[@id=\'correoelectronico\']"));
	public static final Target TELEFONO = Target.the("label para Seleccionar "
			+ "EL TELEFONO").located(By.xpath("//*[@id=\'telefonomovil\']"));
	public static final Target CHECK1 = Target.the("label para Seleccionar "
			+ "EL check1").located(By.xpath("//*[@id=\'formatoAlto2\']/div/div[3]/div/ins"));
	public static final Target CHECK2 = Target.the("label para Seleccionar "
			+ "EL check2").located(By.xpath("//*[@id=\'formatoAlto2\']/div/div[7]/div/ins"));
	
	public static final Target GUARDAR = Target.the("label para Seleccionar "
			+ "EL TELEFONO").located(By.xpath("//*[@id=\'registro_save\']/i"));
	public static final Target BTN_DIR = Target.the("label para Seleccionar "
			+ "EL TELEFONO").located(By.xpath("//*[@id=\'registro_save\']/i"));
	public static final Target LISTA6 = Target.the("label para Seleccionar "
			+ "DIRECCION").located(By.xpath("//*[@id=\'s2id_formulario_registro_barrio\']/a"));
	
	
	public static final Target RESPUESTA = Target.the("label para Seleccionar "
			+ "REESPUESTA").located(By.xpath("//*[@id=\'formulario_registro\']/div/div[1]/div[1]/h4"));
}
