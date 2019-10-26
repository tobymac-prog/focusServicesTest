/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuenteJava;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
/**
 *
 * @author Luis Hernandez
 */
public class DriverMethodsTest {
    
    public static WebDriver driver;
    public static WebDriver wait;
    
    public static void getWebSite(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
    
    /*public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/SeleniumWebdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}*/
        
    public static void cleanUpAndClose(String objectType,String values, String expectedValue){
        switch(objectType) {
        case "linkText":
        break;
        case "name":
        break;
        case "id":
        break;
        case "xpath":
            WebElement webElement = driver.findElement(By.xpath(values));
            System.out.print(webElement.getText());                                                      
        try {
            assertThat(webElement.getText()).isEqualTo(expectedValue);
        } finally {
            driver.quit();
        }
        break;
        default:}
        
    }
    
    public static void pausa(long sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException ex) {
        }
    }
    
    public static void validateElementLinkTest(String element){
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);     
    if(!driver.findElements(By.linkText(element)).isEmpty()){
        System.out.print("El Link no esta disponible");
        }else{
        System.out.print("El Link esta disponible"); 
        }
    }
    
    public static void findElementClick(String objectType, String Values){
    switch(objectType) {
    case "linkText":
      if(!driver.findElements(By.linkText(Values)).isEmpty()){
        driver.findElement(By.linkText(Values)).click();
        //System.out.print("Objeto  disponible");
        }else{
        //System.out.print("Objeto no disponible entra en timeunit"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.linkText(Values)).click();
        }   
    break;
    case "name":
     if(!driver.findElements(By.name(Values)).isEmpty()){
        driver.findElement(By.name(Values)).click();
        //System.out.print("Objeto  disponible");
        }else{
        //System.out.print("Objeto no disponible entra en timeunit"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.name(Values)).click();
        }   
    // code block
    break;
    case "id":
     if(!driver.findElements(By.id(Values)).isEmpty()){
        driver.findElement(By.id(Values)).click();
        //System.out.print("Objeto  disponible");
        }else{
        //System.out.print("Objeto no disponible entra en timeunit"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.id(Values)).click();
        }   
    // code block
    break;
     case "xpath":
     if(!driver.findElements(By.xpath(Values)).isEmpty()){
        driver.findElement(By.xpath(Values)).click();
        //System.out.print("Objeto  disponible");
        }else{
        //System.out.print("Objeto no disponible entra en timeunit"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.xpath(Values)).click();
        }   
    // code block
    break;
    default:
    // code block
    }
    }
 
    public static void sendKeysMethod(String objectType ,String fiel, String values){
    switch(objectType) {
    case "linkText":
      if(!driver.findElements(By.linkText(fiel)).isEmpty()){
        driver.findElement(By.linkText(fiel)).click();
        driver.findElement(By.linkText(fiel)).sendKeys(values);
        driver.findElement(By.linkText(fiel)).sendKeys(Keys.ENTER);
        //System.out.print("Disponible en name");
        }else{
       // System.out.print("No Disponible en name"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.linkText(fiel)).click();
        driver.findElement(By.linkText(fiel)).sendKeys(values);
        driver.findElement(By.linkText(fiel)).sendKeys(Keys.ENTER);
        }   
    break;
    case "name":
     if(!driver.findElements(By.name(fiel)).isEmpty()){
        driver.findElement(By.name(fiel)).click();
        driver.findElement(By.name(fiel)).sendKeys(values);
        driver.findElement(By.name(fiel)).sendKeys(Keys.ENTER);
        //System.out.print("Disponible en name");
        }else{
        //System.out.print("No Disponible en name"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.name(fiel)).click();
        driver.findElement(By.name(fiel)).sendKeys(values);
        driver.findElement(By.name(fiel)).sendKeys(Keys.ENTER);
        }   
    // code block
    break;
    case "id":
     if(!driver.findElements(By.id(fiel)).isEmpty()){
        driver.findElement(By.id(fiel)).click();
        driver.findElement(By.id(fiel)).sendKeys(values);
        driver.findElement(By.id(fiel)).sendKeys(Keys.ENTER);
        //System.out.print("Disponible en id");
        }else{
        //System.out.print("No Disponible en id"); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.id(fiel)).click();
        driver.findElement(By.id(fiel)).sendKeys(values);
        driver.findElement(By.id(fiel)).sendKeys(Keys.ENTER);
        }   
    // code block
    break;
    default:
    // code block
    }
    }
    
    public static void scrollToMethod(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,0)");
    }
 }
