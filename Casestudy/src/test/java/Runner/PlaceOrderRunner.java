package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features//PlaceOrderTask.feature"
,glue = "Stepdefs",
monochrome=true,
dryRun = false

)
public class PlaceOrderRunner extends AbstractTestNGCucumberTests  {

}
