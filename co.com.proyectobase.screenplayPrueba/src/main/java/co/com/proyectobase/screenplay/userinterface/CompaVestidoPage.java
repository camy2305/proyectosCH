package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class CompaVestidoPage extends PageObject {
    public static final Target BTN_DRESSES = Target.the("BOTON PARA"
            + " INGRESAR A VESTIDOS ").located(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/a"));
    public static final Target lISTA_ORDENAR = Target.the("LISTA"
            + " PARA ORDENAR VESTIDOS ").located(By.xpath("//*[@id=\'selectProductSort\']"));
    public static final Target BTN_SELECCION = Target.the("BOTON"
            + " PARA SELECCION DE VESTIDO ").located(By.xpath("//*[@id=\'center_column\']/ul/li[2]/div/div[2]/h5/a"));
    public static final Target BTN_SELECCION2 = Target.the("BOTON"
            + " PARA SELECCION DE VESTIDO ").located(By.xpath("//*[@id=\'add_to_cart\']/button/span"));

    public static final Target BTN_AGREGARCARRITO = Target.the("BOTON"
            + " PARA AGREGAR AL CARRITO ").located(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span"));
    public static final Target BTN_PROCEDERPAGO = Target.the("BOTON "
            + " PARA PROCEDER CON PAGO ").located(By.xpath("//*[@id=\'center_column\']/p[2]/a[1]/span"));

    //public static final Target BTN_PASARPORCAJA = Target.the("BOTON"
     //       + " PARA PASAR POR CAJA ").located(By.xpath("//*[@id=\'center_column\']/p[2]/a[1]/span/font/font"));

    public static final Target LBL_EMAIL = Target.the("LABEL"
            + " PARA EL EMAIL ").located(By.xpath("//*[@id=\'email\']"));
    public static final Target LBL_PASSWORD = Target.the("LABEL"
            + " PARA EL PASSWORD ").located(By.xpath("//*[@id=\'passwd\']"));
    public static final Target BTN_REGISTRARSE = Target.the("BOTON"
            + " DE LOGUEO ").located(By.xpath("//*[@id=\'SubmitLogin\']/span"));
    public static final Target BTN_PASARPORCAJA2 = Target.the("BOTON"
            + " DE LOGUEO ").located(By.xpath("//*[@id=\'center_column\']/form/p/button/span"));
    public static final Target CHECK_ACEPTARTERMINOS = Target.the("CHECKBOX"
            + " ACEPTAR TERMINOS ").located(By.xpath("//*[@id=\'cgv\']"));
    public static final Target BTN_PASARPORCAJA3 = Target.the("BOTON"
            + " DE LOGUEO ").located(By.xpath("//*[@id=\'form\']/p/button/span"));
    public static final Target BTN_TRANFERENCIA = Target.the("BOTON"
            + " DE PAGO TRANSFERENCIA BANCARIA ").located(By.xpath("//*[@id=\'HOOK_PAYMENT\']/div[1]/div/p/a"));

    public static final Target BTN_CONFIRMARORDEN = Target.the("BOTON"
            + " DE CONFIRMAR ORDEN ").located(By.xpath("//*[@id=\'cart_navigation\']/button/span"));
    public static final Target RESP_INFORMACIONENVIADA = Target.the("BOTON"
            + " DE CONFIRMAR ORDEN ").located(By.xpath("//*[@id=\'center_column\']/div/p/strong"));



}
