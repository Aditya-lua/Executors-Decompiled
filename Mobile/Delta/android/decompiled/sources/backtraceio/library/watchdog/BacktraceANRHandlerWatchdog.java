package backtraceio.library.watchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import backtraceio.library.anr.BacktraceANRHandler;
import backtraceio.library.anr.BacktraceANRSettings;
import backtraceio.library.logger.BacktraceLogger;
import j6.a;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceANRHandlerWatchdog extends Thread implements BacktraceANRHandler {
    private static final String LOG_TAG = "BacktraceANRHandlerWatchdog";
    private final a backtraceClient;
    private final boolean debug;
    private final Handler mainThreadHandler;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private volatile boolean shouldStop;
    private final int timeout;

    public BacktraceANRHandlerWatchdog(a aVar) {
        this(aVar, BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.debug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
            BacktraceLogger.w(LOG_TAG, "Detected a debugger connection. ANR Watchdog is disabled");
            return;
        }
        while (true) {
            boolean z10 = false;
            while (!this.shouldStop && !isInterrupted()) {
                String string = Calendar.getInstance().getTime().toString();
                String str = LOG_TAG;
                BacktraceLogger.d(str, "ANR WATCHDOG - " + string);
                final BacktraceThreadWatcher backtraceThreadWatcher = new BacktraceThreadWatcher(0, 0);
                this.mainThreadHandler.post(new Runnable() { // from class: backtraceio.library.watchdog.BacktraceANRHandlerWatchdog.1
                    @Override // java.lang.Runnable
                    public void run() {
                        backtraceThreadWatcher.tickCounter();
                    }
                });
                try {
                    Thread.sleep(this.timeout);
                    backtraceThreadWatcher.tickPrivateCounter();
                    if (backtraceThreadWatcher.getCounter() == backtraceThreadWatcher.getPrivateCounter()) {
                        BacktraceLogger.d(str, "ANR is not detected");
                    } else if (!z10) {
                        BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, Looper.getMainLooper().getThread(), this.onApplicationNotRespondingEvent, str);
                        z10 = true;
                    }
                } catch (InterruptedException e10) {
                    BacktraceLogger.e(LOG_TAG, "Thread is interrupted", e10);
                    return;
                }
            }
            return;
        }
    }

    @Override // backtraceio.library.anr.BacktraceANRHandler
    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
    }

    @Override // backtraceio.library.anr.BacktraceANRHandler
    public void stopMonitoringAnr() {
        if (isInterrupted()) {
            BacktraceLogger.d(LOG_TAG, "ANR monitoring thread has already been interrupted.");
        } else {
            BacktraceLogger.d(LOG_TAG, "Stop monitoring ANR");
            this.shouldStop = true;
        }
    }

    public BacktraceANRHandlerWatchdog(a aVar, int i10) {
        this(aVar, i10, false);
    }

    public BacktraceANRHandlerWatchdog(a aVar, int i10, boolean z10) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.shouldStop = false;
        BacktraceLogger.d(LOG_TAG, "Start monitoring ANR");
        this.backtraceClient = aVar;
        this.timeout = i10;
        this.debug = z10;
        start();
    }
}
