package tests.US_Part_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MerchantPage;
import pages.UserPage;
import tests.US_Part_01.US_32;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class US_25 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    MerchantPage merchantPage;


    @Test
    public void test25_01(){
        extentTest = extentReports.createTest("Food Items Page Test","Restaurant Managers should able to view items list in product categories in the Restaurant.");

        merchantPage = new MerchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchantLoginUrl"));
        extentTest.info("Gone to Merchant Login Page");
        MerchantPage.merchantLogin(ConfigReader.getProperty("merchantUsername"), ConfigReader.getProperty("merchantPassword"));
        extentTest.info("Logged in website as a Merchant User");
        ReusableMethods.wait(2);

        merchantPage.foodButtonOnSidebar.click();
        merchantPage.itemsButtonOnSidebar.click();
        extentTest.info("Clicked Items button on Sidebar Food category");
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("items"));
        extentTest.pass("Confirmed that Items button is clickable and redirect proper URL");

        softAssert.assertTrue(merchantPage.itemListOnFood.isDisplayed());
        extentTest.pass("Confirmed that list of Items on Food category is displayed");
        ReusableMethods.wait(1);

        String firstItem = merchantPage.firstItemName.getText().replace("pending", "").replace("publish", "");
        merchantPage.itemListSearchBox.sendKeys(firstItem);
        extentTest.info("Sending item name to Item list SearchBox");
        ReusableMethods.wait(1);
        softAssert.assertTrue(merchantPage.firstItemName.getText().contains(firstItem));
        extentTest.pass("Confirmed that searchBox of Item list works properly and display searched item");
        extentTest.fail("NOTE: SearchBox of Item List cannot be reached manually/with mouse - BUG");

        merchantPage.sortItemButton.click();
        extentTest.info("Clicked Sort Item Button");
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("sort"));
        extentTest.pass("Confirmed that Sort Button is clickable and redirect proper URL");

        Driver.getDriver().navigate().back();

        //attribute list page test

        List<WebElement> pagination = Driver.getDriver().findElements(By.xpath("//*[@id='DataTables_Table_0_paginate']/ul/li"));
        if (pagination.size()>3) {
            extentTest.info("Confirmed that Food Items list more than 1 page");
            checkListPages(merchantPage.inAttributeNextButton);
            extentTest.info("Clicked Next page button on Food Items list ");
            extentTest.pass("Confirmed that on Item list Next page button works properly");
            checkListPages(merchantPage.inAttributePreviousButton);
            extentTest.info("Clicked Previous page button on Food Items list ");
            extentTest.pass("Confirmed that on Item list Previous page button works properly");
            checkListPages(merchantPage.inAttributeNumber2Button);
            extentTest.info("Clicked page 2 button on Food Items list ");
            extentTest.pass("Confirmed that on Item list Page 2 button works properly");
            checkListPages(merchantPage.inAttributeNumber1Button);
            extentTest.info("Clicked page 1 button on Food Items list ");
            extentTest.pass("Confirmed that on Item list Page 1 button works properly");
        } else {
            System.out.println("There is only 1 page on Item list");
            extentTest.info("Confirmed that attribute Food Item list has only 1 page");
        }

        softAssert.assertAll();


    }



    @Test
    public void test25_02(){
        extentTest = extentReports.createTest("Add New Food Item Test","Restaurant Managers should able to add new food items to the item list in the Restaurant's product categories.");

        merchantPage = new MerchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchantLoginUrl"));
        extentTest.info("Gone to Merchant Login Page");
        MerchantPage.merchantLogin(ConfigReader.getProperty("merchantUsername"), ConfigReader.getProperty("merchantPassword"));
        extentTest.info("Logged in website as a Merchant User");
        ReusableMethods.wait(2);

        merchantPage.foodButtonOnSidebar.click();
        merchantPage.itemsButtonOnSidebar.click();
        extentTest.info("Clicked Items button on Sidebar Food category");
        extentTest.pass("Confirmed that Items button is clickable and redirect proper URL");

        merchantPage.addNewItemButton.click();
        extentTest.info("Clicked Add New Item button on Item list");
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("item_create"));
        extentTest.pass("Confirmed that Add New Item button is clickable and redirect proper URL");
        ReusableMethods.wait(1);

        Faker faker = new Faker();
        Random random = new Random();
        int randPrice = random.nextInt(20) + 10;

        String fakeName = faker.gameOfThrones().character();
        merchantPage.newItemNameBox.sendKeys(fakeName);
        extentTest.info("Inputted random name to new item NameBox");

        merchantPage.newItemShortDescriptionBox.sendKeys(faker.gameOfThrones().city());
        extentTest.info("Inputted random to new item ShortDescriptionBox");

        merchantPage.newItemLongDescriptionBox.sendKeys(faker.gameOfThrones().quote());
        extentTest.info("Inputted random to new item LongDescriptionBox");

        merchantPage.newItemPriceBox.sendKeys(String.valueOf(randPrice));
        extentTest.info("Inputted random to new item PriceBox");

        Select select = new Select(merchantPage.newItemUnitBox);
        select.selectByIndex(2);

        select = new Select(merchantPage.newItemCategoryBox);
        select.selectByIndex(3);

        ReusableMethods.wait(1);
        extentTest.info("Selected new item specifications from dropdown menus");


        merchantPage.browseButton.click();
        merchantPage.itemImage.click();
        ReusableMethods.wait(1);

        merchantPage.itemPageAddFilesButton.click();
        extentTest.info("Selected new item photos from featured images");

        ReusableMethods.clickWithJS(merchantPage.featuredBox);
        ReusableMethods.clickWithJS(merchantPage.optionBestSeller);


        ReusableMethods.clickWithJS(merchantPage.backgroundColorSelect);
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(merchantPage.greyBackgroundColor);

        merchantPage.colorOKButton.click();
        extentTest.info("Selected new item background color from background color hex");

        select = new Select(merchantPage.itemStatus);
        select.selectByIndex(2);

        merchantPage.itemTranslationsIcon.click();
        merchantPage.itemJapaneseBox.sendKeys(faker.dragonBall().character());
        extentTest.info("Inputted Japanese translation to new item description");

        merchantPage.itemArabicBox.sendKeys(faker.dragonBall().character());
        extentTest.info("Inputted Arabic translation to new item description");

        ReusableMethods.wait(2);

        ReusableMethods.clickWithJS(merchantPage.itemSaveButton);
        extentTest.info("Clicked Save button and returned the All Items List");


        merchantPage.allItemButton.click();

        softAssert.assertTrue(merchantPage.firstItemListName.getText().contains(fakeName));
        extentTest.pass("Confirmed that new item appeared on Item list");

        ReusableMethods.wait(1);

    }


    @Test
    public void test25_03(){
        extentTest = extentReports.createTest("Edit Food Item Test","Restaurant Managers should able to edit food items on item list in the Restaurant's product categories.");

        merchantPage = new MerchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchantLoginUrl"));
        extentTest.info("Gone to Merchant Login Page");
        MerchantPage.merchantLogin(ConfigReader.getProperty("merchantUsername"), ConfigReader.getProperty("merchantPassword"));
        extentTest.info("Logged in website as a Merchant User");
        ReusableMethods.wait(2);

        merchantPage.foodButtonOnSidebar.click();
        merchantPage.itemsButtonOnSidebar.click();
        extentTest.info("Clicked Items button on Sidebar Food category");
        extentTest.pass("Confirmed that Items button is clickable and redirect proper URL");
        ReusableMethods.wait(1);

        merchantPage.editItemButton.click();
        extentTest.info("Clicked Edit Item Icon on Item list");
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("update"));
        extentTest.pass("Confirmed that Edit Item button is clickable and redirect proper URL");
        ReusableMethods.wait(1);

        Faker faker = new Faker();
        Random random = new Random();
        int randPrice = random.nextInt(20) + 10;
        String fakeName = faker.lordOfTheRings().character();

        merchantPage.newItemNameBox.clear();
        merchantPage.newItemNameBox.sendKeys(fakeName);
        extentTest.info("Inputted edited name to item NameBox");

        merchantPage.newItemShortDescriptionBox.clear();
        merchantPage.newItemShortDescriptionBox.sendKeys(faker.gameOfThrones().city());
        extentTest.info("Inputted edited info to item ShortDescriptionBox");

        merchantPage.newItemLongDescriptionBox.clear();
        merchantPage.newItemLongDescriptionBox.sendKeys(faker.gameOfThrones().quote());
        extentTest.info("Inputted edited info to item LongDescriptionBox");

