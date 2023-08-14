package error_handlers;

public class Logger {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    /**
     * Log.
     *
     * @param message the message
     */
    public static void info(String message) {
        logger.info(message);
    }
}
