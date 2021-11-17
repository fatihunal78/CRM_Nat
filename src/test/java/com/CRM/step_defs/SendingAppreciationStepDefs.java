package com.CRM.step_defs;

import com.CRM.pages.AppreciationPage;
import io.cucumber.java.en.When;

public class SendingAppreciationStepDefs {
    @When("user inserts text in the message box")
    public void user_inserts_text_in_the_message_box() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.textField.sendKeys("sample message");
    }

    @When("user should be able to send Appreciation message")
    public void user_should_be_able_to_send_Appreciation_message() {
        AppreciationPage appreciation = new AppreciationPage();
        appreciation.saveBtn.click();
    }
}
