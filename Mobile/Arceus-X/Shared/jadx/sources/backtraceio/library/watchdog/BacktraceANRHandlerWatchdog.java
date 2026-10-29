package backtraceio.library.watchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import backtraceio.library.anr.BacktraceANRHandler;
import backtraceio.library.anr.BacktraceANRSettings;
import backtraceio.library.logger.BacktraceLogger;
import java.util.Calendar;
import p210j6.C7032a;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceANRHandlerWatchdog extends Thread implements BacktraceANRHandler {
    private static final String LOG_TAG = "BacktraceANRHandlerWatchdog";
    private final C7032a backtraceClient;
    private final boolean debug;
    private final Handler mainThreadHandler;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private volatile boolean shouldStop;
    private final int timeout;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceANRHandlerWatchdog(C7032a c7032a) {
        this(c7032a, BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.debug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
            BacktraceLogger.m7083w(LOG_TAG, "Detected a debugger connection. ANR Watchdog is disabled");
            return;
        }
        while (true) {
            boolean z10 = false;
            while (!this.shouldStop && !isInterrupted()) {
                String string = Calendar.getInstance().getTime().toString();
                String str = LOG_TAG;
                BacktraceLogger.m7080d(str, "ANR WATCHDOG - " + string);
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
                        BacktraceLogger.m7080d(str, "ANR is not detected");
                    } else if (!z10) {
                        BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, Looper.getMainLooper().getThread(), this.onApplicationNotRespondingEvent, str);
                        z10 = true;
                    }
                } catch (InterruptedException e10) {
                    BacktraceLogger.m7082e(LOG_TAG, "Thread is interrupted", e10);
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
            BacktraceLogger.m7080d(LOG_TAG, "ANR monitoring thread has already been interrupted.");
        } else {
            BacktraceLogger.m7080d(LOG_TAG, "Stop monitoring ANR");
            this.shouldStop = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceANRHandlerWatchdog(C7032a c7032a, int i10) {
        this(c7032a, i10, false);
    }

    public BacktraceANRHandlerWatchdog(C7032a c7032a, int i10, boolean z10) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.shouldStop = false;
        BacktraceLogger.m7080d(LOG_TAG, "Start monitoring ANR");
        this.backtraceClient = c7032a;
        this.timeout = i10;
        this.debug = z10;
        start();
    }
}
