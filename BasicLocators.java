package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BasicLocators {
        public static void main(String[] args) throws InterruptedException {
         ChromeOptions options=new ChromeOptions();
         options.addArguments("--incognito");
        ChromeDriver driver=new ChromeDriver(options);
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\u405394\\Documents\\Automation Testing\\Exercise\\Driver\\msedgedriver.exe");
        //EdgeDriver driver=new EdgeDriver();

        driver.get("http://leaftaps.com/opentaps/"); 
        Thread.sleep(5000);
        //driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("org");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yazhini");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaliyamoorthi");
        WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sDropdown = new Select(sourceDropdown);
        sDropdown.selectByIndex(4);
        WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select mCampaign=new Select(marketingCampaign);
        mCampaign.selectByVisibleText("Automobile");
        WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select ownershipD=new Select(Ownership);
        ownershipD.selectByValue("OWN_CCORP");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        //driver.close();
    

}}

        


    


