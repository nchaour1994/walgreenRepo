package login;

import base.CommonApi;
import org.example.HomePage;
import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLogin extends CommonApi {




    @Test
    public void testLogin(){
        HomePage homePage= new HomePage(driver);
        LoginPage loginPage=new LoginPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        homePage.clickOnAccountBtn();
        Assert.assertTrue(homePage.checkIfDropDownIsDisplayed());
        homePage.clickOnSignInBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        loginPage.typeOnUnsername();
        Assert.assertEquals(loginPage.getUsername(),username);
        loginPage.typeOnpassword();
        Assert.assertEquals(loginPage.getPassword(),password);
         loginPage.clickOnSubmit();
        waitFor(3);
       // Assert.assertEquals(driver.getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");

    }
    @Test
    public void testLoginWithInvalidCredentials(){
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        driver.findElement(By.xpath("//strong[text()='Account']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='default-dropdown account-dropdown show']")).isDisplayed());
        driver.findElement(By.cssSelector("#pf-dropdown-signin")).click();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        driver.findElement(By.cssSelector("#user_name")).sendKeys("john1899@gmail.com");
        Assert.assertEquals(driver.findElement(By.cssSelector("#user_name")).getAttribute("value"),"john1899@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("John1899test");
        Assert.assertEquals(driver.findElement(By.cssSelector("#user_password")).getAttribute("value"),"John1899test");
        driver.findElement(By.cssSelector("#submit_btn")).click();
       waitFor(2);
      //  Assert.assertEquals(driver.getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");

    }


    // driver.navigate().refresh();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().to("https://photo.walgreens.com/store/home");
}
