package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.p336ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m31665d2 = {"Lokhttp3/internal/connection/AddressPolicy;", "", "minimumConcurrentCalls", "", "backoffDelayMillis", "", "backoffJitterMillis", "<init>", "(IJI)V", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class AddressPolicy {
    public final long backoffDelayMillis;
    public final int backoffJitterMillis;
    public final int minimumConcurrentCalls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AddressPolicy() {
        this(0, 0L, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AddressPolicy(int i10, long j10, int i11) {
        this.minimumConcurrentCalls = i10;
        this.backoffDelayMillis = j10;
        this.backoffJitterMillis = i11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
      (wrap long:?: TERNARY null = ((wrap int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap long:0x0009: SGET  A[WRAPPED] okhttp3.internal.ws.RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS long) : (r2v0 long))
      (wrap int:?: TERNARY null = ((wrap int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r4v0 int))
     A[MD:(int, long, int):void (m)] (LINE:6) call: okhttp3.internal.connection.AddressPolicy.<init>(int, long, int):void type: THIS */
    public /* synthetic */ AddressPolicy(int i10, long j10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : j10, (i12 & 4) != 0 ? 100 : i11);
    }
}
