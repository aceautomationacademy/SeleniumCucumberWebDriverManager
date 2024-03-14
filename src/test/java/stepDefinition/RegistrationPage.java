package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;
import static pages.RegistrationPage.visibility_user_registration_page;

public class RegistrationPage {

    @Then("User should be able to view the Registration page")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        visibility_user_registration_page();
    }

}
