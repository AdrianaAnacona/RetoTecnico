package co.com.certification.base.tasks;

import co.com.certification.base.userinterfaces.GoToRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegisterModule implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GoToRegister.IrARegistro)
        );
    }

    public static GoToRegisterModule userregister(){
        return Tasks.instrumented(GoToRegisterModule.class);
    }
}
