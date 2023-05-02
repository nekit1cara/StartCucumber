package step_it.steps;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.step_it.pages.ProductPage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Slf4j
@AllArgsConstructor
public class ProductSteps {

    private Object mainPage;
    private ProductPage productPage;

    public void checkProductsOnPageAreDisplayed() {
        log.info("Check product are displayed");
        productPage.WaitUntilProductsAreDisplayed();
    }

    public void addProductToCart(String product) {
        productPage.addProductToCart(product);
    }
}
