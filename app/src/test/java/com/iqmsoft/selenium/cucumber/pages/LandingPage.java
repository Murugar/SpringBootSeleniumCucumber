package com.iqmsoft.selenium.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqmsoft.selenium.cucumber.utilities.EnvUtils;


public class LandingPage extends BasePage {
    private  static final Logger LOG = LoggerFactory.getLogger(LandingPage.class);

    public static final String XPATH_HEADER = "//div[@class='starter-template']/h2[text()='Message: Hello There!']";

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isLoaded() {
        // Used by implicit wait to test if page is finished loading
        return getDriver().findElement(By.xpath(XPATH_HEADER)) != null;
    }

    public static LandingPage go(WebDriver driver) {
        driver.navigate().to(EnvUtils.getEnvProperty(EnvUtils.SELENIUM_APP_URL));
        return new LandingPage(driver);
    }

}

