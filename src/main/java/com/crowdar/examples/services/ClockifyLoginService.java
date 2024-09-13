package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyLoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(ClockifyLoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(ClockifyLoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(ClockifyLoginConstants.LOGIN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(ClockifyLoginConstants.LOGIN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyLoginConstants.EMAIL_INPUT_LOCATOR), ClockifyLoginConstants.VIEW_NOT_DISPLAYED_EMAIL_MESSAGE);
    }
}
