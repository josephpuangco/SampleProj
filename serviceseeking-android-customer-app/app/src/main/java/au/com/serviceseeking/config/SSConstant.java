package au.com.serviceseeking.config;


public class SSConstant {
    public static final String NON_PROD = "https://staging.serviceseeking.com.au";
    public static final String PROD = "https://api.serviceseeking.com.au";
    public static final String NON_PROD_BASIC_AUTH = "Basic c3NzdGFnaW5nOnNzVDNzdDFuZyE=, Token token=";
    public static final String PROD_BASIC_AUTH = "Basic c3NhcGk6NyYzI2FzZGxrag==, Token token=";

    public static String TOKEN = "";

    public static final int LeadListPageSize = 7;
    public static final int PAGE_SIZE = 7;
    public static final int DELAY = 30;


    //Lead List Sort Type
    public static final String SORT_LATEST = "latest";
    public static final String SORT_CLOSET = "closest";

    public static final String[] ANDROID_VERSION = new String[]{
            "ANDROID BASE", "ANDROID BASE 1.1", "CUPCAKE", "DONUT",
            "ECLAIR", "ECLAIR_0_1", "ECLAIR_MR1", "FROYO", "GINGERBREAD",
            "GINGERBREAD_MR1", "HONEYCOMB", "HONEYCOMB_MR1", "HONEYCOMB_MR2",
            "ICE_CREAM_SANDWICH", "ICE_CREAM_SANDWICH_MR1", "JELLY_BEAN", "JELLY_BEAN_MR1",
            "JELLY_BEAN_MR2", "KITKAT", "KITKAT_WATCH", "LOLLIPOP", "LOLLIPOP_MR1", "M"
    };

    //GCM
    public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    public static final String GCM_SENDER_ID = "395387719897";

    //HTTP Status Code
    public static final int RESPONSE_OK = 200;
    public static final int RESPONSE_OK_UPLOAD = 201;
    public static final int RESPONSE_NO_CONTENT = 204;
    public static final int RESPONSE_DEFAULT_ERROR = 500;
    public static final int RESPONSE_CANCEL_ERROR = 454;
    public static final int RESPONSE_401 = 401;
    public static final int RESPONSE_101 = 101;

    //Request Code
    public static final int REQUEST_CODE_LEAD_SETTING = 10010;
    public static final int REQUEST_CODE_LEAD_DETAIL = 10020;
    public static final int REQUEST_CODE_CONTACT_CUSTOMER = 10030;
    public static final int REQUEST_CODE_QUOTED_RECENT_UPLOAD = 12010;
    public static final int REQUEST_CODE_QUOTED_GALLERY_UPLOAD = 12020;
    public static final int REQUEST_CODE_QUOTED_DETAIL = 12030;
    public static final int REQUEST_CODE_QUOTED_REPORT_HIRE = 12040;
    public static final int REQUEST_CODE_CHAT_THREAD = 10040;

    //Result Code
    public static final int RESULT_CODE_CONTACT_CUSTOMER = 20010;
    public static final int RESULT_CODE_DISCARD = 20020;
    public static final int RESULT_CODE_UNDISCARD = 20030;
    public static final int RESULT_REPORT_HIRE = 20040;

    //GCM
    public static final String EXTRA_ACTION_CODE = "actionCode";
    public static final String EXTRA_HAS_WAKELOCK = "hasWakeLock";

    public static final int ACTION_REGISTER_GCM = 1;

    public static final int MAX_RETRIES = 15;
    public static final int DEFAULT_BACKOFF_MS = 2000;

    public static final String[] EMAIL_FEEDBACK = {"android+feedback@serviceseeking.com.au"};
    public static final String[] EMAIL_REPORT_BUG = {"android+bug@serviceseeking.com.au"};
    public static final String[] EMAIL_REQUEST_HELP = {"support@serviceseeking.com.au"};

    //Chat
    public static int sChatReloadTime = 30000;

}