//        NOTE -> Edit Options doesn't have some specifications
//        merchantPage.newItemPriceBox.clear();
//        merchantPage.newItemPriceBox.sendKeys(String.valueOf(randPrice));
//        extentTest.info("Inputted edited info to item PriceBox");

//        Select select = new Select(merchantPage.newItemUnitBox);
//        select.selectByIndex(1);

         Select select = new Select(merchantPage.newItemCategoryBox);
        select.selectByIndex(2);

        ReusableMethods.wait(1);
        extentTest.info("Selected item specifications from dropdown menus");


        merchantPage.browseButton.click();
        merchantPage.itemSecondImage.click();
        ReusableMethods.wait(1);

        merchantPage.itemPageAddFilesButton.click();
        extentTest.info("Selected item photos from featured images");

        ReusableMethods.clickWithJS(merchantPage.featuredBox);
        ReusableMethods.clickWithJS(merchantPage.optionRecommended);


        ReusableMethods.clickWithJS(merchantPage.backgroundColorSelect);
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(merchantPage.orangeBackgroundColor);

        merchantPage.colorOKButton.click();
        extentTest.info("Selected item background color from background color hex");

        select = new Select(merchantPage.itemStatus);
        select.selectByIndex(1);

        merchantPage.itemTranslationsIcon.click();
        merchantPage.itemJapaneseBox.sendKeys(faker.elderScrolls().creature());
        extentTest.info("Inputted Japanese translation to item description");

        merchantPage.itemArabicBox.sendKeys(faker.elderScrolls().creature());
        extentTest.info("Inputted Arabic translation to item description");

        ReusableMethods.wait(2);

        ReusableMethods.clickWithJS(merchantPage.itemSaveButton);
        extentTest.info("Clicked Save button and returned the All Items List");


        merchantPage.allItemButton.click();

        softAssert.assertTrue(merchantPage.firstItemListName.getText().contains(fakeName));
        extentTest.pass("Confirmed that edited item appeared on Item list");

        ReusableMethods.wait(1);




    }

    @Test
    public void test25_04() {
        extentTest = extentReports.createTest("Delete Food Item Test", "Restaurant Managers should able to delete food items on item list in the Restaurant's product categories.");

        merchantPage = new MerchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchantLoginUrl"));
        extentTest.info("Gone to Merchant Login Page");
        MerchantPage.merchantLogin(ConfigReader.getProperty("merchantUsername"), ConfigReader.getProperty("merchantPassword"));
        extentTest.info("Logged in website as a Merchant User");
        ReusableMethods.wait(2);

        merchantPage.foodButtonOnSidebar.click();
        merchantPage.itemsButtonOnSidebar.click();
        extentTest.info("Clicked Items button on Sidebar Food category");
        extentTest.pass("Confirmed that Items button is clickable and redirect proper URL");
        ReusableMethods.wait(1);

        try {
            merchantPage.deleteItemButton.click();
            extentTest.info("Clicked Delete Item Icon on Item list");
        } catch (ElementClickInterceptedException e) {
            extentTest.fail("Cannot click Delete Item icon on Item List manually or with WebDriver -> ClickIntercepted BUG");
        }



    }


    public void checkListPages(WebElement button){

        SoftAssert softAssert = new SoftAssert();
        MerchantPage merchantPage = new MerchantPage();

        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        String firstname = merchantPage.listFirstColumn.getText();
        jse.executeScript("arguments[0].click();", button);
        ReusableMethods.wait(2);
        softAssert.assertNotEquals(firstname, merchantPage.listFirstColumn.getText());


    }





}
