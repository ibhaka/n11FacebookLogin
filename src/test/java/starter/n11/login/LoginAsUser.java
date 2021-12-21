package starter.n11.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.n11.user_interface.n11LoginPageElements;
import starter.n11.user_interface.n11SignupPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;

public class LoginAsUser implements Task {

    private final String email_text;
    private final String password_text;


    @Step("{0} Signup with username '#username_text' '#email_text' and password '#password_text' and storename '#storename'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11LoginPageElements.SIGNIN_BUTTON), // Go to SignUp page
                WaitUntil.the(n11SignupPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(3).seconds(), //Wait until for username clickable

                Click.on(n11LoginPageElements.FBSIGNIN_BUTTON), // Go to SignUp page
                WaitUntil.the(n11SignupPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(3).seconds(), //Wait until for username clickable

                Switch.toNewWindow(),


                //Type e-mail
                Click.on(n11SignupPageElements.EMAIL_FIELD),
                WaitUntil.the(n11SignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                Click.on(n11SignupPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SignupPageElements.EMAIL_FIELD),


                //Type Password
                Click.on(n11SignupPageElements.PASSWORD_FIELD),
                WaitUntil.the(n11SignupPageElements.LOADING_GIF,isNotCurrentlyVisible()).forNoMoreThan(2).seconds(),
                Click.on(n11SignupPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SignupPageElements.PASSWORD_FIELD),


                Click.on(n11LoginPageElements.FB2SIGNIN_BUTTON), // Go to SignUp page
                WaitUntil.the(n11SignupPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(3).seconds()
                //Wait until for username clickable


        );



    }

    public LoginAsUser(String email_text, String password_text){

        this.email_text = email_text;
        this.password_text = password_text;

    }



    public static LoginAsUser signupThePage(String email_text, String password_text) {
        return instrumented(LoginAsUser.class
                ,email_text,password_text);
    }




}
