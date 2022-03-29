package co.com.certification.base.stepdefinitions;

import co.com.certification.base.tasks.FillForm;
import co.com.certification.base.tasks.GoToRegisterModule;
import co.com.certification.base.tasks.OpenTheBrowser;
import co.com.certification.base.userinterfaces.InitialPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterUserInUtestStepDefinitions {
    private InitialPage page;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) esta en la pagina web utest$")
    public void queAdrianaEstaEnLaPaginaWebUtest(String name) {
         OnStage.theActorCalled(name).wasAbleTo(OpenTheBrowser.on(page));
    }

    @Given("^va a la opcion en home$")
    public void vaALaOpcionEnHome(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToRegisterModule.userregister());
    }

    @When("^ingresa los datos correctos en el formulario$")
    public void ingresaLosDatosCorrectosEnElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.withDates());
    }

    @Then("^usuario sera registrado en el sistema$")
    public void usuarioSeraRegistradoEnElSistema() {

    }
}
