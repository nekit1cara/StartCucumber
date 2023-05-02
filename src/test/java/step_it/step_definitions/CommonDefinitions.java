package step_it.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import step_it.steps.CommonSteps;

@AllArgsConstructor
public class CommonDefinitions {

    private CommonSteps commonSteps;

    @Given("the app login page is open")
    public void theAppLoginPageIsOpen() {
        commonSteps.checkLoginPageIsOpen();
    }

    @Then("the user is logged in")
    public void theUserIsLoggedIn() {
        commonSteps.checkUserLoggedIn();
    }

    @Then("the cart counter is updated by {int}")
    public void theCartCounterIsUpdatedBy(int counter) {
        commonSteps.checkCartCounterUpdated(counter);
    }
}
