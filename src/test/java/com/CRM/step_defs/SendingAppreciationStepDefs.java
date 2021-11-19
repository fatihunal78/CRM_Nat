package com.CRM.step_defs;

import com.CRM.pages.AppreciationPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.When;

public class SendingAppreciationStepDefs {
    AppreciationPage appreciation = new AppreciationPage();

    @When("user inserts text in the message box")
    public void user_inserts_text_in_the_message_box() {
        Driver.get().switchTo().frame(appreciation.msgBoxFrame);
        appreciation.textField.sendKeys("sample message");
        Driver.get().switchTo().defaultContent();
    }

    @When("user should be able to send Appreciation message")
    public void user_should_be_able_to_send_Appreciation_message() {

        BrowserUtils.waitFor(1);
        appreciation.saveBtn.click();
    }
}
