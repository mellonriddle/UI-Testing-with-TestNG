package tests.US_Part_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US_05 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserPage userPage;

    @Test(priority = 10)
    public void test_0501() {

        extentTest = extentReports.createTest("Forgot Password button Test","Forgot password button should work properly on user Login page.");
        userPage = new UserPage();
        userPage.enterLoginPage();
        extentTest.info("Gone to MealsCenter User Login Page");
        softAssert.assertTrue(userPage.forgotPasswordButton.isDisplayed());
        extentTest.pass("Confirmed that forgot password button has been displayed");
        userPage.forgotPasswordButton.click();
        extentTest.info("Clicked forgot password button");
        String expectedUrl = "account/forgot_pass";
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
        extentTest.pass("Confirmed that forgot password button is clickable and redirect proper URL");
        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test(priority = 20)
    public void test_0502 () {


        extentTest = extentReports.createTest("SignUp button Test","SignUp button should work properly on user Login page");

        userPage = new UserPage();
        userPage.enterLoginPage();
        extentTest.info("Gone to MealsCenter User Login Page");
        softAssert.assertTrue(userPage.loginSignUpButton.isDisplayed());
        extentTest.pass("Confirmed that SignUp button has been displayed");
        userPage.loginSignUpButton.click();
        extentTest.info("Clicked signUp button");
        ReusableMethods.wait(2);
        String expectedText = "Register";
        String heading = Driver.getDriver().findElement(By.tagName("h5")).getText();
        softAssert.assertTrue(heading.contains(expectedText));
        extentTest.pass("Confirmed that signUp button is clickable and redirect proper URL");
        softAssert.assertAll();
        Driver.closeDriver();


    }

    @Test(priority = 30)
    public void test_0503() {

        extentTest = extentReports.createTest("RememberMe checkbox Test","Remember Me checkbox should work properly on user Login page");

        userPage = new UserPage();
        userPage.enterLoginPage();
        extentTest.info("Gone to MealsCenter User Login Page");
        ReusableMethods.wait(1);
        softAssert.assertTrue(userPage.rememberMeLabel.isDisplayed());
        extentTest.pass("Confirmed that RememberMe checkbox has been displayed");
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();", userPage.rememberMeButton);

        ReusableMethods.wait(1);
        softAssert.assertTrue(userPage.rememberMeButton.isSelected());
        extentTest.pass("Confirmed that RememberMe checkbox is clickable");
        softAssert.assertAll();

        Driver.closeDriver();

    }

    @DataProvider
    public static Object[][] information() {

        String[][] informationList = {{"kubra@gmail.com","turan"},
                                     {"hakan@gmail.com","ceylan"},
                                     {"hakan@gmail.com","turan"}};
        return informationList ;
    }

    @Test(dataProvider = "information",priority = 40)
    public void test_0504 (String email, String password) {

        extentTest = extentReports.createTest("False Login Test","User should not able to login website without correct credentials");

        userPage = new UserPage();
        userPage.enterLoginPage();
        extentTest.info("Gone to MealsCenter User Login Page");
        ReusableMethods.wait(1);
        userPage.emailBox.sendKeys(email);
        userPage.passwordBox.sendKeys(password);
        extentTest.info("Input valid but incorrect email/password");
        userPage.loginSignInButton.click();
        extentTest.info("Clicked sign in button");
        ReusableMethods.wait(2);
        softAssert.assertTrue(userPage.alertText.isDisplayed());
        extentTest.pass("Confirmed that user can not sign in without correct credentials");
        softAssert.assertAll();

        Driver.closeDriver();

    }


    @Test(priority = 50, groups = "smoke")
    public void test_0505(){

        extentTest = extentReports.createTest("True Login Test","User should able to login website with correct credentials");

        userPage = new UserPage();
        userPage.userLogin();
        extentTest.info("Gone to MealsCenter User Login Page");
        ReusableMethods.wait(2);

        System.out.println(userPage.userNameButton.getText());
        softAssert.assertTrue(userPage.userNameButton.isDisplayed());
        extentTest.pass("Confirmed that user can sign in with correct credentials");
        softAssert.assertAll();

        Driver.closeDriver();


    }
}