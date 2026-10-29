package backtraceio.library.services;

import android.util.Log;
import backtraceio.library.models.nativeHandler.CrashHandlerConfiguration;
import backtraceio.library.nativeCalls.BacktraceCrashHandlerWrapper;
import backtraceio.library.nativeCalls.SystemLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceCrashHandlerRunner {
    private static final String LOG_TAG = "BacktraceCrashHandlerRunner";
    private final BacktraceCrashHandlerWrapper crashHandler;
    private final SystemLoader loader;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceCrashHandlerRunner() {
        this(new BacktraceCrashHandlerWrapper(), new SystemLoader());
    }

    public static void main(String[] strArr) {
        new BacktraceCrashHandlerRunner().run(strArr, System.getenv());
    }

    public boolean run(String[] strArr, Map<String, String> map) {
        if (map == null) {
            Log.e(LOG_TAG, "Cannot capture crash dump. Environment variables are undefined");
            return false;
        }
        String str = map.get(CrashHandlerConfiguration.BACKTRACE_CRASH_HANDLER);
        if (str == null) {
            Log.e(LOG_TAG, String.format("Cannot capture crash dump. Cannot find %s environment variable", CrashHandlerConfiguration.BACKTRACE_CRASH_HANDLER));
            return false;
        }
        this.loader.loadLibrary(str);
        if (this.crashHandler.handleCrash(strArr)) {
            Log.i(LOG_TAG, "Successfully ran crash handler code.");
            return true;
        }
        Log.e(LOG_TAG, String.format("Cannot capture crash dump. Invocation parameters: %s", String.join(" ", strArr)));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceCrashHandlerRunner(BacktraceCrashHandlerWrapper backtraceCrashHandlerWrapper, SystemLoader systemLoader) {
        this.crashHandler = backtraceCrashHandlerWrapper;
        this.loader = systemLoader;
    }
}
