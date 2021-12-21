package starter.n11.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11.user_interface.n11LoginPage;


public class NavigateTo {
    public static Performable then11soHomePage() {
        return Task.where("{0} opens the n11 so page",
                Open.browserOn().the(n11LoginPage.class));
    }
}
