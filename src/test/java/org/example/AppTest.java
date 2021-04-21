package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Login {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\Documents\\driversSelenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
        System.out.println("...Open browser...");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
        System.out.println("...Close browser...");
    }

    @Test
    public void login(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("global-user-trigger"))).click();
        System.out.println("Click in user icon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@data-affiliatename='espn'])[1]")));
        System.out.println("Click on login");
        driver.switchTo().frame("disneyid-iframe");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='Email'][placeholder='Username or Email Address']"))).click();
        System.out.println("Click on e-mail textbox");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='Email'][placeholder='Username or Email Address']"))).sendKeys("Rosangelapedrozoc@gmail.com");
        System.out.println("Type the e-mail address");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password'][placeholder='Password (case sensitive)']"))).click();
        System.out.println("Click on password textbox");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password'][placeholder='Password (case sensitive)']"))).sendKeys("Rosangela1993*");
        System.out.println("Type the password");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin"))).click();
        System.out.println("Click on login button");
    }

    @Test
    public void logout(){
        //precondition: being logged in
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("global-user-trigger"))).click();
        System.out.println("Click in user icon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='global-viewport']/div[3]/div/ul[1]/li[9]/a"))).click();
        System.out.println("Click on logout");
    }

    @Test
    public void cancelAccount(){
        //precondition: being logged in
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("global-user-trigger"))).click();
        System.out.println("Click in user icon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='global-viewport']/div[3]/div/ul[1]/li[5]/a"))).click();
        System.out.println("Click on ESPN Profile");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("cancel-account"))).click();
        System.out.println("Click on Delete Account");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='did-ui-view']/div/section/section/div[2]/button[1]"))).click();
        System.out.println("Click on confirmation button");

    }
}