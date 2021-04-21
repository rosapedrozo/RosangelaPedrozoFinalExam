package org.example.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
    WebDriver driver;
        By userName = By.name("Rosangelapedrozoc@gmail.com");
        By password = By.name("Rosangela1993*");
        By login = By.name("btnLogin");

        //Set username in the textbox

    public void setUserName(By userName) {
        this.userName = userName;
        driver.findElement(userName).sendKeys(userName);
    }
    //Set password in textbox
    public void setPassword(By password){
        this.password =password;
        driver.findElement(password).sendKeys(password);
    }
    //Click on Login button
    public void clickLogin () {
        driver.findElement(login).click();
    }

    /***
     *@author Rosangela
     * @description this method will run Login Test case in the webpage
     * @param userName
     * @param password
     */

    public void loginToRosa(String userName,String password){

        //Fill user name

        this.setUserName(userName);

        //Fill password

        this.setPassword(password);

        //Click Login button

        this.clickLogin();
    }

}
public class Logout {
    WebDriver driver;
    By usericon = By.id("#global-user-trigger");
    By logout = By.xpath("//*[@id=\"global-viewport\"]/div[3]/div/ul[1]/li[9]/a");

    //Click on user icon
    public void clickUserIcon(){
        driver.findElement(usericon).click();
    }
    //Click on LogOut button
    public void clickLogin () {
        driver.findElement(logout).click();
    }
    /***
     *@author Rosangela
     * @description this method will run Logout Test case in the webpage
     * @param usericon
     * @param logout
     */

    public void logoutToRosa(String usericon,String logout){

        //Click user Icon

        this.clickLogin(usericon);

        //Click logout

        this.clickLogin(logout);

    }

}
