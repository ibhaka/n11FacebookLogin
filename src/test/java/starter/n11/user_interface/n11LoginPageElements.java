package starter.n11.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class n11LoginPageElements {

    public static Target SIGNIN_BUTTON = Target.the("Giriş Yap").locatedBy(".btnSignIn");
    public static Target FBSIGNIN_BUTTON = Target.the("Facebook ile Giriş Yap").locatedBy(".facebookBtn");

    public static Target FB2SIGNIN_BUTTON = Target.the("Giriş Yap").locatedBy("#loginbutton");

}
