package co.com.certification.base.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class OpenTheBrowserException extends SerenityManagedException {

    public static final String OPEN_BROWSER_FAILED = "FALLO AL ABRIR BROWSER";
    public OpenTheBrowserException (String openTheBrowserFailed, Throwable testErrorException){
        super(testErrorException);
    }

}
