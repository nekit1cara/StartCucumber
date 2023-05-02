package step_it.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.step_it.utils.PropertyReader;

import static org.step_it.driver.LocalWebDriverManager.getDriver;
import static org.step_it.driver.LocalWebDriverManager.quitDriver;

@Slf4j
public class TestHook {

    @Before(value = "@Start")
    public void startBrowser() {
        log.info("Opening the application login page");
        getDriver().get(PropertyReader.getConfigProperty("url"));
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        log.info("Starting scenario: {}", scenario.getName());
        log.info("Scenario tag {}", scenario.getSourceTagNames());
    }

//    @AfterStep
//    public void addScreenshot(Scenario scenario){
//        final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(screenshot, "image/png", "image");
//    }

    @After()
    public void afterScenario(Scenario scenario) {
        log.info("Finished scenario: {}", scenario.getName());
    }

    @After(value = "@Stop")
    public void driverTearDown() {
        log.info("Quitting the browser");
        quitDriver();
    }

}