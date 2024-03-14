package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_link;
import static pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }

}
