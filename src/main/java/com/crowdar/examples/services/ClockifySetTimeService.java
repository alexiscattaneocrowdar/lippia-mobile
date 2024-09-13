package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifySetTimeConstants;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ClockifySetTimeService {

    public static void setTimeDedication(String desiredStartHs, String desiredStartMin, String desiredEndHs, String desiredEndMin){
        setTime(ClockifySetTimeConstants.START_TIME_BUTTON_LOCATOR, ClockifySetTimeConstants.VIEW_NOT_DISPLAYED_START_TIME_BUTTON_MESSAGE, desiredStartHs, desiredStartMin);
        setTime(ClockifySetTimeConstants.END_TIME_BUTTON_LOCATOR, ClockifySetTimeConstants.VIEW_NOT_DISPLAYED_END_TIME_BUTTON_MESSAGE, desiredEndHs, desiredEndMin);
        ClockifyCommonService.tapOnFloatingButton();
    }

    private static void setTime(String locator, String messageNotViewLocator, String desiredHs, String desiredMin){
        MobileActionManager.waitVisibility(locator);
        Assert.assertTrue(MobileActionManager.isVisible(locator), messageNotViewLocator);
        MobileActionManager.click(locator);
        setNumberTime(desiredMin, TimeUnit.MINUTES);
        setNumberTime(desiredHs, TimeUnit.HOURS);
    }

    private static void setNumberTime(String desiredTime, TimeUnit unit) {
        // Obtener los locators de los elementos necesarios
        String[] timeLocators = ClockifySetTimeConstants.getTimeLocators(unit);

        // Obtener el tiempo actual mostrado en la interfaz
        String currentTime = MobileActionManager.getText(timeLocators[1]);

        // Obtener los locators de los botones de incremento y decremento
        String decrementButton = timeLocators[0];
        String incrementButton = timeLocators[2];

        // Convertir el tiempo actual y el tiempo deseado a enteros
        int currentTimeInt = Integer.parseInt(currentTime);
        int targetTimeInt = Integer.parseInt(desiredTime);

        // Calcular la diferencia y el número de pasos necesarios
        int maxValue = (unit == TimeUnit.HOURS) ? 24 : 60; // Horas o minutos
        int stepsForward = (targetTimeInt - currentTimeInt + maxValue) % maxValue;
        int stepsBackward = (currentTimeInt - targetTimeInt + maxValue) % maxValue;

        // Decidir si avanzar o retroceder
        if (stepsForward <= stepsBackward) {
            // Mover hacia adelante
            for (int i = 0; i < stepsForward; i++) {
                MobileActionManager.click(incrementButton);
            }
        } else {
            // Mover hacia atrás
            for (int i = 0; i < stepsBackward; i++) {
                MobileActionManager.click(decrementButton);
            }
        }
    }
}