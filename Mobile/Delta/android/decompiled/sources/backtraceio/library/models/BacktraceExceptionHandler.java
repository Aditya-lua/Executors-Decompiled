package backtraceio.library.models;

import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.logger.BacktraceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String LOG_TAG = "BacktraceExceptionHandler";
    private static final Map<String, Object> customAttributes = new HashMap<String, Object>() { // from class: backtraceio.library.models.BacktraceExceptionHandler.1
        {
            put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.UnhandledExceptionAttributeType);
        }
    };
    private final j6.a client;
    private final Thread.UncaughtExceptionHandler rootHandler;
    private final CountDownLatch signal = new CountDownLatch(1);

    private BacktraceExceptionHandler(j6.a aVar) {
        BacktraceLogger.d(LOG_TAG, "BacktraceExceptionHandler initialization");
        this.client = aVar;
        this.rootHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static /* synthetic */ void a(BacktraceExceptionHandler backtraceExceptionHandler, Thread thread, Throwable th2, BacktraceResult backtraceResult) {
        backtraceExceptionHandler.getClass();
        BacktraceLogger.d(LOG_TAG, "Root handler event callback");
        backtraceExceptionHandler.rootHandler.uncaughtException(thread, th2);
        backtraceExceptionHandler.signal.countDown();
    }

    public static void enable(j6.a aVar) {
        new BacktraceExceptionHandler(aVar);
    }

    private OnServerResponseEventListener getCallbackToDefaultHandler(final Thread thread, final Throwable th2) {
        return new OnServerResponseEventListener() { // from class: backtraceio.library.models.a
            @Override // backtraceio.library.events.OnServerResponseEventListener
            public final void onEvent(BacktraceResult backtraceResult) {
                BacktraceExceptionHandler.a(this.f4077a, thread, th2, backtraceResult);
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
        BacktraceLogger.e(str, "Sending uncaught exception to Backtrace API", th2);
        this.client.i(th2, customAttributes, callbackToDefaultHandler);
        BacktraceLogger.d(str, "Uncaught exception sent to Backtrace API");
        try {
            BacktraceLogger.d(str, "Default uncaught exception handler");
            this.signal.await();
        } catch (Exception e10) {
            BacktraceLogger.e(LOG_TAG, "Exception during waiting for response", e10);
        }
    }
}
