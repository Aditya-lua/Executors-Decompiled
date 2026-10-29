package okhttp3.internal.http2.flowcontrol;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0015"}, m31665d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "", "streamId", "", "<init>", "(I)V", "getStreamId", "()I", "value", "", "total", "getTotal", "()J", "acknowledged", "getAcknowledged", "unacknowledged", "getUnacknowledged", "update", "", "toString", "", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class WindowCounter {
    private long acknowledged;
    private final int streamId;
    private long total;

    public WindowCounter(int i10) {
        this.streamId = i10;
    }

    public static /* synthetic */ void update$default(WindowCounter windowCounter, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        windowCounter.update(j10, j11);
    }

    public final long getAcknowledged() {
        return this.acknowledged;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final synchronized long getUnacknowledged() {
        return this.total - this.acknowledged;
    }

    @NotNull
    public String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + getUnacknowledged() + ')';
    }

    public final synchronized void update(long total, long acknowledged) {
        try {
            if (total < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (acknowledged < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j10 = this.total + total;
            this.total = j10;
            long j11 = this.acknowledged + acknowledged;
            this.acknowledged = j11;
            if (j11 > j10) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
