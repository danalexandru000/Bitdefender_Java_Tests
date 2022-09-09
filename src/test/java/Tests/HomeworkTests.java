package Tests;

import Pages.AccountHomepage;
import Pages.accountLoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HomeworkTests extends TestBase{
    @Test

    public void wrongPasswordLogin () throws IOException{
        accountLoginPage login = new accountLoginPage(driver);

        login.goToBitdefender();
        login.clickOnAllowAllButton();
        login.clickOnSignInButton();
        login.typeUserMail();
        login.clickOnNextButton();
        login.typeWrongUserPass();
        login.clickOnSignIn();
        Assert.assertEquals(login.getPasswordError(),"Wrong password. Try again.");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File("C:\\Users\\adchiru\\Desktop\\Homework_Chiru\\screen1.png"));

    }

    @Test
    public void downloadTest () throws IOException{
        accountLoginPage login = new accountLoginPage(driver);
        AccountHomepage homepage = new AccountHomepage(driver);

        login.goToBitdefenderAndMeasureLoadTime();
        login.clickOnAllowAllButton();
        login.clickOnSignInButton();
        login.typeUserMail();
        login.clickOnNextButton();
        login.typeUserPass();
        login.clickOnSignIn();
        homepage.clickOnFreeTrialLink();
        homepage.clickOnInstallOnDevice();
        homepage.clickOnSecurityButton();
        homepage.clickOnThisDeviceButton();
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File("C:\\Users\\adchiru\\Desktop\\Homework_Chiru\\screen2.png"));
    }

    @Test
    public void deviceInformation ()throws IOException{
        accountLoginPage login = new accountLoginPage(driver);
        AccountHomepage homepage = new AccountHomepage(driver);

        login.goToBitdefender();
        login.clickOnAllowAllButton();
        login.clickOnSignInButton();
        login.typeUserMailInstalled();
        login.clickOnNextButton();
        login.typeUserPass();
        login.clickOnSignIn();
        homepage.clickOnMenuButton();
        homepage.clickOnMyDevicesButton();
        homepage.clickOnViewDetailsButton();
        homepage.clickOnDeviceInfoButton();
        Assert.assertEquals(homepage.getVendorTitle(),"Intel Corporate");
        Assert.assertEquals(homepage.getMacTitle(),"94:B8:6D:A6:20:57");
        Assert.assertEquals(homepage.getOsTitle(),"Microsoft Windows 10.0.19042.");
        homepage.clickOnRenameButton();
        homepage.renameDevice();
        homepage.clickOnSaveButton();
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File("C:\\Users\\adchiru\\Desktop\\Homework_Chiru\\screen3.png"));

    }

}
