/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepDefinitions;

import fuenteJava.DriverInitializer;
import fuenteJava.DriverMethodsTest;
import fuenteJava.TestValues;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import java.io.File;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luis Hernandez
 */
public class StepDefinitionsFservices extends TestValues {
    
        WebDriver webDriver = null;
        @Given("I open chrome browser")
        public void iOpenChromeBrowser() throws Throwable {
        webDriver = DriverInitializer.getDriver("chrome");}
        
        @And("I open Google.com to search Focus Services")
        public void iOpenGoogle() throws Throwable {
        DriverInitializer.getProperty("urlWebSite"); 
        DriverMethodsTest.getWebSite(urlWebSite);
        DriverMethodsTest.sendKeysMethod(typeName,textBoxGoogle,valueSearch);}
        
        @And("I validate if the url https://www.focusservices.com exist")
        public void iValidateFservicesLink() throws Throwable {
            DriverMethodsTest.validateElementLinkTest(focusServicesWebPage);
        }
        
        @And("I click Focus Services – Beyond Expectations")
        public void iClickOnBeyond() throws Throwable {
            DriverMethodsTest.findElementClick(typXpath,focusServicesXpath);
        }
        
        @And("I validate if the botton Now Hiring exist")
        public void iValidateNowHiring() throws Throwable {
            DriverMethodsTest.scrollToMethod();
            DriverMethodsTest.validateElementLinkTest(nowHiringBotton);
         
        }
        
        @And("I click on Carrers")
        public void iClickOnCarrers() throws Throwable {
            DriverMethodsTest.findElementClick(typXpath,nowHiringBotton);
        }
       
        @And("I look for the inbound word")
        public void iLookInbound() throws Throwable {
            DriverMethodsTest.sendKeysMethod(typeId,searchkeywords,"inbound");
        }
        
        @When("I check the Job Description")
        public void iCheckJobDescription() throws Throwable {
            DriverMethodsTest.findElementClick(typXpath,carrerJobXpath);
        }
        
       @Then("I close the browser")
        public void iCloseBrowser() throws Throwable {
         DriverMethodsTest.cleanUpAndClose(typXpath,valueToFinish,expectedValue);
        }

}
