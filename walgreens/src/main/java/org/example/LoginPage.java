package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#user_name")
    WebElement usernameField;
    @FindBy(css = "#user_password")
    WebElement passwordFiled;
    @FindBy(css = "#submit_btn")
    WebElement sumbitBtn;

    public void typeOnUnsername(){
        usernameField.sendKeys("john1899@gmail.com");
    }
    public void typeOnpassword(){
        passwordFiled.sendKeys("John1899test");
    }
    public void clickOnSubmit(){
        sumbitBtn.click();
    }
    public String getUsername(){
         return usernameField.getAttribute("value");
    }
    public String getPassword(){
        return passwordFiled.getAttribute("value");
    }



}
