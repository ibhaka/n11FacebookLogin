package starter.n11.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class n11SignupPageElements {


    public static Target EMAIL_FIELD  = Target.the("Email").locatedBy("#email");
    public static Target PASSWORD_FIELD = Target.the("Password").locatedBy("#pass");
    public static Target LOADING_GIF = Target.the("loading").locatedBy("#dialogLoading");

}
