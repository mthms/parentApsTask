package helpers.android;

public class loginActivity_Selectors {
    private static String emailAddressSelector_xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.View/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText";
    private static String passwordSelector_xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.View/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText";
    private static String loginButtonSelector_xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.View/android.widget.RelativeLayout/android.widget.Button\n";

    public static String getEmailAddressSelector_xPath() {
        return emailAddressSelector_xPath;
    }

    public static String getPasswordSelector_xPath() {
        return passwordSelector_xPath;
    }

    public static String getLoginButtonSelector_xPath() {
        return loginButtonSelector_xPath;
    }
}
