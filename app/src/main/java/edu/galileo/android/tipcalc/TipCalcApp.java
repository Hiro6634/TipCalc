package edu.galileo.android.tipcalc;

import android.app.Application;
/**
 * Created by Hiro on 17/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/adriancatalan";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
