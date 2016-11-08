package au.com.serviceseeking.utility;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Joseph Puangco on 02/11/2016.
 */
public class SSFont {

    public static Typeface getTypeFace(Context act) {
        return Typeface.createFromAsset(act.getAssets(), "fonts/Material-Design-Iconic-Font.ttf");
    }
    public static Typeface getTypeFace2(Context act){
        return Typeface.createFromAsset(act.getAssets(), "fonts/fontawesome-webfont.ttf");
    }
}