package com.CRM.step_defs;


import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        LoginPage loginPage = new LoginPage();
        loginPage.Username.sendKeys(ConfigurationReader.get("hr_username"));
        loginPage.Password.sendKeys(ConfigurationReader.get("hr_password"));
        loginPage.loginBtn.click();

        BrowserUtils.waitFor(2);

    }

}
