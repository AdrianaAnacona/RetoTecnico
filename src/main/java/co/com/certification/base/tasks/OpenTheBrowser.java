package co.com.certification.base.tasks;


import co.com.certification.base.exceptions.OpenTheBrowserException;
import com.gargoylesoftware.htmlunit.Page;
import io.vavr.control.Try;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;


public class OpenTheBrowser implements Task {
    PageObject page;

    public OpenTheBrowser (PageObject page) {
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.wasAbleTo(Open.browserOn(page));
        } catch (Exception e){
            throw new OpenTheBrowserException(OpenTheBrowserException.OPEN_BROWSER_FAILED,e);
        }
    }
    public static OpenTheBrowser on (PageObject page){

        return Tasks.instrumented(OpenTheBrowser.class, page);
    }


}