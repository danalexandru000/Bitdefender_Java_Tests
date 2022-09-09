package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class AccountHomepage {
    WebDriver driver;

    public AccountHomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/app-root/app-organizer/ui-drawer/drawer-main/ui-drawer/drawer-main/main/app-dashboard/div/div/ui-card[1]/card-body/empty-state/div/a")
    private WebElement freeTrialLink;
    @FindBy (id = "button_1620826668") private WebElement installOnDeviceButton;
    @FindBy (xpath = "/html/body/app-root/ui-modal/div[1]/div/ng-component/app-install-protection-modal/div/ui-steps/div/step[1]/div/div/div/ui-card[1]/card-header")
    private WebElement securityOption;
    @FindBy (xpath = "/html/body/app-root/ui-modal/div[1]/div/ng-component/app-install-protection-modal/div/ui-steps/div/step[3]/div/div/div[2]/ui-card[1]/card-header")
    private WebElement thisDeviceOption;
    @FindBy (id = "a_1580325650") private WebElement myDevicesButton;
    @FindBy (id = "btn_1599662556_0") private WebElement viewDetailsButton;
    @FindBy (id = "btn_1608305123") private WebElement deviceInfoButton;
    @FindBy (id = "btn_1608304995_0") private WebElement renameButton;
    @FindBy (id = "input_1650953571") private WebElement inputDeviceName;
    @FindBy (id = "btn_1650953616") private WebElement saveButton;
    @FindBy ( xpath = "/html/body/app-root/app-organizer/ui-drawer/drawer-main/ui-drawer/drawer-main/main/devices-details/div/div/div[2]/div[1]/div/div/div[2]/ui-card/card-body/table/tr[1]/td/span")
    private WebElement vendorTitle;
    @FindBy (xpath = "/html/body/app-root/app-organizer/ui-drawer/drawer-main/ui-drawer/drawer-main/main/devices-details/div/div/div[2]/div[1]/div/div/div[2]/ui-card/card-body/table/tr[2]/td/span")
    private WebElement macTitle;
    @FindBy (xpath = "/html/body/app-root/app-organizer/ui-drawer/drawer-main/ui-drawer/drawer-main/main/devices-details/div/div/div[2]/div[1]/div/div/div[2]/ui-card/card-body/table/tr[3]/td/span")
    private WebElement osTitle;
    @FindBy (id = "btn_1602681683") private WebElement menuButton;


    public void clickOnFreeTrialLink(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(freeTrialLink));
        freeTrialLink.click();}
    public void clickOnInstallOnDevice(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(installOnDeviceButton));
        installOnDeviceButton.click();}
    public void clickOnSecurityButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5,1));
        wait.until(ExpectedConditions.visibilityOf(securityOption));
        securityOption.click();}
    public void clickOnMyDevicesButton(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(myDevicesButton));
        myDevicesButton.click();}
    public void clickOnViewDetailsButton(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(viewDetailsButton));
        viewDetailsButton.click();}
    public void clickOnDeviceInfoButton(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(deviceInfoButton));
        deviceInfoButton.click();}
    public void clickOnThisDeviceButton(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(thisDeviceOption));
        thisDeviceOption.click();}
    public void clickOnRenameButton(){renameButton.click();}
    public void renameDevice(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(inputDeviceName));
        inputDeviceName.sendKeys("Name Modified");}
    public void clickOnSaveButton(){saveButton.click();}
    public String getVendorTitle () {return vendorTitle.getText();}
    public String getMacTitle () {return macTitle.getText();}
    public String getOsTitle () {return osTitle.getText();}
    public void clickOnMenuButton (){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(menuButton));
        menuButton.click();}
}

