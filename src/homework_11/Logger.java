package homework_11;

public class Logger {
    private static final Logger instance;

    static {
        instance = new Logger();
    }

    public static Logger getInstance() {
        return instance;
    }

    public static void log(String massage, int a) { //
        for (int i = 0; i < a; i++) {
            System.out.println(massage);
        }
    }
}