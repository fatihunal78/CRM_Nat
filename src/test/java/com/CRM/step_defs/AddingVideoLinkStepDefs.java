package com.CRM.step_defs;

import com.CRM.pages.AppreciationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingVideoLinkStepDefs {
    @When("user clicks on the video icon")
    public void user_clicks_on_the_video_icon() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.videoIcon.click();
    }

    @Then("user is able to insert a valid vimeo video link")
    public void user_is_able_to_insert_a_valid_vimeo_video_link() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.videoLinkField.sendKeys("https://vimeo.com/76979871");

    }

    @Then("user should be able to Save video link")
    public void user_should_be_able_to_Save_video_link() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.SaveVideoBtn.click();


    }
}
