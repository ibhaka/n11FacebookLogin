package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.login.LoginAsUser;
import starter.n11.tasks.NavigateTo;


public class N11FbLoginDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the login page")
    public void userLaunchBrowserAndOpenTheLoginPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.then11soHomePage());

    }
    @When("user sign in with valid credentials on facebook")
    public void userSignInWithValidCredentialsOnFacebook() {
        actor.attemptsTo(LoginAsUser.signupThePage(
                "gelmamelmo@vusra.com",
                "user1234"));
    }



    @Then("user sign in successfully")
    public void userSignInSuccessfully() {

        actor.attemptsTo(

        );

    }
}
