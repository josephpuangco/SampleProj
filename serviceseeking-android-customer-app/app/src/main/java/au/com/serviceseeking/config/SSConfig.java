package au.com.serviceseeking.config;

/**
 * Created by Joseph Puangco on 02/11/2016.
 */
public class SSConfig {
    private static final Boolean mDebugMode = true;
    private static final Boolean mDevMode = false;
    private static final Boolean mCloakMode = false;

    public static Boolean isDebugMode() {
        return mDebugMode;
    }

    public static Boolean isDevMode() {
        return mDevMode;
    }

    public static Boolean isCloakMode() {
        return mCloakMode;
    }

    public static String getServerUrl() {
        return mDevMode ? SSConstant.NON_PROD : SSConstant.NON_PROD;
    }

}