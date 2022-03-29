package co.com.certification.base.tasks;

import co.com.certification.base.userinterfaces.FillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class FillForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue("Juan Pablo").into(FillFormPage.NOMBRES);
        Enter.theValue("Manzano").into(FillFormPage.APELLIDOS);
        Enter.theValue("jmanzano@gmail.com").into(FillFormPage.EMAIL);
        SendKeys.of("february").into(FillFormPage.MESNACIMIENTO);
        SendKeys.of("12").into(FillFormPage.DIANACIMIENTO);
        SendKeys.of("1995").into(FillFormPage.ANIONACIMIENTO);
        Enter.theValue("Spanish").into(FillFormPage.LENGUAJE);
        Click.on("Next");
    }
    public static FillForm withDates(){
        return Tasks.instrumented(FillForm.class);
    }
}
