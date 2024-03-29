package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 27.09.16.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkSearchInputForm() {
        return isElementPresent(By.name("q"));
    }

    public boolean checkFirstGroup() {
        return isElementPresent(By.cssSelector(".list-item.list-item_pr"));
    }

    public boolean checkGroupMebmerCount() {
        return isElementPresent(By.cssSelector(".list-item__friends"));
    }

    public boolean checkMoreGroupButtom() {
        return isElementPresent(By.cssSelector(".show-more.mm-clickable.mm-getGroups"));
    }

    public boolean checkFirstGuest() {
        return isElementPresent(By.cssSelector(".list-item"));
    }

    public boolean checkLastVisitInfo() {
        return isElementPresent(By.cssSelector(".list-item__date"));
    }

    public boolean checkMoreFriendsButtom() {
        return isElementPresent(By.cssSelector(".show-more.mm-clickable.mm-showMore"));
    }

    public boolean checkTrackInfo() {
        return isElementPresent(By.cssSelector(".eventContent__audio-dur"));
    }
}