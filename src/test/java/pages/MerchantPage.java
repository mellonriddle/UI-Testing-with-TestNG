package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

public class MerchantPage {

    public MerchantPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // TAMER'S

    // MerchantPage > Food Button on Sidebar
    @FindBy(xpath = "//li[7]/a")
    public WebElement foodButtonOnSidebar;

    // MerchantPage > Items Button on Sidebar
    @FindBy(xpath = "//a[text()='Items']")
    public WebElement itemsButtonOnSidebar;

    // MerchantPage > Items page - Items List
    @FindBy(id = "DataTables_Table_0")
    public WebElement itemListOnFood;

    // MerchantPage > Items page - SearchBox
    @FindBy(xpath ="//input[@type='search']")
    public WebElement itemListSearchBox;

    // MerchantPage > Items page - First Item Name on List
    @FindBy(xpath = "//tr[1]/td[3]/h6")
    public WebElement firstItemName;

    // MerchantPage > Items page - Sort Item Button
    @FindBy(xpath = "(//a[@type='button'])[2]")
    public WebElement sortItemButton;

    // MerchantPage > Items page - Add New Food Item Button
    @FindBy(xpath = "//div[@class='p-2']/a")
    public WebElement addNewItemButton;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_name")
    public WebElement newItemNameBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_short_description")
    public WebElement newItemShortDescriptionBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement newItemLongDescriptionBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_price")
    public WebElement newItemPriceBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_unit")
    public WebElement newItemUnitBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_category_selected")
    public WebElement newItemCategoryBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "select2-AR_item_category_selected-container")
    public WebElement sampleItemCategory;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//button[text()='Browse']")
    public WebElement browseButton;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//ul/li[2]/img")
    public WebElement itemImage;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//ul/li[10]/img")
    public WebElement itemSecondImage;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "(//div[3]/div/div[2])[5]/button")
    public WebElement itemPageAddFilesButton;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_featured")
    public WebElement featuredBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//option[@value='best_seller']")
    public WebElement optionBestSeller;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//option[@value='recommended']")
    public WebElement optionRecommended;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_color_hex")
    public WebElement backgroundColorSelect;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//div[1]/span[4]")
    public WebElement greyBackgroundColor;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//div[5]/span[2]")
    public WebElement orangeBackgroundColor;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//button[@class='sp-choose']")
    public WebElement colorOKButton;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_status")
    public WebElement itemStatus;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//div[@class='p-2']")
    public WebElement itemTranslationsIcon;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_name_translation_ja")
    public WebElement itemJapaneseBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(id = "AR_item_item_name_translation_ar")
    public WebElement itemArabicBox;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement itemSaveButton;

    // MerchantPage > Items page - Add New Item Page
    @FindBy(xpath = "//a[text()='All Item']")
    public WebElement allItemButton;

    // MerchantPage > Items page - Item List
    @FindBy(xpath = "(//h6)[2]")
    public WebElement firstItemListName;

    // MerchantPage > Items page - Edit Item Button
    @FindBy(xpath = "(//td[6]/div/a)[1]")
    public WebElement editItemButton;

    // MerchantPage > Items page - Edit Item Button
    @FindBy(xpath = "(//td[6]/div/a)[2]")
    public WebElement deleteItemButton;


    ////////////         PART II        //////////////////


    // MerchantPage > Dashboard / totalOrdersImg
    @FindBy(xpath = "(//div[@class='report-inner'])[1]")
    public WebElement totalOrdersImg;

    // MerchantPage > Dashboard / totalCancelImg
    @FindBy(xpath = "(//div[@class='report-inner'])[2]")
    public WebElement totalCancelImg;

    // MerchantPage > Dashboard / totalRefundImg
    @FindBy(xpath = "(//div[@class='report-inner'])[3]")
    public WebElement totalRefundImg;

    // MerchantPage > Dashboard / totalSalesImg
    @FindBy(xpath = "(//div[@class='report-inner'])[4]")
    public WebElement totalSalesImg;

    // MerchantPage > Dashboard / salesWeekBox
    @FindBy(xpath = "(//div[@class='card'])[1]")
    public WebElement salesWeekBox;

    // MerchantPage > Dashboard / earningWeekBox
    @FindBy(xpath = "(//div[@class='card'])[2]")
    public WebElement earningWeekBox;

    // MerchantPage > Dashboard / balanceBox
    @FindBy(xpath = "(//div[@class='card'])[3]")
    public WebElement balanceBox;

    // MerchantPage > Dashboard / orderReceivedBox
    @FindBy(xpath = "(//div[@class='card-body'])[4]")
    public  WebElement orderReceivedBox;

    // MerchantPage > Dashboard / todayDeliveredBox
    @FindBy(xpath = "(//div[@class='card-body'])[5]")
    public  WebElement todayDeliveredBox;

    // MerchantPage > Dashboard / todayRefundBox
    @FindBy(xpath = "(//div[@class='card-body'])[7]")
    public  WebElement todayRefundBox;

    // MerchantPage > Dashboard / todaySalesBox
    @FindBy(xpath = "(//div[@class='card-body'])[6]")
    public  WebElement todaySalesBox;

    // MerchantPage > Dashboard / lastOrdersBox
    @FindBy(xpath = "(//div[@class='card-body'])[8]")
    public  WebElement lastOrdersBox;

    // MerchantPage > Dashboard / popularItemsBox
    @FindBy(xpath = "(//div[@class='card-body'])[9]")
    public WebElement popularItemsBox;

    // MerchantPage > Dashboard / salesOverviewGraph
    @FindBy(xpath = "(//div[@class='card-body'])[10]")
    public WebElement salesOverviewGraph;

    // MerchantPage > Dashboard / topCustomersBox
    @FindBy(xpath = "(//div[@class='card-body'])[11]")
    public WebElement topCustomersBox;

    // MerchantPage > Dashboard / checkoutReviewGraph
    @FindBy(xpath = "(//div[@class='card-body'])[12]")
    public WebElement checkoutReviewGraph;

    // MerchantPage > Dashboard / allButton
    @FindBy(xpath = "(//li[@class='nav-item']/a)[1]")
    public WebElement allButton;

    // MerchantPage > Dashboard / processingButton
    @FindBy(xpath = "(//a[text()='Processing'])[1]")
    public WebElement processingButton;

    // MerchantPage > Dashboard / readyButton
    @FindBy(xpath = "(//li[@class='nav-item']/a)[3]")
    public WebElement readyButton;

    // MerchantPage > Dashboard / completedButton
    @FindBy(xpath = "(//li[@class='nav-item']/a)[4]")
    public WebElement completedButton;

    // MerchantPage > Dashboard / popularItemsButton
    @FindBy(xpath = "(//li[@class='nav-item']/a)[5]")
    public WebElement populerItemsButton;

    // MerchantPage > Dashboard / last30DaysSalesButton
    @FindBy(xpath = "(//li[@class='nav-item']/a)[6]")
    public WebElement last30DaysSalesButton;

    // MerchantPage > Dashboard / allCustomerButton
    @FindBy(xpath = "//a[text()='View All Customer']")
    public WebElement allCustomerButton;

    // MerchantPage > Dashboard / checkoutReviewButton
    @FindBy(xpath = "//a[text()='Checkout All Reviews']")
    public WebElement checkoutReviewButton;

    //MerchantPage > Dashboard /attributesButton
    @FindBy(xpath = "//a[text()='Attributes']")
    public WebElement attributesButton;

    //MerchantPage > Dashboard /sizeButton
    @FindBy(xpath = "//a[text()='Size']")
    public WebElement sizeButton;

    //MerchantPage > Dashboard /ingredientsButton
    @FindBy(xpath = "//a[text()='Ingredients']")
    public WebElement ingredientsButton;

    //MerchantPage > Dashboard /cookingReferenceButton
    @FindBy(xpath = "//a[text()='Cooking Reference ']")
    public WebElement cookingReferenceButton;

    //MerchantPage >Dashboard >Size-IngredientsButton-CookingReferenceButton / allAttributeListButton
    @FindBy(xpath = "//div[@class='breadcrumbs']/a")
    public WebElement allAttributeListButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / InAttributeSearchBoxButton
    @FindBy(xpath = "//input[@type='search']")
    public WebElement inAttributeSearchBoxButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeAddNewButton
    @FindBy(xpath = "//a[@type='button']")
    public WebElement inAttributeAddNewButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeActionsButton
    @FindBy(xpath = "//*[text()='Actions']")
    public WebElement inAttributeActionsButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeNameButton
    @FindBy(xpath = "//*[text()='Name']")
    public WebElement inAttributeNameButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeNumberButton
    @FindBy(xpath = "//*[text()='#']")
    public WebElement inAttributeNumberButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributePreviousButton
    @FindBy(xpath = "//*[@id='DataTables_Table_0_previous']/a")
    public WebElement inAttributePreviousButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeNumber1Button
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement inAttributeNumber1Button;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeNumber2Button
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement inAttributeNumber2Button;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeNextButton
    @FindBy(xpath = "//*[@id='DataTables_Table_0_next']/a")
    public WebElement inAttributeNextButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributePencilIcon
    @FindBy(xpath = "(//a[@data-toggle='tooltip'])[1]")
    public WebElement inAttributePencilIcon;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeTrashIcon
    @FindBy(xpath = "(//a[@data-toggle='tooltip'])[2]")
    public WebElement inAttributeTrashIcon;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / attributeListText
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement attributeListText;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement listFirstColumn;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listSecondColumn
    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement listSecondColumn;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / inAttributeSearchIcon
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement inAttributesearchIcon;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath= "(//input[@type='text'])[1]")
    public WebElement addAttributeNameBox;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select']")
    public WebElement statusBox;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "(//div[@class='p-2'])[2]")
    public WebElement plusIcon;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement japaneseBox;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath= "(//input[@type='text'])[3]")
    public WebElement arabicBox;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement saveButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement updateAlert;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement cancelButton;

    //MerchantPage > Dashboard >Size-IngredientsButton-CookingReferenceButton / listFirstColumn
    @FindBy(xpath = "//div[@class='modal-footer']/a")
    public WebElement deleteConfirmButton;


    //_______________________________________________ WITHOUT LOGIN _______________________________________________

    // Merchant Login / Remember me
    @FindBy(xpath = "//label[@class='dim custom-control-label']")
    public WebElement merchantRememberxLink;

    // Merchant Login / Forgot Password
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement merchantForgotxLink;

    // Merchant Login / ForgotPassword > Emailbox
    @FindBy(id = "AR_merchant_login_email_address")
    public WebElement merchantEmailxLink;

    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement merchantEmailxLink2;


    // Merchant Login / ForgotPassword > RequestEmailButton
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement merchantEmailButton;

    // Merchant Login / ForgotPassword > ErrorMessage
    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement merchantEmessagexLabel;

    // Merchant Login / ForgotPassword > Login Here
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement merchantxLink;

    // Merchant Login / Kisi Gorsel
    @FindBy(xpath = "//div[@class='col-md-6 m-0 p-0 left-container']")
    public WebElement merchantxImageProfile;

    // Merchant Login / Logo
    @FindBy(xpath = "//div[@class='logok-wrapper']")
    public WebElement merchantxLogo;

    // Merchant Login / Merchant Login text
    @FindBy(xpath = "//h6[@class='mb-4']")
    public WebElement merchantxLabel;

    // Merchant Login / App store button
    @FindBy(xpath = "(//div[@class='p-2'])[1]")
    public WebElement merchantAppxButton;

    // Merchant Login / Google play button
    @FindBy(xpath = "(//div[@class='p-2'])[2]")
    public WebElement merchantGooglexButton;



    //___________________________________________________________________________________________________________


    //__________________________________________________ AFTER LOGIN ____________________________________________


    // Homepage > Login > Orders
    @FindBy(xpath = "(//a[@href='javascript:;'])[2]")
    public WebElement orders;

    // Homepage > Login > Orders/All Orders
    @FindBy(xpath = "//a[text()='All Orders']")
    public WebElement allOrders;

    // Homepage > Login > Orders/All Orders/Order history page
    @FindBy(xpath = "//h5[text()='Order history']")
    public WebElement orderHistory;

    // Homepage > Login > Orders/All Orders/Order history/Orders
    @FindBy(xpath = "//p[text()='Orders']")
    public WebElement ordersTotal;

    // Homepage > Login > Orders/All Orders/Order history/Cancel
    @FindBy(xpath = "//p[text()='Cancel']")
    public WebElement cancel;

    // Homepage > Login > Orders/All Orders/Order history/Total refund
    @FindBy(xpath = "//p[text()='Total refund']")
    public WebElement totalRefund;

    // Homepage > Login > Orders/All Orders/Order history/Start date -- End date
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement startEndDate;

    // Homepage > Login > Orders/All Orders/Order history/Start date -- End date/Last 30 Days
    @FindBy(xpath = "//li[text()='Last 30 Days']")
    public WebElement last30DaysDate;


    // Homepage > Login > Orders/All Orders/Order history/Filters Button
    @FindBy(xpath = "//div[text()='Filters']")
    public WebElement filtersButton;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button
    @FindBy(xpath = "//div[@class='d-flex'])[36]")
    public WebElement filtersButton1;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By customer
    @FindBy(xpath = "//b[text()='By customer']")
    public WebElement byCustomer;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By customer Drop Down Menu
    @FindBy(xpath = "//span[@aria-labelledby='select2-d6nv-container']")
    public WebElement byCustomerDropDownMenu;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By customer Drop Down Menu/customer1 customer1
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[4]")
    public WebElement byCustomerDropDownMenuSecilenMenu;


    /////////////////////////////////////////////////////////////////////////


    // MerchantPage > Orders
    @FindBy(linkText = "Orders")
    public WebElement ordersDDM;

    // MerchantPage > Orders > New Orders
    @FindBy(linkText = "New Orders")
    public WebElement newOrdersDdm;

    // MerchantPage > Orders > Orders Processing
    @FindBy(linkText = "Orders Processing")
    public WebElement ordersProcessingDdm;

    // MerchantPage > Orders > Orders Ready
    @FindBy(linkText = "Orders Ready")
    public WebElement ordersReadyDdm;

    // MerchantPage > Orders > Completed
    @FindBy(linkText = "Completed")
    public WebElement orderCompletedDdm;

    // MerchantPage > Orders > Scheduled
    @FindBy(linkText = "Scheduled")
    public WebElement orderScheduledDdm;

    // MerchantPage > Orders > All Orders
    @FindBy(xpath = "All Orders")
    public WebElement orderAllOrdersDdm;

    //MerchantPage > backoffice > orders > new
    @FindBy(xpath = "//*[@placeholder='Filter by order number or customer name']")
    public WebElement orderFilterBox;

    //MerchantPage >  backoffice > orders > new
    @FindBy(xpath = "//span[text()='Accepted']")
    public WebElement acceptedButton;

    //MerchantPage >  backoffice > orders > new
    @FindBy(xpath = "(//h5[@class='m-0'])[3]")
    public WebElement orderIdInformation;

    //MerchantPage >  backoffice > orders > orders processing
    @FindBy(xpath = "//span[text()='Ready for pickup']")
    public WebElement readiyForPickupButton;

    //MerchantPage >  backoffice > orders > ready
    @FindBy(xpath = "//span[text()='Delivered']")
    public WebElement deliveredButton;

    public static WebElement couponDateClick(int index) {
        String xpath = "(//td)[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement couponKontrol;

    @FindBy(xpath = "//i[@class='zmdi zmdi-border-color']")
    public WebElement updateIcon;

    //Merchand > Login / Kullanıcı adı
    @FindBy(id = "dropdownMenuLink")
    public WebElement kullaniciAdiField;

    @FindBy(xpath = "//a[@class='dropdown-item'][1]")
    public WebElement profilField;

    //Merchand > Login > Kullanıcı adı > Profil/FirstName
    @FindBy(xpath = "(//label[@class='required'])[1]")
    public WebElement profilFirstNameField;

    //Orders / Order Processing
    @FindBy(xpath = "//a[text()='Orders Processing']")
    public WebElement orderProcesingField;

    //Orders > Order Processing / Raedy for Picup
    @FindBy(xpath = "//span[text()='Ready for pickup']")
    public WebElement readyForPicupButton;

    //Orders / Orders ready
    @FindBy(xpath = "//a[text()='Orders Ready']")
    public WebElement ordersReadyField;

    @FindBy(xpath = "//span[text()='ready for pickup']")
    public WebElement ordersReadyOnayField;
    // Homepage > Login > Orders


    @FindBy(xpath = "//li[@class='position-relative orders_new']")
    public WebElement newOrders;

    @FindBy(xpath = "//h5[text()='Orders Processing']")
    public WebElement ordersProcessingPage;

    @FindBy(xpath = "(//*[text()='esra turker'])[1]")
    public WebElement newOrdersUser;

    @FindBy(xpath = "//span[text()='Reject']")
    public WebElement reject;

    @FindBy(xpath = "//a[text()='other']")
    public WebElement other;

    @FindBy(xpath = "//span[text()='Reject order']")
    public WebElement rejectOrder;



    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Status Drop Down Menu
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement byCustumerDropDownMenu;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Status
    @FindBy(xpath = "//b[text()='By Status']")
    public WebElement byStatus;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Status Drop Down Menu
    @FindBy(xpath = "(//div[@class='form-label-group mb-4'])[2]")
    public WebElement byStatusDropDownMenu;


    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Status Drop Down Menu secilen secenek
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
    public WebElement byStatusDropDownMenuSecilen;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Order Type
    @FindBy(xpath = "//b[text()='By Order Type']")
    public WebElement byOrderType;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Order Type Drop Down Menu
    @FindBy(xpath = "(//div[@class='form-label-group mb-4'])[3]")
    public WebElement byOrderTypeDropDownMenu;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/By Order Type Drop Down Menu
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement byOrderTypeDropDownMenuSecilen;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/x button
    @FindBy(xpath = "//span[text()='×']")
    public WebElement xButton;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/Apply Filters button
    @FindBy(xpath = "//button[text()='Apply Filters']")
    public WebElement applyButton;

    // Homepage > Login > Orders/All Orders/Order history/Filters Button > Filters/Apply Filters button
    @FindBy(xpath = "//button[text()='Clear Filters']")
    public WebElement clearButton;


    // Homepage > Login > Orders/All Orders/Order history/Order ID
    @FindBy(xpath = "//th[text()='Order ID']")
    public WebElement orderId;

    // Homepage > Login > Orders/All Orders/Order history/Last Order Id
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement lastOrderId;

    // Homepage > Login > Orders/All Orders/Order history/Customer
    @FindBy(xpath = "//th[text()='Customer']")
    public WebElement customer;

    // Homepage > Login > Orders/All Orders/Order history/Order Information
    @FindBy(xpath = "//th[text()='Order Information']")
    public WebElement orderInformation;

    // Homepage > Login > Orders/All Orders/Order history/Actions
    @FindBy(xpath = "//th[text()='Actions']")
    public WebElement actions;

    // Homepage > Login > Orders/All Orders/Eye Icon history/Actions
    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]']")
    public WebElement eyeIcon;

    // Homepage > Login > Orders/All Orders/Download Icon history/Actions
    @FindBy(xpath = "(//i[@class='zmdi zmdi-download'])[1]']")
    public WebElement downloadIcon;




    // Homepage > Login > Orders/All Orders/Order history/Next Button
    @FindBy(id = "DataTables_Table_0_next")
    public WebElement nextButton;

    // Homepage > Login > Orders/All Orders/Order history/Next Button
    @FindBy(id = "DataTables_Table_0_previous")
    public WebElement previousButton;

    //------
    //dashboard/ food
    @FindBy(linkText = "Food")
    public WebElement foodButton;
    //dashboard/ food/ category
    @FindBy(linkText = "Category")
    public WebElement categoryButton;
    //dashboard food/categoty/list
    @FindBy(xpath = "//h5[text()='Category List']")
    public WebElement categoryListCheck;

    @FindBy(linkText = "Promo")
    public WebElement promoButton;

    @FindBy(linkText = "Coupon")
    public WebElement couponButton;

    @FindBy(xpath = "//h5[text()='Coupon list']")
    public WebElement couponListCheck;

    @FindBy(xpath = "(//*[text()='30'])[1]")
    public WebElement tarihSec;

    @FindBy(linkText = "30")
    public WebElement tarihSec30;

    @FindBy(xpath = "//input[@name='AR_voucher[voucher_name]']")
    public WebElement addCouponBox;

    @FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@class='btn btn-green item_delete']")
    public WebElement deleteOKButton;

    @FindBy(xpath = "//a[@type='button']")
    public WebElement addNewButton;

    @FindBy(xpath = "//input[@name='AR_category[category_name]']")
    public WebElement addNameBox;

    @FindBy(xpath = "(//strong[text()='Fried Tofu.jpg'])[1]")
    public WebElement addFriedTofuButton;
    @FindBy(xpath = "(//strong[text()='Fried Tofu.jpg'])[2]")
    public WebElement addFriedTofuButton2;

    @FindBy(xpath = "//span[text()='Add Files']")
    public WebElement addFilesButton;

    @FindBy(xpath = "(//span[@class='label'])[2]")
    public WebElement addFilesButton2;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement addsaveButton;

    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement addsaveCategoryButton;

    @FindBy(xpath = "(//button[text()='Browse'])[1]")
    public WebElement addBrowseButton1;


    //****************************(umre)********************************

    // @FindBy(xpath = "//label[@for='AR_merchant_login_username']")
    //Merchant login >username
    @FindBy(id = "AR_merchant_login_username")
    public  WebElement usernameMarchant;

    //merchant login >password
    @FindBy(id = "AR_merchant_login_password")
    public  WebElement passwordMarchant;

    // @FindBy(linkText = "Forgot password?  ")
    //merchant login > forgot password
    @FindBy(xpath = "//*[text()='Forgot password?  ']")
    public  WebElement forgotPasswordMarchant;

    // Merchant Login > sign in button
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public  WebElement signInButtonMarchant;

    // Merchant Login > sign in >forgot password/EmailAdress
    @FindBy(xpath = "//*[text()='Email Address ']")
    public  WebElement forgotPasswordEmailMerchant;

    //forgot password >Email adress/login here button
    @FindBy(xpath = "//div[@class='p-2 flex-fill']")
    public  WebElement loginHereMerchant;

    //Merchant login > remember me button
    @FindBy(id = "AR_merchant_login_rememberMe")
    public  WebElement remembermeButtonMerchant;

    // merchant login > sigin in >orders
    @FindBy(linkText = "Orders")
    public  WebElement ordersButtonMerchant;

    //merchant login > sign in >order/new orders
    @FindBy(linkText = "New Orders")
    public  WebElement newOrdersButtonMerchant;

    //new orders > new
    @FindBy(xpath = "(//*[text()='new'])[1]")
    public WebElement newButtonMerchant;

    //new orders >new button >Accepted
    @FindBy(xpath = "//*[text()='Accepted']")
    public  WebElement AcceptedButtonMerchant;

    //new prders > order type
    @FindBy(xpath = "//*[text()='Order type']")
    public  WebElement orderTypeMerchant;

    //new orders >payment status
    @FindBy(xpath = "//*[text()='Payment status']")
    public  WebElement paymentStatusMerchant;

    //new orders >sort
    @FindBy(xpath = "//*[text()='Sort']")
    public  WebElement sortMerchant;

    //new orders > sepet logosu
    @FindBy(xpath = "//span[@class='badge rounded-circle badge-danger count']")
    public  WebElement sepetButtonMerchant;

    //sepet logo >wiew all
    @FindBy(linkText = "View all")
    public  WebElement wiewAllButtonMerchant;

    //All notifications > start date
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public  WebElement startDateEnddateMerchant;

    @FindBy(tagName = "Today")
    public  WebElement startdateTodayButtonMerchant;
    //***************************(umre)*********************************



    @FindBy(xpath = "(//button[text()='Browse'])[2]")
    public WebElement addBrowseButton2;
    //__________________________________________________________________________________________________________


    //__________________________________________________________________________________________________________



    public void checkContent(WebElement element,String expectedContent){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(element.getText().contains(expectedContent));
        softAssert.assertAll();
    }

    public void checkContent(WebElement element,String expectedContent, String resultMessage){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(element.getText().contains(expectedContent), resultMessage);
        softAssert.assertAll();
    }


    public static void merchantLogin(String username, String password) {
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("AR_merchant_login_username"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("AR_merchant_login_password"));
        passwordLocate.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }


    // Admin Login > Tum Date filter
    public static WebElement dateFilter(int index) {
        WebElement ilkClick = Driver.getDriver().findElement(By.xpath("(//input[@type='search'])[1]"));
        ilkClick.click();
        ReusableMethods.wait(1);
        String xpath = "(//tr//td)[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    // TUM MENULERI GEZINME
    public static WebElement menuList(int index) {
        String xpath = "(//li)[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


}
