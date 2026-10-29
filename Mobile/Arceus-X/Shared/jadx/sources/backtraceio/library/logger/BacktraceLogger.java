package backtraceio.library.logger;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceLogger {
    private static Logger logger = new BacktraceInternalLogger();

    /* JADX INFO: renamed from: d */
    public static int m7080d(String str, String str2) {
        return logger.mo7076d(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m7081e(String str, String str2) {
        return logger.mo7077e(str, str2);
    }

    public static Logger getLogger() {
        return logger;
    }

    @Deprecated
    public static void setLevel(@NotNull LogLevel logLevel) {
        Logger logger2 = logger;
        if (logger2 instanceof BacktraceInternalLogger) {
            ((BacktraceInternalLogger) logger2).setLevel(logLevel);
        }
    }

    public static void setLogger(@NotNull Logger logger2) {
        if (logger2 == null) {
            throw new IllegalArgumentException("Passed custom logger implementation can`t be null");
        }
        logger = logger2;
    }

    /* JADX INFO: renamed from: w */
    public static int m7083w(String str, String str2) {
        return logger.mo7079w(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: e */
    public static int m7082e(String str, String str2, Throwable th2) {
        return logger.mo7078e(str, str2, th2);
    }
}
