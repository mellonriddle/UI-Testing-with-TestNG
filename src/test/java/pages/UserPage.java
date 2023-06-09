package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class UserPage {

    public WebElement EnterDeliveryAddressBox;

    public UserPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    // TAMER'S

    // HomePage > cookie
    @FindBy(xpath = "(//div[@class='col'])[4]")
    public WebElement cookie;

    // HomePage > firmLogo
    @FindBy(xpath = "//div[@class='top-logo']")
    public WebElement firmLogo;

    // HomePage > cartButton
    @FindBy(xpath = "//a[text()=' Cart ']")
    public WebElement cartButton;

    // HomePage > cartButton > cartText
    @FindBy(xpath = "//div[@class='no-results m-auto']")
    public WebElement cartText;

    // HomePage > cartIcon
    @FindBy(xpath = "(//ul/li)[3]")
    public WebElement cartIcon;

    // HomePage > signInButton
    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement signInButton;

    // HomePage > searchBoxButton
    @FindBy(xpath = "(//input[@placeholder])[1]")
    public WebElement searchBoxButton;

    // UserLoginPage > emailBox
    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailBox;

    // UserLoginPage > passwordBox
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    // UserLoginPage > forgotPasswordButton
    @FindBy(xpath = "//*[text()='Forgot password?']")
    public WebElement forgotPasswordButton;

    // UserLoginPage > loginSignInButton
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement loginSignInButton;

    // UserLoginPage > loginSignUpButton
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement loginSignUpButton;

    // UserLoginPage > rememberMeButton
    @FindBy(xpath = "//label[@for='rememberme']")
    public WebElement rememberMeLabel;

    @FindBy(xpath = "//input[@id='rememberme']")
    public WebElement rememberMeButton;

    // UserLoginPage > alertText
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertText;


    @FindBy(xpath = "//div[@class='alert alert-warning m-0 mt-2']")
    public WebElement selectPaymentAlertText;


    // HomePage > profilePage / manageMyAccountButton
    @FindBy(xpath = "//a[text()=' Manage my account ']")
    public WebElement manageMyAccountButton;

    // HomePage > profilePage / basicDetailButton
    @FindBy(xpath = "//li[@class='active']")
    public WebElement basicDetailButton;

    // HomePage > profilePage / changePasswordButton
    @FindBy(xpath = "//li[@class='user-change-password']")
    public WebElement changePasswordButton;

    // HomePage > profilePage / manageAccountButton
    @FindBy(xpath = "(//ul/li/a)[10]")
    public WebElement manageAccountButton;

    // HomePage > profilePage / profileImgButton
    @FindBy(id = "vue-profile-photo")
    public WebElement profilImgButton;

    // HomePage > profilePage / photoUploadBox
    @FindBy(xpath="//div[@class='mb-3']")
    public  WebElement photoUploadBox;

    // HomePage > profilePage / firstNameBox
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;

    // HomePage > profilePage / lastNameBox
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;

    // HomePage > profilePage / detailEmailBox
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement detailEmailBox;

    // HomePage > profilePage / telBox
    @FindBy(xpath = "(//div[@class='col-lg-6'])[4]")
    public WebElement telBox;

    // HomePage > profilePage / detailSubmitButton
    @FindBy(xpath = "(//span[@class='label'])[2]")
    public WebElement detailSubmitButton;

    // HomePage > profilePage / nameRequiredText
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement nameRequiredText;

    // HomePage > profilePage > changePassword / oldPasswordBox
    @FindBy(xpath = "//input[@id='old_password']")
    public WebElement oldPasswordBox;

    // HomePage > profilePage > changePassword / newPasswordBox
    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement newPasswordBox;

    // HomePage > profilePage > changePassword / confirmPasswordBox
    @FindBy(xpath = "//input[@id='confirm_password']")
    public WebElement confirmPasswordBox;

    // HomePage > profilePage > changePassword / PasswordSubmitButton
    @FindBy(xpath = "(//button)[5]")
    public WebElement PasswordSubmitButton;

    // HomePage > profilePage > changePassword / passwordChangeText
    @FindBy(xpath = "//p[text()='Password change']")
    public WebElement passwordChangeText;


    // SECOND PART //

    // ContactPage > MealCenterPhone
    @FindBy(xpath = "//h/p[1]/a")
    public WebElement contactPhone;

    // ContactPage > MealCenterEmail
    @FindBy(xpath = "//h/p[2]/a")
    public WebElement contactEmail;

    // ContactPage > NameBox
    @FindBy(id = "AR_contact_fullname")
    public WebElement contactFormName;

    // ContactPage > EmailBox
    @FindBy(id = "AR_contact_email_address")
    public WebElement contactFormEmail;

    // ContactPage > MessageTextBox
    @FindBy(id = "AR_contact_message")
    public WebElement contactFormText;

    // ContactPage > Submit Button
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement contactPageSubmitButton;

    // ContactPage > Form submitted Text
    @FindBy(xpath = "//*[@id='upload-form']/div[2]")
    public WebElement contactSuccessText;

    // ProfilePage > Addresses Button
    @FindBy(linkText = "Addresses")
    public WebElement addressesButton;

    // ProfilePage > Addresses Button / Registered Addresses
    @FindBy(xpath = "//*[@id='vue-my-address']/div[5]")
    public WebElement registeredAddresses;

    // ProfilePage > Addresses / addNewAddressButton
    @FindBy(xpath = "//div[4]/a")
    public WebElement addNewAddressButton;

    // ProfilePage > Addresses / Input New Address Box
    @FindBy(xpath = "(//div[1]/input)[1]")
    public WebElement inputAddressBox;

    // ProfilePage > Addresses / Address Options
    @FindBy(xpath = "//li[1]/a/h6")
    public WebElement addressOptionsDdw;

    // ProfilePage > Addresses / Add Complete Address Details
    @FindBy(xpath = "(//a[text()='Edit '])[1]")
    public WebElement editCompleteAddressButton;

    // ProfilePage > Addresses / Complete Address Input
    @FindBy(id = "formatted_address")
    public WebElement completeAddressInput;

    // ProfilePage > Addresses / Apartment Door Input
    @FindBy(id = "location_name")
    public WebElement apartmentDoor;

    // ProfilePage > Addresses / Apartment Door Input
    @FindBy(id = "delivery_instructions")
    public WebElement deliveryInstructions;

    // ProfilePage > Addresses / Delivery Dropdown
    @FindBy(xpath = "//select")
    public WebElement deliveryDropdown;

    // ProfilePage > Addresses / Address Label Work
    @FindBy(xpath = "//input[@value='Work']")
    public WebElement addressLabelWork;

    // ProfilePage > Addresses / Address Label School
    @FindBy(xpath = "//input[@value='School']")
    public WebElement addressLabelSchool;

    // ProfilePage > Addresses / Address Label Other
    @FindBy(xpath = "//input[@value='Other']")
    public WebElement addressLabelOther;

    // ProfilePage > Addresses / Address Label Home
    @FindBy(xpath = "//input[@value='Home']")
    public WebElement addressLabelHome;

    // ProfilePage > Addresses / Address Save Button
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement addressSaveButton;

    // ProfilePage > Addresses / Latest Address Text
    @FindBy(xpath = "(//div[1]/p)[3]")
    public WebElement latestAddressText;

    // ProfilePage > Addresses / Delete Latest Address Button
    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement deleteAddressButton;

    // ProfilePage > Addresses / Cancel Button on Deleting Address
    @FindBy(xpath = "(//button[text()='Cancel'])[2]")
    public WebElement cancelDeleteAddress;

    // ProfilePage > Addresses / Confirm Button on Deleting Address
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement confirmDeleteAddress;

    // ProfilePage > Addresses / Edit Address Button
    @FindBy(xpath = "//div[2]/div[1]/a")
    public WebElement editAddressButton;



    //_______________________________________________ WITHOUT LOGIN ____________________________________________
    

    //Homepage / First restaurant under Popular nearby (ayazicioglu)
    @FindBy(xpath = "(//div[@class='w-100 list-items p-0'])[9]")
    public WebElement firstRestaurantAtNearby;

    //Homepage > Restaurant page /First product at a Restaurant (ayazicioglu)
    @FindBy(xpath = "(//h6)[1]")
    public WebElement firstProductAtRestaurant;

    //Homepage / Next restaurant button under Popular nearby (ayazicioglu)
    @FindBy(xpath = "(//a[@class='owl-carousel-nav next'])[1]")
    public WebElement rightArrowButton;

    //Homepage > Restaurant page / FirstMenu (ayazicioglu)
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement firstMenuAtRestautant;

    //Homepage >Restaurant Page / Menu
    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menuCategory;

    //Homepage / The nearest restaurant arrow buttons>
    @FindBy(xpath = "(//div[@class='w-100 list-items p-0'])[14]")
    public WebElement restaurantUnderArrows;


    @FindBy(xpath = "(//div[@class='addons addons-3'])[1]")
    public WebElement motoKuryeResim;




    //___________________________________________________________________________________________________________




    //__________________________________________________ AFTER LOGIN ____________________________________________


    // Homepage > Login > Login/Enter delivery address Box
    @FindBy(xpath = "(//input[@placeholder='Enter delivery address'])[1]")
    public WebElement enterDeliveryAddressBox;

    // Homepage > Login > Login/Enter delivery address Box
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement enterDeliveryAddressBox2;


    // Homepage > Login > Login/Enter delivery address Boxa yazilacak metin
    @FindBy(xpath = "//h6[text()='Seattle']")
    public WebElement seatle;

    // Homepage > restaurants/Delivery Drop Down Menu
    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement deliveryDropDown;

    // Homepage > restaurants/Delivery Drop Down Menu
    @FindBy(xpath = "//div[@class='d-flex justify-content-start align-items-center']")
    public WebElement DeliveryVisibleDropDown;

    // Homepage > restaurants/Place.Now Menu
    @FindBy(xpath = "(//div[@class='position-relative'])[1]")
    public WebElement placeNowMenu;

    // Homepage > restaurants/Place.Now/Delivery details window
    @FindBy(xpath = "(//h4[text()='Delivery details'])[1]")
    public WebElement deliveryDetailsWindow;

    // Homepage > restaurants/Place.Now/Delivery details window
    @FindBy(xpath = "(//button[text()='Done'])[1]")
    public WebElement doneButton;


    // Homepage > restaurants/Pickup Drop Down Menu
    @FindBy(xpath = "(//a[text()='Pickup'])[1]")
    public WebElement pickupDropDown;

    // Homepage > restaurants/Dinein Drop Down Menu
    @FindBy(xpath = "(//a[text()='Dinein'])[1]")
    public WebElement dineinDropDown;


    // Homepage > restaurants/Search box sag ustte
    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBox;

    // Homepage > restaurants/Filter
    @FindBy(xpath = "//a[text()=' Filter ']")
    public WebElement filter;

    // Homepage > restaurants/Filter/Most popular radio button
    @FindBy(xpath = "//label[@for='sort_most_popular']")
    public WebElement mostPopularRadioButton;

    // Homepage > restaurants/Filter/Rating radio button
    @FindBy(xpath = "(//label[text()='Rating'])[2]")
    public WebElement ratingRadioButton;

    // Homepage > restaurants/Filter/Promo radio button
    @FindBy(xpath = "(//label[text()='Promo'])[2]")
    public WebElement promoRadioButton;


    // Homepage > restaurants/Filter/Free delivery first order radio button
    @FindBy(xpath = "(//label[text()='Free delivery first order'])[2]")
    public WebElement freeDeliveryFirstOrderRadioButton;

    // Homepage > restaurants/Filter/Clear all
    @FindBy(xpath = "//*[text()='Clear all']")
    public WebElement clearAll;

    // Homepage > restaurants/Filter/Clear all
    @FindBy(xpath = "(//p[@class='m-0'])[4]")
    public WebElement clearAll2;

    // Homepage > restaurants/Cuisines
    @FindBy(xpath = "//a[text()=' Cuisines ']")
    public WebElement cuisines;

    // Homepage > restaurants/Cuisines/American checkBox
    @FindBy(xpath = "(//label[text()='American'])[2]")
    public WebElement americanChechBox;

    // Homepage > restaurants/Cuisines/Sandwiches checkBox
    @FindBy(xpath = "(//label[text()='Sandwiches'])[2]")
    public WebElement sandwichesChechBox;

    // Homepage > restaurants/Cuisines/Mexican checkBox
    @FindBy(xpath = "(//label[text()='Mexican'])[2]")
    public WebElement mexicanChechBox;

    // Homepage > restaurants/Cuisines/Mediterranean checkBox
    @FindBy(xpath = "(//label[text()='Mediterranean'])[2]")
    public WebElement mediterraneanChechBox;

    // Homepage > restaurants/Cuisines/Italian checkBox
    @FindBy(xpath = "(//label[text()='Italian'])[2]")
    public WebElement italianChechBox;

    // Homepage > restaurants/Cuisines/Burgers checkBox
    @FindBy(xpath = "(//label[text()='Burgers'])[2]")
    public WebElement burgersChechBox;

    // Homepage > restaurants/Cuisines/Burgers2 checkBox
    @FindBy(xpath = "(//label[text()='Burgers'])[2]")
    public WebElement burgers2ChechBox;


    // Homepage > restaurants/Cuisines/Japanese checkBox
    @FindBy(xpath = "(//label[text()='Japanese'])[2]")
    public WebElement japaneseChechBox;

    // Homepage > restaurants/Cuisines/Chinese checkBox
    @FindBy(xpath = "(//label[text()='Chinese'])[2]")
    public WebElement chineseChechBox;

    // Homepage > restaurants/Cuisines/Halal checkBox
    @FindBy(xpath = "(//label[text()='Halal'])[2]")
    public WebElement halalChechBox;

    // Homepage > restaurants/Cuisines/Thai checkBox
    @FindBy(xpath = "(//label[text()='Thai'])[2]")
    public WebElement thaiChechBox;

    // Homepage > restaurants/Cuisines/Kosher checkBox
    @FindBy(xpath = "(//label[text()='Kosher'])[2]")
    public WebElement kosherChechBox;

    // Homepage > restaurants/Cuisines/Vegetarian checkBox
    @FindBy(xpath = "(//label[text()='Vegetarian'])[2]")
    public WebElement vegetarianChechBox;

    // Homepage > restaurants/Cuisines/Show more butonu
    @FindBy(xpath = "//a[@aria-controls='collapseExample']")
    public WebElement showMore;

    // Homepage > restaurants/ Max Delivery Fee
    @FindBy(xpath = "//a[text()=' Max Delivery Fee ']")
    public WebElement maxDeliveryFee;

    // Homepage > restaurants/ Max Delivery Fee/Slider
    @FindBy(xpath = "(//input[@id='min_range_slider'])[2]")
    public WebElement maxDeliveryFeeSlider;

    // Homepage > restaurants/ Max Delivery Fee/Slider/Level
    @FindBy(xpath = "(//label[@for='formControlRange'])[2]")
    public WebElement maxDeliveryFeeSliderLevel;

    //Merchant main page privayc Policy Button
    @FindBy (xpath ="//a[text()='Privacy policy'] ")
    public WebElement privacyPolicyButton;

    //Merchant Privacy Policy Page
    @FindBy (xpath = "//h3[text()='Privacy policy']")
    public WebElement privacyPolicyPage;

    //Merchant main page Join Button
    @FindBy (xpath = "//a[@class='btn btn-link w25']")
    public WebElement joinButton;

    @FindBy (xpath = "(//div[@class='form-label-group'])[1]")
    public WebElement storeName;

    @FindBy (xpath = "//p[@class='m-0 mt-3 mb-3']")
    public WebElement kaydirici2;


    @FindBy (xpath = "//input[@placeholder='Store address']")
    public WebElement storeAddress;

    @FindBy (xpath = "//input[@id='contact_email']")
    public WebElement emailAddress;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement yourPhone;

    @FindBy (xpath = "//label[@class='custom-control-label']")
    public WebElement commissionCheckbox;

    @FindBy (xpath = "//span[text()='Submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//h5")
    public WebElement registerUserPage;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement registerUserfirstName;


    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement registerUserlastName;

    @FindBy (xpath = "//input[@id='contact_email']")
    public WebElement registerUserEmail;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement registerUseryourPhone;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement registerUserName;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement registerUserPassword;

    @FindBy (xpath = "//input[@id='cpassword']")
    public WebElement registerConfirmPassword;

    @FindBy (xpath = "//span[text()='Signup']")
    public WebElement registerUserSignupButton;

    @FindBy (xpath = "//div[@class='text-center mb-5']")
    public WebElement contactedSoon;

    @FindBy (xpath = "//div[@class='dropdown userprofile']")
    public WebElement loginElementi;

    @FindBy (xpath = "(//*[text()='McDonalds'])[1]")
    public WebElement mcDonalds;

    @FindBy (xpath = "(//div[@class='w-50 align-self-center'])[1]")
    public WebElement McDonaldsText;

    @FindBy (xpath = "(//i[@class='zmdi zmdi-favorite-outline'])[1]")
    public WebElement saveStoreFavori;

    @FindBy (xpath = "//a[text()=' Saved Stores ']")
    public WebElement saveStoreButton;

    @FindBy (xpath = "(//h5[text()='Saved Stores'])[1]")
    public WebElement saveStoreText;

    @FindBy (xpath = "//h5[@class='m-0 text-truncate']")
    public WebElement saveStoreProduct;

    @FindBy (xpath = "(//i[@class='zmdi zmdi-favorite text-green'])[1]")
    public WebElement saveStoreFavori2;



    //First delivery adress on box after enter word
    @FindBy(xpath = "(//h6[@class='m-0'])[1]")
    public WebElement firstDeliveryAdresOnBox;

    // Homepage> /xrestorant page
    @FindBy(xpath = "(//*[text()=' Add to cart '])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//span[@class='label'])[8]")
    public WebElement tuccartavisye;


    //Homepage> /xrestorant page
    @FindBy(xpath = "//div[text()='Checkout']")
    public WebElement checkoutButton;

    //Homepage> xrestorant page / newOrderButton at create new order box
    @FindBy(xpath = "//span[text()='New order']")
    public WebElement newOrderButton;

    //Homepage >  xrestorant page / after click at addToCartButton
    @FindBy(xpath = "//*[text()='Add to cart - ']")
    public WebElement optionalAddtoCartButton;

    //Homepage > account > checkout / payment methods
    @FindBy(xpath = "(//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'])[1]")
    public WebElement addCashkutu;

    @FindBy(xpath = "(//h5[@class='m-0 ml-2 section-title'])[2]")
    public WebElement paymentKaydiriciBaslik;


    //Homepage > account > checkout / alert on payment methods
    @FindBy(xpath = "//*[text()='Add Cash']")
    public WebElement alertAddCashButton;

    //Homepage > account > checkout / under the cart menu
    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "(//span[@class='mr-1'])[2]")
    public WebElement defaulta;

    @FindBy(xpath = "//a[@class='btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkout1;

    @FindBy(xpath = "(//span[text()='Stripe'])[1]")
    public WebElement genelKutuOdeme;


    @FindBy(xpath = "(//p[@class='m-0 text-muted'])[4]")
    public WebElement stripeText;

    @FindBy(xpath = "(//span[@class='mr-1'])[2]")
    public String stripee;


    @FindBy(xpath = "//div//iframe")
    public WebElement iframeUser;

    @FindBy(xpath = "//span[@class='CardField-number CardField-child']")
    public WebElement iframeKrediClick;

    @FindBy(xpath = "(//div[@class='modal-footer justify-content-start'])[11]")
    public WebElement kredicartKaydet;








    //Homepage > page after completed order
    @FindBy(xpath = "//*[text()='Confirming your order']")
    public WebElement confirmingOrderLabel;

    //Homepage > account > checkout / payment methods
    @FindBy(xpath = "//*[text()='Saved Payment Methods']")
    public WebElement savedPaymentBox;

    //Homepage > account > orders
    @FindBy(xpath = "//*[@placeholder='Search order']")
    public WebElement searchOrderBox;

    //Homepage > account > checkout / payment methods
    @FindBy(xpath = "//*[text()='Please select valid payment method']")
    public WebElement selectValidPaymentWarningLabel;






    //______________________________________________________________________________________________________________

    

    
    //******************************(umre)************************

    
    // home page > Login/Enter delivery address Box yazilacak metin
    @FindBy(xpath = "//h6[text()='Seattle']")
    public WebElement Seatle;

    //home page > cookies
    @FindBy(xpath ="//span[text()='Accept']" )
    public  WebElement cookiesUser;

    // homePage > logo
    @FindBy(xpath = "(//img[@class='img-200'])[1]")
    public  WebElement logoUser;


    //Home page > acilis yazisi
    @FindBy(xpath = "//h2[@class='text-center mb-3']")
    public WebElement  acilisYazisiUser;


    //Home page> sign in button
    @FindBy(linkText = "Sign in")
    //@FindBy(xpath = "//li[@class='d-none d-lg-inline line-left'")
    public WebElement signinButtonUser;

    // Login > cart button
    @FindBy(xpath = "//a[@class='ssm-toggle-navx']")
    public  WebElement cartButtonUser;

    //Login > cart button icon
    @FindBy(xpath = "//button[@class='el-drawer__close-btn']")
    public  WebElement cartIconUser;

    //Login > adress text box
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement adressTextBoxUser;



    //Home page > yoresel mutfak ulke isimleri(sirali)
    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public  WebElement yoreselUlkeIsimleriUser;


    //Login >yoresel mutfak isimlerinin yanindaki "more" buttonu
    //  @FindBy(id = "dropdownCuisine")
    @FindBy(xpath = "//a[@data-toggle='dropdown']")
    public WebElement moreButtonUser;



    // Login > Popular nearby Seattle yazisi
    @FindBy(xpath = "//*[text()='Popular nearby ']")
    public WebElement PopularnearbySeattleYazisiUser;

    // Login > locanta resimlerini geriye hareket ettiren ok button
    @FindBy(xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[1]")
    public WebElement PopularnearbySeattleSolOkButtonUser;

    // Login > lacanta rresimlerini ileriye hareket ettiren ok buttonu
    @FindBy(xpath = "(//a[@class='owl-carousel-nav next'])[1]")
    public  WebElement PopularnearbySeattleSagOkButtonUser;

    //Login >  "No Minimum Order" yazi basligi
    @FindBy(xpath = "(//div[@class='addons addons-1'])[1]")
    public  WebElement NoMinimumOrderYazisiUser;

    //Login > "Track your delivery" yazi basligi
    @FindBy(xpath = "(//div[@class='addons addons-2'])[1]")
    public WebElement TrackyourdeliveryYazisi;



    //Home page > "Join us and reach new customers" yazisi
    @FindBy(xpath = "//h1[text()='Join us and reach new customers']")
    public  WebElement JoinusandreachnewcustomersYazsisi;

    // Login > read yazisi1
    @FindBy(xpath = "(//div[@class='mt-auto'])[1]")
    public WebElement readButton1User;

    @FindBy(xpath = "(//div[@class='mt-auto'])[2]")
    public WebElement readButton2User;

    @FindBy(xpath = "(//div[@class='mt-auto'])[3]")
    public WebElement readButton3User;

    @FindBy(xpath = "(//div[@class='mt-auto'])[4]")
    public WebElement readButton4User;


    // Login > join "Are you a restaurant owner?" yazisi
    @FindBy(xpath = "//*[text()='Join us and reach new customers']")
    public  WebElement joinYaziUser ;




    // Login > joinyazisi
    @FindBy(linkText = "Join")
    public WebElement joinButtonUser;



    // Login > "New restaurant Seattle" basligi
    @FindBy(xpath = "(//h5[@class='m-0 section-title'])[2]")
    public WebElement NewrestaurantSeattleBaslikUser;

    //Login > New restaurant Seattle baslikli ilk restaurant resmi
    @FindBy(xpath = "(//div[@class='mt-3 text-center w-100'])[7]")
    public  WebElement kosherRestaurantResmiUser;

    // Login new Restaurant sol ok
    @FindBy(xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[2]")
    public WebElement PopularnearbySeattleSolOkButton2User;

    //Login >  sag ok
    @FindBy(xpath = "(//a[@class='owl-carousel-nav next'])[2]")
    public  WebElement PopularnearbySeattleSagOkButton2User;

    // **************************************************************************************************
    //Sign in > Login >username
    @FindBy(id = "username")
    public  WebElement usernameUser;

    //Sign in > Login >password
    @FindBy(id = "password")
    public  WebElement passwordUser;

    // sign in > Login >Remeember me
    @FindBy(xpath = "//label[@class='custom-control-label']")
    public  WebElement remembermeUser;


    //Sign in > Login > sign Up(oturumu ac)
    // @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public  WebElement signUpUser;

    // sign in > login >hesabim
    @FindBy(id = "dropdownCuisine")
    // @FindBy(xpath = "//a[@class='btn btn-sm dropdown-toggle text-truncate shadow-none width-100']")
    public  WebElement hesabimMenuUser;

    //restaurants >vegan season restaurant button
    @FindBy(linkText = "Vegan Season")
    public  WebElement veganSeasonUser;

    //vegan season >Appetizers
    @FindBy(linkText = "Appetizers ")
    public  WebElement appetizersUser;

    //vegan season > appetizers > Add to cart
    @FindBy(linkText = " Add to cart ")
    public  WebElement addtocartButton;
    // add to cart >checkout button

    //checkout >place order button
    @FindBy(xpath = "//button[@class='btn btn-green w-100 pointer']")
    public  WebElement placeOrderButtonUser;

    //checkout >Add New Payment Method/cash on delivery >add cash
    @FindBy(xpath = "//*[text()='Add Cash']")
    public WebElement addCashButton;


    // Login > Popular nearby Seattle yazisi
    @FindBy(xpath = "//*[text()='Popular nearby ']")
    public WebElement popularnearbySeattleYazisiUser;

    //Login >  "No Minimum Order" yazi basligi
    @FindBy(xpath = "(//div[@class='addons addons-1'])[1]")
    public  WebElement noMinimumOrderYazisiUser;

    //Login > "Track your delivery" yazi basligi
    @FindBy(xpath = "(//div[@class='addons addons-2'])[1]")
    public WebElement trackyourdeliveryYazisi;

    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public  WebElement deleteButtonUser;


    //Cash On delivery /delete button
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
    public  WebElement ucNoktaButtonUser;

    @FindBy(xpath = "(//a[@class='btn normal small'])[1]")
    public WebElement editButtonUser;

    @FindBy(xpath = "//a[text()=' Payments Options ']")
    public  WebElement paymentsOptionsUser;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    public  WebElement remberme;

    @FindBy(xpath = "//a[@class='a-12']")
    public  WebElement forgotPassword;

    @FindBy(xpath = "//input[@id='email_address']")
    public  WebElement emailReset;

    @FindBy(xpath = "//a[@class='btn btn-white p-0 font14']")
    public  WebElement siginForgot;

    @FindBy(xpath = "//a[@id='dropdownMenuLink']")
    public  WebElement loginKullanciadi;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    public  WebElement userloginalert;




    
    //Home page > "Join us and reach new customers" yazisi
    @FindBy(xpath = "//h1[text()='Join us and reach new customers']")
    public  WebElement joinusandreachnewcustomersYazsisi;

    // Login > "New restaurant Seattle" basligi
    @FindBy(xpath = "(//h5[@class='m-0 section-title'])[2]")
    public WebElement newrestaurantSeattleBaslikUser;

    //add cash >icon
    @FindBy(xpath = "//a[@class='btn btn-black btn-circle rounded-pill'])[10]")
    public  WebElement addCashIconUser;

    // UserLoginPage > / userName DropdownButton
    @FindBy(xpath = "//a[@id='dropdownMenuLink']")
    public WebElement userNameButton;


    //HomePage / cartIcon / closeCartIcon
    @FindBy(xpath = "//button[@aria-label]")
    public WebElement closeCartIcon;

    @FindBy(xpath = "//h5[text()='Bai Tong Thai Street Cafe']")
    public WebElement baiTongRestaurant;


    // Sign in > login >sign in>hesabim/My orders
    @FindBy(xpath = "//*[text()=' My orders ']")
    public  WebElement MyordersButtonUser;

    //manage my orders >my orders >orders
    @FindBy(linkText = "Orders")
    public  WebElement ordersbuttonUser;

    //sign  in > login >sign in> hesabimButton >My orderButton/siparis sayfasi yazisi
    @FindBy(xpath = "//div[@class='col-lg-5 d-none d-lg-block']")
    public  WebElement siparisSayfasiyazisiUser;

    @FindBy(xpath = "//*[text()='Payments']")
    public  WebElement paymentsButtonUser;

    //hesabimButton > My ordersButton >payments/Add new payments
    @FindBy(xpath = "(//a[@class='btn btn-green'])[1]")
    public  WebElement addNewpaymentsButtonUser;

    //payments > Add new payments/cash on delivery
    @FindBy(xpath = "//*[text()='Cash On delivery']")
    public  WebElement cashOnDeliveryButtonUser;

    //payments >Add new payments > cash on delivery/Add cash
    @FindBy(xpath = "//*[text()='Add Cash']")
    public  WebElement addcashButtonUser;

    @FindBy(xpath = "(//p[@class='m-0 mb-1 bold'])[1])")
    public  WebElement orderİD;


    //----------Footer-------------------

    @FindBy(xpath = "//div[@class='footer-logo']")
    public WebElement siteLogo;

    @FindBy(xpath = "//h2[text()='Hungry? We got you']")
    public WebElement homePageField;

    @FindBy(linkText = "Contact us")
    public WebElement contactUsLink;

    @FindBy(linkText = "Terms and conditions")
    public WebElement termCondLink;

    @FindBy(linkText = "Privacy policy")
    public WebElement priPolLink;

    @FindBy(linkText = "Become a Partner")
    public WebElement BusnessLink;

    @FindBy(linkText = "Discover the Best Vegetarian Food Delivery Options in Your Area")
    public WebElement blog1;

    @FindBy(linkText = "How to Eat Healthy with Food Delivery")
    public WebElement blog2;

    @FindBy(linkText = "The Benefits of Using a Food Delivery Platform for Your Healthy Lifestyle")
    public WebElement blog3;

    @FindBy(linkText = "Discover Healthy Food Delivery Options for Your Whole Family")
    public WebElement blog4;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement faceBook;

    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement instagram;

    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement linkedin;

    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement twitter;

    @FindBy(xpath = "(//a[@target='_blank'])[5]")
    public WebElement youtube;

    @FindBy(xpath = "(//img[@src='/themes/karenderia_v2/assets/images/app-store@2x.png'])[2]")
    public WebElement appStoreButton;

    @FindBy(xpath = "(//img[@src='/themes/karenderia_v2/assets/images/google-play@2x.png'])[2]")
    public WebElement playStoreBotton;

    @FindBy(xpath = "(//p[@class='m-0'])[1]")
    public WebElement pageLink;

    @FindBy (xpath = "(//*[text()=' Add to cart '])[1]")
    public WebElement addToCartButton1;
    @FindBy (xpath = "(//input[@placeholder='Enter your address'])[2]")
    public WebElement addressForDelivery;

    @FindBy (xpath = "//h5[@class='m-0 mb-1']")
    public WebElement confirmingyourorderText;

    @FindBy(xpath = "//span[text()='Delivery']")
    public WebElement deliveryButton;

    @FindBy(xpath = "(//label[@class='btn'])[1]")
    public WebElement scheduleForLater;

    @FindBy(xpath = "//select[@class='form-control custom-select mb-3']")
    public WebElement scheduleSelect;

    @FindBy (xpath = "//button[@class='btn btn-green w-100 pointer']")
    public WebElement placeOrderText;



    //_______________________Sepet Fonksiyonu______________________

    @FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]")
    public WebElement deliveryRadioButton;

    @FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]")
    public WebElement dineinRadioButton;

    @FindBy(xpath = "(//div[@class='custom-control custom-radio'])[3]")
    public WebElement picupRadioButton;

    //HomePage > Login > Card > Order Type and Time > RadioButonSecim/Save
    @FindBy(xpath = "(//span[text()='Save'])[2]")
    public WebElement saveButton;

    @FindBy(xpath = "(//label[@class='btn active'])[1]")
    public WebElement scheduleForLaterButton;

    @FindBy(xpath = "//select[@class='form-control custom-select mb-3']")
    public WebElement scheduleDropDown;

    @FindBy(xpath = "//select[@id='delivery_time']")
    public WebElement scheduleTimeSelect;

    @FindBy(xpath = "//select[@class='form-control custom-select mb-3']")
    public WebElement scheduleTarihDropDown;

    @FindBy(xpath = "(//select[@class='form-control custom-select'])[1]")
    public WebElement scheduleTimeDropDown;

    @FindBy(xpath = "(//div[@class='flexcol'])[1]")
    public WebElement tarihDateKontrolFieid;

    @FindBy(xpath = "(//div[@class='flexcol'])[3]")
    public WebElement promotionButton;

    @FindBy(xpath = "(//label[@class='custom-control-label font14 bold'])[4]")
    public WebElement promoRadioButton1;

    @FindBy(xpath = "(//label[@class='custom-control-label font14 bold'])[5]")
    public WebElement promoRadioButton2;

    @FindBy(xpath = "(//label[@class='custom-control-label font14 bold'])[6]")
    public WebElement promoRadioButton3;

    @FindBy(xpath = "(//span[text()='Save'])[3]")
    public WebElement promoSaveButton;

    @FindBy(xpath = "(//div[@class='flexcol'])[6]")
    public WebElement cashButton;

    @FindBy(xpath = "(//span[text()='Cash On delivery'])[2]")
    public WebElement cashOnayField;

    @FindBy(xpath = "//i[@class='zmdi zmdi-more']")
    public WebElement cashSilmeField;

    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement cashDelete;

    @FindBy(xpath = "(//p[@class='m-0 text-muted'])[4]")
    public WebElement spriteOnayField;

    @FindBy(xpath = "(//div[@class='qty'])[2]")
    public WebElement urunAdetField;

    @FindBy(xpath = "(//a[@data-id='plus'])[2]")
    public WebElement plusButton;

    @FindBy(xpath = "(//a[@data-id='less'])[2]")
    public WebElement lessButton;

    @FindBy(xpath = "(//i[@class='zmdi zmdi-close'])[6]")
    public WebElement urunSilmeButonu;

    @FindBy(xpath = "//div[@class='no-results m-auto']")
    public WebElement emptyCartField;

    @FindBy(xpath = "//li[@class='step-order active progressing']")
    public WebElement siparisactiveField;

    //Homepage > account > checkout / payment methods
    @FindBy(xpath = "(//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'])[2]")
    public WebElement stripeButton;

    @FindBy(xpath = "//*[text()='Confirming your order']")
    public WebElement ConfirmingyourorderYazisiUser;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement JoinSignUP;



    //Add cash > icon >close Payments
    @FindBy(xpath = "(//a[@class='btn btn-green'])[1]")
    public  WebElement closePaymentsButtonUser;

    //footer sayfasi > "Terms and conditions" yazisi
    //@FindBy(linkText = "Terms and conditions")
    @FindBy(xpath = "(//*[text()='Terms and Conditions'])[1]")
    public  WebElement termsAndConditionsyazisi;

    //footer sayfasi > Contact Us
    @FindBy(xpath = "//*[text()='Contact Us']")
    public  WebElement  contactUsYazisiUser;



    // footer sayfasi > contact us yazisi > sikayet email adresi
    @FindBy(xpath = "//font[@color='#ff0000']")
    public  WebElement contacUsUsEmailButton;




    //******************************(umre)*********************



    public WebElement searchData(int no) {

        String dataXpath = "(//ul/li/a)[" + no + "]";
        WebElement istenenElement = Driver.getDriver().findElement(By.xpath(dataXpath));
        return istenenElement;

    }

    public void enterLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("customerUrl"));
        ReusableMethods.wait(1);

       /* try {
            cookie.click();
        } catch (NoSuchElementException e) {
            System.out.println("no cookie this time");
        }*/

        cookie.click();
        signInButton.click();

    }

    public void userLogin() {
        enterLoginPage();
        ReusableMethods.wait(1);

        emailBox.sendKeys(ConfigReader.getProperty("uservalidEmail"));
        passwordBox.sendKeys(ConfigReader.getProperty("uservalidPassword"));
        loginSignInButton.click();
        ReusableMethods.wait(1);

    }

    //______________________________________________________________________________________________________________




    public static void userLogin(String username, String password) {

        WebElement cookies = Driver.getDriver().findElement(By.xpath("//span[text()='Accept']"));
        cookies.click();
        ReusableMethods.wait(1);


        WebElement signinLink = Driver.getDriver().findElement(By.xpath("//a[text()='Sign in']"));
        signinLink.click();


        WebElement usernameLocate = Driver.getDriver().findElement(By.id("username"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);


        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-green w-100']"));
        loginButton.click();
    }


    public static WebElement userCuisine(int index){
        String cuisine = "(//div[@class='col cuisineMainPage'])[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(cuisine));
    }

    public static WebElement userFooter(int index){
        String footer = "(//div//ul//a)["+ index + "]";
        return Driver.getDriver().findElement(By.xpath(footer));
    }

    public static WebElement userFooter1(int index){
        String footer = "(//ul//li)["+ index + "]";
        return Driver.getDriver().findElement(By.xpath(footer));
    }

    public static WebElement restaurantFilter(int index){
        String footer = "(//h5[@class='m-0 text-truncate'])["+ index + "]";
        return Driver.getDriver().findElement(By.xpath(footer));
    }


    //________________________________________Register______________________________________________
    // user > sign up/firstname
    @FindBy(xpath = "(//div[@class='form-label-group'])[1]")
    public WebElement regFirstNameBox;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement regSignUpButtton;

    @FindBy(xpath = "//*[text()=' Sinan ']")
    public WebElement regProfilNameControl;

    @FindBy(xpath = "(//h5)[9]")
    public WebElement kaydirici;



    //-------------------------
    @FindBy(id = "dropdownMenuLink")
    public WebElement profilDDM;

    @FindBy(xpath = "//a[text()=' My orders ']")
    public WebElement myOrdersDDM;

    @FindBy(xpath = "//div[@class='col-md-7']")
    public WebElement myOrderChek;

    public static WebElement cusinesMenu(int index){
        String footer = "(//div[@class='col cuisineMainPage'])["+ index + "]";
        ReusableMethods.wait(1);
        return Driver.getDriver().findElement(By.xpath(footer));
    }

    public static WebElement moreMenu(int index){
        Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-sm dropdown-toggle text-truncate shadow-none']")).click();
        String footer = "(//a[@class='p-2 pl-2 d-block'])["+ index + "]";
        ReusableMethods.wait(2);
        return Driver.getDriver().findElement(By.xpath(footer));
    }
}