package com.CRM.step_defs;

import com.CRM.pages.AppreciationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingURLStepDefs {

    @When("user clicks URL sign")
    public void user_clicks_URL_sign() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.linkIcon.click();
    }

    @Then("user is able to insert a valid link and Link text")
    public void user_is_able_to_insert_a_valid_link_and_Link_text() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.linkText.sendKeys("https://qa.azulcrm.com/stream/");
    }

    @Then("user should be able to Save")
    public void user_should_be_able_to_Save() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.saveBtn.click();

    }
}
