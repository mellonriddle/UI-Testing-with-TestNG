package tests.US_Part_01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US_01 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test_0101() {

        extentTest = extentReports.createTest("Accessibility Test","MealsCenter Website HomePage should be accessible.");

        Driver.getDriver().get(ConfigReader.getProperty("customerUrl"));
        extentTest.info("Gone to MealsCenter HomePage");
        ReusableMethods.wait(1);

        String expectedTitle = "Meals Center";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.pass("Confirmed that the website title is 'Meals Center'");


        String expectedURL = "https://qa.mealscenter.com/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualURL,expectedURL);

        extentTest.pass("Confirmed that the MealsCenter HomePage is accessible");


    }

}
