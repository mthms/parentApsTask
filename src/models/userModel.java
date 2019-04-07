package models;

public class userModel {
    private static String emailAddress;
    private static String password;

    public static String getEmailAddress() {
        return emailAddress;
    }

    public static String getPassword() {
        return password;
    }

    public static void setEmailAddress(String emailAddress) {
        userModel.emailAddress = emailAddress;
    }

    public static void setPassword(String password) {
        userModel.password = password;
    }
}
