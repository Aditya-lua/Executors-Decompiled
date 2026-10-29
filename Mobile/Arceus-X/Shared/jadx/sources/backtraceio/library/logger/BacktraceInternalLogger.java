package backtraceio.library.logger;

import android.util.Log;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceInternalLogger implements Logger {
    private static final String BASE_TAG = "BacktraceLogger: ";
    private int logLevel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceInternalLogger() {
        this(LogLevel.OFF);
    }

    private String getTag(String str) {
        return BASE_TAG + str;
    }

    @Override // backtraceio.library.logger.Logger
    /* JADX INFO: renamed from: d */
    public int mo7076d(String str, String str2) {
        if (this.logLevel <= LogLevel.DEBUG.ordinal()) {
            return Log.d(getTag(str), str2);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.logger.Logger
    /* JADX INFO: renamed from: e */
    public int mo7077e(String str, String str2) {
        if (this.logLevel <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2);
        }
        return 0;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public void setLevel(@NotNull LogLevel logLevel) {
        this.logLevel = logLevel.ordinal();
    }

    @Override // backtraceio.library.logger.Logger
    /* JADX INFO: renamed from: w */
    public int mo7079w(String str, String str2) {
        if (this.logLevel <= LogLevel.WARN.ordinal()) {
            return Log.w(getTag(str), str2);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceInternalLogger(@NotNull LogLevel logLevel) {
        this.logLevel = logLevel.ordinal();
    }

    @Override // backtraceio.library.logger.Logger
    /* JADX INFO: renamed from: e */
    public int mo7078e(String str, String str2, Throwable th2) {
        if (this.logLevel <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2, th2);
        }
        return 0;
    }
}
