package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage  {
    public ActivityStreamPage(){PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id= "feed-add-post-form-link-text")
    public WebElement more;

    @FindBy(linkText= "Appreciation")
    public WebElement appreciation;

}
