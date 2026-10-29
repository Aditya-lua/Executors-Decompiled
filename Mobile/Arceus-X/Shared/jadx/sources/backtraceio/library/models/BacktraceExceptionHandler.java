package backtraceio.library.models;

import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.logger.BacktraceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p210j6.C7032a;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String LOG_TAG = "BacktraceExceptionHandler";
    private static final Map<String, Object> customAttributes = new HashMap<String, Object>() { // from class: backtraceio.library.models.BacktraceExceptionHandler.1
        {
            put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.UnhandledExceptionAttributeType);
        }
    };
    private final C7032a client;
    private final Thread.UncaughtExceptionHandler rootHandler;
    private final CountDownLatch signal = new CountDownLatch(1);

    private BacktraceExceptionHandler(C7032a c7032a) {
        BacktraceLogger.m7080d(LOG_TAG, "BacktraceExceptionHandler initialization");
        this.client = c7032a;
        this.rootHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7084a(BacktraceExceptionHandler backtraceExceptionHandler, Thread thread, Throwable th2, BacktraceResult backtraceResult) {
        backtraceExceptionHandler.getClass();
        BacktraceLogger.m7080d(LOG_TAG, "Root handler event callback");
        backtraceExceptionHandler.rootHandler.uncaughtException(thread, th2);
        backtraceExceptionHandler.signal.countDown();
    }

    public static void enable(C7032a c7032a) {
        new BacktraceExceptionHandler(c7032a);
    }

    private OnServerResponseEventListener getCallbackToDefaultHandler(final Thread thread, final Throwable th2) {
        return new OnServerResponseEventListener() { // from class: backtraceio.library.models.a
            @Override // backtraceio.library.events.OnServerResponseEventListener
            public final void onEvent(BacktraceResult backtraceResult) {
                BacktraceExceptionHandler.m7084a(this.f5325a, thread, th2, backtraceResult);
            }
        };
    }

    public static void setCustomAttributes(Map<String, Object> map) {
        customAttributes.putAll(map);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        OnServerResponseEventListener callbackToDefaultHandler = getCallbackToDefaultHandler(thread, th2);
        String str = LOG_TAG;
        BacktraceLogger.m7082e(str, "Sending uncaught exception to Backtrace API", th2);
        this.client.m29725i(th2, customAttributes, callbackToDefaultHandler);
        BacktraceLogger.m7080d(str, "Uncaught exception sent to Backtrace API");
        try {
            BacktraceLogger.m7080d(str, "Default uncaught exception handler");
            this.signal.await();
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, "Exception during waiting for response", e10);
        }
    }
}
