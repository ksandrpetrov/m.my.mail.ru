package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("Login"), username);
        type(By.name("Password"), password);
        click(By.xpath("//*[@class='heightContent__input heightContent__email mm-clickable mm-count']"));
    }
}
