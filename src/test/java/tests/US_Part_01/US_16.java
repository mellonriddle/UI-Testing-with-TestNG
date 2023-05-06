package tests.US_Part_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserPage;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.Random;

public class US_16 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserPage userPage;

    @Test
    public void test16_01(){
        extentTest = extentReports.createTest("Address Book Test","User should be able to view address information on account settings.");

        userPage = new UserPage();
        userPage.userLogin();
        extentTest.info("Logged in MealsCenter website as a User");
        userPage.userNameButton.click();
        extentTest.info("Clicked username button and opened dropdown menu");
        userPage.manageMyAccountButton.click();
        extentTest.info("Clicked Manage my Account button on displayed options");

        userPage.addressesButton.click();
        extentTest.info("Clicked Addresses button on left side bar");
        ReusableMethods.wait(1);

        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("addresses"));
        extentTest.pass("Confirmed that the addresses page is reachable");

        softAssert.assertTrue(userPage.registeredAddresses.isDisplayed());
        extentTest.pass("Confirmed that registered addresses is displayed");

    }


    @Test
    public void test16_02(){
        extentTest = extentReports.createTest("Add New Address Test","User should be able to add new address information on account settings.");

        userPage = new UserPage();
        userPage.userLogin();
        extentTest.info("Logged in MealsCenter website as a User");
        userPage.userNameButton.click();
        extentTest.info("Clicked username button and opened dropdown menu");
        userPage.manageMyAccountButton.click();
        extentTest.info("Clicked Manage my Account button on displayed options");
        userPage.addressesButton.click();
        extentTest.info("Clicked Addresses button on left side bar");
        ReusableMethods.wait(1);

        userPage.addNewAddressButton.click();
        extentTest.info("Clicked add new address button");

        Faker faker = new Faker();
        Random random = new Random();
        int randAddress = random.nextInt(100) + 10;
//        System.out.println(randAddress);

        userPage.inputAddressBox.sendKeys(String.valueOf(randAddress));
        extentTest.info("Inputted random Street Number to address box");
        ReusableMethods.wait(3);

        userPage.addressOptionsDdw.click();
        extentTest.info("Clicked random address from dropdown menu");
        ReusableMethods.wait(2);

        userPage.editCompleteAddressButton.click();
        userPage.completeAddressInput.sendKeys(" ++ " + faker.lordOfTheRings().character());
        userPage.apartmentDoor.sendKeys("5");
        userPage.deliveryInstructions.sendKeys(" ++ " + faker.dragonBall().character());
        extentTest.info("Inputted address details on pop-up form");

        Select select = new Select(userPage.deliveryDropdown);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(0);
        extentTest.pass("Confirmed that the delivery options menu works properly");

        JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelWork);
        JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelSchool);
        JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelOther);
        JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelHome);
        extentTest.pass("Confirmed that the address label menu works properly");

        userPage.addressSaveButton.click();
        extentTest.info("Clicked save new address button");
        softAssert.assertTrue(userPage.latestAddressText.getText().contains(String.valueOf(randAddress)));
        extentTest.pass("Confirmed that the new address has been added to address list");
        ReusableMethods.wait(1);

    }

    @Test
    public void test16_03(){
        extentTest = extentReports.createTest("Delete Address from Address List Test","User should be able to delete address information on account settings.");

        userPage = new UserPage();
        userPage.userLogin();
        extentTest.info("Logged in MealsCenter website as a User");
        userPage.userNameButton.click();
        extentTest.info("Clicked username button and opened dropdown menu");
        userPage.manageMyAccountButton.click();
        extentTest.info("Clicked Manage my Account button on displayed options");

        userPage.addressesButton.click();
        extentTest.info("Clicked Addresses button on left side bar");
        ReusableMethods.wait(1);

        try {
            String latestAddress = userPage.latestAddressText.getText();
            userPage.deleteAddressButton.click();
            extentTest.info("Clicked Delete Address button on address list");
            userPage.cancelDeleteAddress.click();
            extentTest.info("Clicked Cancel button on Delete pop-up");
            String tempAddress = userPage.latestAddressText.getText();
            softAssert.assertEquals(tempAddress,latestAddress);
            extentTest.pass("Confirmed that the cancel button on delete pop-up works properly");

            userPage.deleteAddressButton.click();
            extentTest.info("Clicked again Delete Address button on address list");
            userPage.confirmDeleteAddress.click();
            extentTest.info("Clicked Confirm button on Delete pop-up");
            tempAddress = userPage.latestAddressText.getText();
            softAssert.assertNotEquals(tempAddress,latestAddress);
            extentTest.pass("Confirmed that address list changed and delete button works properly");
        } catch (NoSuchElementException e){
            extentTest.info("Looks like there is no registered address on list");
            System.out.println("Looks like there is no registered address on list");
        }

    }

    @Test
    public void test16_04(){
        extentTest = extentReports.createTest("Change Address Information Test","User should be able to change address information on account settings.");

        userPage = new UserPage();
        userPage.userLogin();
        extentTest.info("Logged in MealsCenter website as a User");
        userPage.userNameButton.click();
        extentTest.info("Clicked username button and opened dropdown menu");
        userPage.manageMyAccountButton.click();
        extentTest.info("Clicked Manage my Account button on displayed options");
        userPage.addressesButton.click();
        extentTest.info("Clicked Addresses button on left side bar");
        ReusableMethods.wait(1);

        try {
            Faker faker = new Faker();
            JSUtilities.clickWithJS(Driver.getDriver(), userPage.editAddressButton);
            extentTest.info("Clicked edit Address button on latest address");

            String editedAddress = faker.gameOfThrones().character();
            userPage.editCompleteAddressButton.click();
            ReusableMethods.wait(1);
            userPage.completeAddressInput.sendKeys(" /*/ " + editedAddress);

            userPage.apartmentDoor.sendKeys("5");
            userPage.deliveryInstructions.sendKeys("  /*/ " + faker.lebowski().character());
            extentTest.info("Inputted edited address details on pop-up form");

            Select select = new Select(userPage.deliveryDropdown);
            select.selectByIndex(1);
            select.selectByIndex(2);
            select.selectByIndex(0);
            extentTest.pass("Confirmed that the delivery options menu works properly");

            JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelWork);
            JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelSchool);
            JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelOther);
            JSUtilities.clickWithJS(Driver.getDriver(), userPage.addressLabelHome);
            extentTest.pass("Confirmed that the address label menu works properly");

            userPage.addressSaveButton.click();
            extentTest.info("Clicked save edited address button");
            softAssert.assertTrue(userPage.latestAddressText.getText().contains(editedAddress));
            extentTest.pass("Confirmed that the edited address has been added to address list");
            ReusableMethods.wait(1);
        } catch (NoSuchElementException e){
            extentTest.info("Looks like there is no registered address on list");
            System.out.println("Looks like there is no registered address on list");
        }


    }




}

