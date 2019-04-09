package models;

public class testCase {
    private static boolean testCaseStatus = true;
    private static String testCaseLog;

    public static boolean isTestCaseStatus() {
        return testCaseStatus;
    }

    public static void setTestCaseStatus(boolean testCaseStatus) {
        testCase.testCaseStatus = testCaseStatus;
    }

    public static String getTestCaseLog() {
        return testCaseLog;
    }

    public static void setTestCaseLog(String testCaseLog) {
        testCase.testCaseLog = testCaseLog;
    }
}
