package helpers.android;

public class beesClassActivity_Selectors {
    private static String sarahSmithProfilePicture_Selector = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.recyclerview.widget.RecyclerView/android.view.View[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout\n";
    private static  String profileButton_Selector = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.FrameLayout[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]\n";

    public static String getProfileButton_Selector() {
        return profileButton_Selector;
    }

    public static String getSarahSmithProfilePicture_Selector() {
        return sarahSmithProfilePicture_Selector;
    }
}
