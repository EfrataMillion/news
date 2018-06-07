/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Efrata
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoPortal {
     public static void main(String[] args){
     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://portal.aait.edu.et");
        WebElement username = driver.findElement(By.name("UserName"));
        WebElement password = driver.findElement(By.name("Password"));
        WebElement login = driver.findElement(By.className("btn"));
        username.sendKeys("ATE/9466/08");
        password.sendKeys("0755");
        login.click();
        driver.findElement(By.cssSelector("#m2 > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#m2 > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
      
        WebElement lastSemisterGrade = driver.findElement(By.cssSelector("tr.yrsm:nth-child(8) > td:nth-child(1) > p:nth-child(2)"));
        System.out.println(lastSemisterGrade.getText());
     try{
         Thread.sleep(5000);
     }
     catch (Exception e){
         
     }
     driver.close();
     }
    
}
