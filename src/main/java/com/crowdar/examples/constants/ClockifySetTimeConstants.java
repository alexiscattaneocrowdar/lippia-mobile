package com.crowdar.examples.constants;
import java.util.concurrent.TimeUnit;

public class ClockifySetTimeConstants {
    public static final String START_TIME_BUTTON_LOCATOR = "ACCESSIBILITY_ID:START";
    public static final String END_TIME_BUTTON_LOCATOR = "ACCESSIBILITY_ID:END";
    private static String PREV_TIME_LOCATOR_TEMPLATE = "XPATH://android.widget.NumberPicker[%s]/android.widget.Button[1]";
    private static String ACTUAL_TIME_LOCATOR_TEMPLATE = "XPATH://android.widget.NumberPicker[%s]/android.widget.EditText";
    private static String NEXT_TIME_LOCATOR_TEMPLATE = "XPATH://android.widget.NumberPicker[%s]/android.widget.Button[2]";

    public static String[] getTimeLocators(TimeUnit unit){
        String timeLocators[] = new String[3];
        int index;
        switch (unit) {
            case HOURS:
                index = 1;
                timeLocators[0] = String.format(PREV_TIME_LOCATOR_TEMPLATE,index);
                timeLocators[1] = String.format(ACTUAL_TIME_LOCATOR_TEMPLATE,index);
                timeLocators[2] = String.format(NEXT_TIME_LOCATOR_TEMPLATE,index);
                break;
            case MINUTES:
                index = 2;
                timeLocators[0] = String.format(PREV_TIME_LOCATOR_TEMPLATE,index);
                timeLocators[1] = String.format(ACTUAL_TIME_LOCATOR_TEMPLATE,index);
                timeLocators[2] = String.format(NEXT_TIME_LOCATOR_TEMPLATE,index);
                break;
            default:
                throw new RuntimeException("Unidad de tiempo no soportada");
        }
        return timeLocators;
    }

    public static final String VIEW_NOT_DISPLAYED_START_TIME_BUTTON_MESSAGE = "No se visualiza el boton de start time!";
    public static final String VIEW_NOT_DISPLAYED_END_TIME_BUTTON_MESSAGE = "No se visualiza el boton de end time!";

}