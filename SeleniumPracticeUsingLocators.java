package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPracticeUsingLocators {
    public static void main(String[] args) {
    //To open and execute the code in another window
    ChromeOptions options= new ChromeOptions();
    options.addArguments("incognito");
    //To launch a chrome browser
    ChromeDriver driver=new ChromeDriver(options);
    //To Open a site
    driver.get("http://leaftaps.com/opentaps/.");
    //To maximize the window
    driver.manage().window().maximize();
    //To find the elements of the field and passing inputs to the field
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    //To find the element of the field and To perform click action
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM")).click();
    driver.findElement(By.linkText("Accounts")).click();
    //driver.findElement(By.xpath("//a[text()='Create Account']")).click();
    driver.findElement(By.linkText("Create Account")).click();
    //To find the elements of the field and passing inputs to the field
    driver.findElement(By.id("accountName")).sendKeys("Yazhini");
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    driver.findElement(By.id("numberEmployees")).sendKeys("5000");
    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
    //To find the element of the field and To perform click action
    driver.findElement(By.className("smallSubmit")).click();
    //To get title of the site
    driver.getTitle();
    //To close the window
    //driver.close();
 }
   


}
