package ru.my.mail.tests.myprofile;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfileVideo extends TestBase {

    @Test

    public void testMyProfileVideo(){
        app.getNavigationHelper().goToMyProfilePage();
        app.getProfileHelper().openMyProfileVideo();
        Assert.assertTrue(app.getProfileHelper().checkMyVideoAlbum());
    }
}
