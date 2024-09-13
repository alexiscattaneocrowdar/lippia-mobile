package com.crowdar.examples.constants;

public class ClockifyHomeConstants {

    public static final String TITLE_LOCATOR = "ID:me.clockify.android:id/toolbar_title";
    public static final String TITLE_VIEW_NOT_DISPLAYED_MESSAGE = "No se visualiza la home de clockify";
    public static String dedicationWidgetLocator(String description){
        return String.format("XPATH://android.widget.TextView[@text='%s']",description);
    }
    public static final String DEDICATION_WIDGET_VIEW_NOT_DISPLAYED_MESSAGE = "No se visualiza la dedicacion";
}
