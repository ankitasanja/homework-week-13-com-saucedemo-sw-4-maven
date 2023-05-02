package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");

    By loginButton = By.id("login-button");
    By productsText = By.xpath("//span[@class='title']");
    By verifySixProducts = By.xpath("//div[@class='inventory_item']");

    public void enterUsername(String username) {
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getProductText() {
        return getTextFromElement(productsText);
    }

    public int countProductOnList() {
        List<WebElement> productsList = driver.findElements(By.className("inventory_item_label"));
        return productsList.size();
    }
}
