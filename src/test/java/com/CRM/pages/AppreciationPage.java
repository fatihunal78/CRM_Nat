package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage  {
    public AppreciationPage (){ PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//*[@id='bx-b-quote-blogPostForm']/span")
    public WebElement quote;

    @FindBy(css = ".bxhtmled-quote")
    public WebElement quoteField;

    @FindBy (xpath = "//*[@id='bx-b-link-blogPostForm']/span")
    public WebElement linkIcon;

    @FindBy (css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy (xpath = "//*[@title='Insert video']")
    public WebElement videoIcon;

    @FindBy (css = ".bxhtmled-90-input")
    public WebElement videoLinkField;

    @FindBy (css = "#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement saveBtn;

    @FindBy (xpath = "//input[@class='adm-btn-save']")
    public WebElement SaveVideoBtn;


    @FindBy (xpath = "//body[@contenteditable = 'true']")
    public WebElement textField;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement msgBoxFrame;




}
