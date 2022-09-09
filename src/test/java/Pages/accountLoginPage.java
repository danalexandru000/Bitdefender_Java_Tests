package Pages;

import Utils.Dataitems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class accountLoginPage {
    WebDriver driver;

    public accountLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "/html/body/app-root/app-home/div/div/main/div/div/div[1]/div/h1/text()")
    private WebElement pageTitle;
    @FindBy (xpath = "/html/body/app-root/app-home/div/div/main/div/div/div[1]/div/div[2]/button[1]")
    private WebElement signInButton;
    @FindBy (id = "username") private WebElement inputEmail;
    @FindBy (id = "login-next") private WebElement nextButton;
    @FindBy (xpath = "/html/body/ui-view/div/main/div/div[1]/ui-view/form/div[3]/div/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy (id = "password-sign-in") private WebElement passwordSignInButton;
    @FindBy (xpath = "/html/body/ui-view/div/main/div/div[1]/ui-view/form/div[3]/div/div[3]")
    private WebElement wrongPassError;
    @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement allowAllCookiesButton;

    public void goToBitdefenderAndMeasureLoadTime (){
        long start = System.currentTimeMillis();
        driver.get(Dataitems.ENVIROMENT);
        long finish = System.currentTimeMillis();
        long totalTime = finish - start;
        System.out.println("Total Time for page load - "+totalTime);}
    public void goToBitdefender (){driver.get(Dataitems.ENVIROMENT);}
    public String getWelcomeMessage(){return pageTitle.getText();}
    public void clickOnSignInButton(){signInButton.click();}
    public void typeUserMail(){inputEmail.sendKeys(Dataitems.userEmail);}
    public void typeUserMailInstalled(){inputEmail.sendKeys(Dataitems.userEmailInstalledDevice);}
    public void clickOnNextButton(){nextButton.click();}
    public void typeUserPass(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(Dataitems.password);}
    public void typeWrongUserPass(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys(Dataitems.wrongPassword);}
    public void clickOnSignIn(){passwordSignInButton.click();}
    public String getPasswordError(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(wrongPassError));
        return wrongPassError.getText();}
    public void clickOnAllowAllButton(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(allowAllCookiesButton));
        allowAllCookiesButton.click();}
}
