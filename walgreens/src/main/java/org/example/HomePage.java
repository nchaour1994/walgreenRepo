package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//strong[text()='Account']")
    WebElement accountBtn;
    @FindBy(css = "#pf-dropdown-signin")
    WebElement signInBtn;
    @FindBy(xpath = "//*[@class='default-dropdown account-dropdown show']")
    WebElement dropdown;


    public void clickOnAccountBtn(){
        accountBtn.click();
    }
    public void clickOnSignInBtn(){
        signInBtn.click();
    }
    public boolean checkIfDropDownIsDisplayed(){
        return dropdown.isDisplayed();

    }
}
