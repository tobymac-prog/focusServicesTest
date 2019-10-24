/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
/**
 *
 * @author Luis Hernandez
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumberreports.json", "html:target/cucumber-html-report"},
        glue = "stepDefinitions",
        features = "src/test/java/features",
        tags = {"@single"},
        dryRun = false
)

public class RunTest {
    
}