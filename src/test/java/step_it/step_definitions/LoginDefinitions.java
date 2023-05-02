package step_it.step_definitions;

import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import step_it.steps.LoginSteps;

@AllArgsConstructor
public class LoginDefinitions {

    private LoginSteps loginSteps;

    @When("the user enters correct {word} and {word}")
    public void theUserEntersCorrectUsernameAndPassword(String username, String password) {
        loginSteps.login(username, password);
    }

    @When("the user logs out")
    public void theUserLogsOut() {
        loginSteps.logout();
    }
}
