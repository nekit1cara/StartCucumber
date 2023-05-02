package step_it.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import step_it.steps.CommonSteps;
import step_it.steps.ProductSteps;
@AllArgsConstructor
public class ProductDefinitions {

    private CommonSteps commonSteps;
    private ProductSteps productSteps;

    @Given("the app is on product page")
    public void TheAppIsOnProductPage(){
        productSteps.checkProductsOnPageAreDisplayed();
    }
    @When("the user adds {} to cart")
    public void theUserOpensProduct(String product) {
        commonSteps.checkCartIsEmpty();
        productSteps.addProductToCart(product);
    }

}
