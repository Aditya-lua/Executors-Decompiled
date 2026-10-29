package backtraceio.library.watchdog;

import backtraceio.library.logger.BacktraceLogger;
import j6.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceWatchdog {
    private static final transient String LOG_TAG = "BacktraceWatchdog";
    private final a backtraceClient;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private final boolean sendException;
    private final Map<Thread, BacktraceThreadWatcher> threadsIdWatcher;

    public BacktraceWatchdog(a aVar, boolean z10) {
        this.threadsIdWatcher = new HashMap();
        this.sendException = z10;
        this.backtraceClient = aVar;
    }

    public void activateWatcher(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.setActive(true);
        }
    }

    public boolean checkIsAnyThreadIsBlocked() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = Long.toString(jCurrentTimeMillis);
        BacktraceLogger.d(LOG_TAG, "Checking watchdog. Timestamp: " + string);
        for (Map.Entry<Thread, BacktraceThreadWatcher> entry : this.threadsIdWatcher.entrySet()) {
            Thread key = entry.getKey();
            BacktraceThreadWatcher value = entry.getValue();
            if (key != null && value != null && key != Thread.currentThread() && key.isAlive() && value.isActive()) {
                if (value.getCounter() != value.getPrivateCounter()) {
                    value.setPrivateCounter(value.getCounter());
                    value.setLastTimestamp(jCurrentTimeMillis);
                } else {
                    String str = LOG_TAG;
                    BacktraceLogger.w(str, String.format("Thread %d %s  might be hung, timestamp: %s", Long.valueOf(key.getId()), key.getName(), string));
                    long lastTimestamp = value.getLastTimestamp();
                    if (jCurrentTimeMillis - lastTimestamp > (lastTimestamp == 0 ? value.getTimeout() : value.getTimeout() + value.getDelay())) {
                        if (!this.sendException) {
                            return true;
                        }
                        BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, key, this.onApplicationNotRespondingEvent, str);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void deactivateWatcher(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.setActive(false);
        }
    }

    public void registerThread(Thread thread, int i10, int i11) {
        this.threadsIdWatcher.put(thread, new BacktraceThreadWatcher(i10, i11));
    }

    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
    }

    public void tick(Thread thread) {
        BacktraceThreadWatcher backtraceThreadWatcher;
        if (this.threadsIdWatcher.containsKey(thread) && (backtraceThreadWatcher = this.threadsIdWatcher.get(thread)) != null) {
            backtraceThreadWatcher.tickCounter();
        }
    }

    public void unRegisterThread(Thread thread) {
        this.threadsIdWatcher.remove(thread);
    }

    public BacktraceWatchdog(a aVar) {
        this(aVar, true);
    }
}
