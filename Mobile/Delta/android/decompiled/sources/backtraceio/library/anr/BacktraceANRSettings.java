package backtraceio.library.anr;

import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceANRSettings {
    public static final int DEFAULT_ANR_TIMEOUT = 5000;
    private final boolean debug;
    private final OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private final int timeout;

    public BacktraceANRSettings() {
        this(DEFAULT_ANR_TIMEOUT, null, false);
    }

    public OnApplicationNotRespondingEvent getOnApplicationNotRespondingEvent() {
        return this.onApplicationNotRespondingEvent;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public BacktraceANRSettings(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, boolean z10) {
        this.timeout = i10;
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
        this.debug = z10;
    }
}
