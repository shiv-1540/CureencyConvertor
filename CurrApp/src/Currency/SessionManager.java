
package Currency;

public class SessionManager {
    private static int loggedInUserId = -1;

    public static int getLoggedInUserId() {
        return loggedInUserId;
    }

    public static void setLoggedInUserId(int userId) {
        loggedInUserId = userId;
    }

    public static boolean isUserLoggedIn() {
        return loggedInUserId != -1;
    }

    public static void logout() {
        loggedInUserId = -1;
    }
}
