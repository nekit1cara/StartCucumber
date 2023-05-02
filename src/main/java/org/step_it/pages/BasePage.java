package org.step_it.pages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.step_it.driver.LocalWebDriverManager;
import org.step_it.utils.PageLoader;

@Getter
public abstract class BasePage {

    private final PageLoader pageLoader;
    private WebDriver driver;

    public BasePage(){
        driver = LocalWebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }

}