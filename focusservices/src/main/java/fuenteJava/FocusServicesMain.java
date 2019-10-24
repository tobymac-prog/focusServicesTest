/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuenteJava;

//import static com.mycompany.focusservices.DriverMethodsTest.cleanUpAndClose;
import static fuenteJava.DriverMethodsTest.getWebSite;
import static fuenteJava.DriverMethodsTest.pausa;
import static fuenteJava.DriverMethodsTest.sendKeysMethod;
import static fuenteJava.DriverMethodsTest.validateElementLinkTest;
import static fuenteJava.DriverMethodsTest.findElementClick;
import static fuenteJava.DriverMethodsTest.scrollToMethod;
/**
 *
 * @author Luis Hernandez
 */
public class FocusServicesMain extends TestValues { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        getWebSite(urlWebSite);
        sendKeysMethod(typeName,textBoxGoogle,valueSearch);
        validateElementLinkTest(focusServicesWebPage);
        findElementClick(typXpath,focusServicesXpath);
        scrollToMethod();
        findElementClick(typXpath,nowHiringBotton);
        sendKeysMethod(typeId,searchkeywords,"inbound");
        findElementClick(typXpath,carrerJobXpath);
        pausa(500);
        //cleanUpAndClose();
        
    } 
}
