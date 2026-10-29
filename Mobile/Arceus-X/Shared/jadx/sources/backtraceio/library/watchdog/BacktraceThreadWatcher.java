package backtraceio.library.watchdog;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceThreadWatcher {
    private boolean active;
    private int counter;
    private final int delay;
    private long lastTimestamp;
    private int privateCounter;
    private final int timeout;

    public BacktraceThreadWatcher(int i10, int i11) {
        this.timeout = i10;
        this.delay = i11;
        setActive(true);
    }

    public synchronized int getCounter() {
        return this.counter;
    }

    public int getDelay() {
        return this.delay;
    }

    public long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public int getPrivateCounter() {
        return this.privateCounter;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public synchronized boolean isActive() {
        return this.active;
    }

    public synchronized void setActive(boolean z10) {
        this.active = z10;
    }

    public void setLastTimestamp(long j10) {
        this.lastTimestamp = j10;
    }

    public void setPrivateCounter(int i10) {
        this.privateCounter = i10;
    }

    public synchronized void tickCounter() {
        this.counter++;
    }

    public void tickPrivateCounter() {
        this.privateCounter++;
    }
}
