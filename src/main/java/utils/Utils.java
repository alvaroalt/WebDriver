package utils;

public class Utils {

    private Utils() {

    }

    public static void pause(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
    }
}
