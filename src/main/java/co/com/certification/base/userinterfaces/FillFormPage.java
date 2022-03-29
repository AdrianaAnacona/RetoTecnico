package co.com.certification.base.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFormPage {
    public static final Target NOMBRES = Target.the("Nombres").located(By.id("firstName"));
    public static final Target APELLIDOS = Target.the("Apellidos").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Correo").located(By.id("email"));
    public static final Target MESNACIMIENTO = Target.the("Mes de Nacimiento").located(By.id("birthMonth"));
    public static final Target DIANACIMIENTO = Target.the("Dia de Nacimiento").located(By.id("birthDay"));
    public static final Target ANIONACIMIENTO = Target.the("Anio de Nacimiento").located(By.id("birthYear"));
    public static final Target LENGUAJE = Target.the("Lenguaje").located(By.xpath("//a[@class='ui-select-search input-xs ng-valid ng-dirty ng-empty ng-touched']"));
   // public static final Target SIGUIENTE1 = Target.the("Siguiente").located(By.xpath("//a[@class='ui-select-search input-xs ng-valid ng-dirty ng-empty ng-touched']"));
}
