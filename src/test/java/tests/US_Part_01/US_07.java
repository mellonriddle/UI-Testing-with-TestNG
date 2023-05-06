package tests.US_Part_01;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserPage;
import utilities.*;

public class US_07 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserPage userPage;


    @Test
    public void test_0701() {

        extentTest = extentReports.createTest("HomePage Contact Link Test","HomePage should have Contact Us link.");

        Driver.getDriver().get(ConfigReader.getProperty("customerUrl"));
        extentTest.info("Gone to MealsCenter HomePage");
        ReusableMethods.wait(1);

        userPage = new UserPage();
        userPage.cookie.click();
        extentTest.info("Cookies accepted");
        ReusableMethods.wait(1);
        softAssert.assertTrue(userPage.contactUsLink.isDisplayed());
        extentTest.pass("Confirmed that Contact Us Link has been displayed");

        JSUtilities.clickWithJS(Driver.getDriver(), userPage.contactUsLink);
        extentTest.info("Clicked contact us button");


        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contactus"));
        extentTest.pass("Confirmed that Contact Us Link is clickable and redirect proper URL");

    }

    @Test
    public void test_0702() {
        extentTest = extentReports.createTest("Contact Page information Test","Contact Us Page should contain Phone and Email info.");
        Driver.getDriver().get(ConfigReader.getProperty("customerUrl"));
        extentTest.info("Gone to MealsCenter HomePage");
        ReusableMethods.wait(1);

        userPage = new UserPage();
        userPage.cookie.click();
        extentTest.info("Cookies accepted");
        ReusableMethods.wait(1);

        JSUtilities.clickWithJS(Driver.getDriver(), userPage.contactUsLink);
        extentTest.info("Clicked contact us button");

        softAssert.assertTrue(userPage.contactPhone.isDisplayed());
        extentTest.pass("Confirmed that Contact Us page has phone info");

        softAssert.assertTrue(userPage.contactEmail.isDisplayed());
        extentTest.pass("Confirmed that Contact Us page has email info");

    }

    @Test
    public void test_0703() {

        extentTest = extentReports.createTest("Contact Us form Test","Contact Us Page's form should work properly.");
        Driver.getDriver().get(ConfigReader.getProperty("customerUrl"));
        extentTest.info("Gone to MealsCenter HomePage");
        ReusableMethods.wait(1);

        userPage = new UserPage();
        userPage.cookie.click();
        extentTest.info("Cookies accepted");
        ReusableMethods.wait(1);

        JSUtilities.clickWithJS(Driver.getDriver(), userPage.contactUsLink);
        extentTest.info("Clicked contact us button");

        Faker faker = new Faker();
        userPage.contactFormName.sendKeys(faker.name().firstName());
        userPage.contactFormEmail.sendKeys(faker.internet().emailAddress());
        userPage.contactFormText.sendKeys(faker.internet().macAddress());
        extentTest.info("Inputted name and email address to form");

        userPage.contactPageSubmitButton.click();
        extentTest.info("Clicked submit button");

        ReusableMethods.wait(2);

        softAssert.assertTrue(userPage.contactSuccessText.getText().contains("request has been sent"));
        extentTest.pass("Confirmed that contact request has been sent text displayed");

        extentTest.pass("Confirmed that Contact Us form works properly");



    }






}
