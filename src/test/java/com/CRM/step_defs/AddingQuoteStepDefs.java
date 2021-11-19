package com.CRM.step_defs;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.AppreciationPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingQuoteStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    AppreciationPage appreciationPage = new AppreciationPage();


    @Given("the user navigates to More tab on the main page and clicks Appreciation")
    public void the_user_navigates_to_More_tab_on_the_main_page_and_clicks_Appreciation() {

       activityStreamPage.more.click();
       activityStreamPage.appreciation.click();
    }

    @When("user clicks quote sign")
    public void user_clicks_quote_sign() {

        appreciationPage.quote.click();
    }

    @Then("quote can be added")
    public void quote_can_be_added() {
        Driver.get().switchTo().frame(appreciationPage.msgBoxFrame);
        appreciationPage.quoteField.sendKeys("sample text");
        Driver.get().switchTo().defaultContent();
  }

}