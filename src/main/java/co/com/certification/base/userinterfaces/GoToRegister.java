package co.com.certification.base.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToRegister {

    public static final Target IrARegistro = Target.the("Ir a registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
