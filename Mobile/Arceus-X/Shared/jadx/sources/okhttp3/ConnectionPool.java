package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.RealConnectionPool;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B;\b\u0010\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0010B1\b\u0010\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0013J\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m31665d2 = {"Lokhttp3/ConnectionPool;", "", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionListener", "Lokhttp3/internal/connection/ConnectionListener;", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/ConnectionListener;)V", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "idleConnectionCount", "connectionCount", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "evictAll", "", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ConnectionPool {

    @NotNull
    private final RealConnectionPool delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConnectionPool(@NotNull RealConnectionPool delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    @NotNull
    public final ConnectionListener getConnectionListener$okhttp() {
        return this.delegate.getConnectionListener();
    }

    @NotNull
    /* JADX INFO: renamed from: getDelegate$okhttp, reason: from getter */
    public final RealConnectionPool getDelegate() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r1v0 int))
      (wrap long:?: TERNARY null = ((wrap int:0x0005: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (5 long) : (r2v0 long))
      (wrap java.util.concurrent.TimeUnit:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.concurrent.TimeUnit:0x000f: SGET  A[WRAPPED] (LINE:3) java.util.concurrent.TimeUnit.MINUTES java.util.concurrent.TimeUnit) : (r4v0 java.util.concurrent.TimeUnit))
      (wrap okhttp3.internal.concurrent.TaskRunner:?: TERNARY null = ((wrap int:0x0011: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.internal.concurrent.TaskRunner:0x0015: SGET  A[WRAPPED] (LINE:4) okhttp3.internal.concurrent.TaskRunner.INSTANCE okhttp3.internal.concurrent.TaskRunner) : (r5v0 okhttp3.internal.concurrent.TaskRunner))
      (wrap okhttp3.internal.connection.ConnectionListener:?: TERNARY null = ((wrap int:0x0017: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.internal.connection.ConnectionListener:0x001d: INVOKE 
      (wrap okhttp3.internal.connection.ConnectionListener$Companion:0x001b: SGET  A[WRAPPED] (LINE:5) okhttp3.internal.connection.ConnectionListener.Companion okhttp3.internal.connection.ConnectionListener$Companion)
     VIRTUAL call: okhttp3.internal.connection.ConnectionListener.Companion.getNONE():okhttp3.internal.connection.ConnectionListener A[MD:():okhttp3.internal.connection.ConnectionListener (m), WRAPPED] (LINE:5)) : (r6v0 okhttp3.internal.connection.ConnectionListener))
     A[MD:(int, long, java.util.concurrent.TimeUnit, okhttp3.internal.concurrent.TaskRunner, okhttp3.internal.connection.ConnectionListener):void (m)] (LINE:6) call: okhttp3.ConnectionPool.<init>(int, long, java.util.concurrent.TimeUnit, okhttp3.internal.concurrent.TaskRunner, okhttp3.internal.connection.ConnectionListener):void type: THIS */
    public /* synthetic */ ConnectionPool(int i10, long j10, TimeUnit timeUnit, TaskRunner taskRunner, ConnectionListener connectionListener, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 5 : i10, (i11 & 2) != 0 ? 5L : j10, (i11 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i11 & 8) != 0 ? TaskRunner.INSTANCE : taskRunner, (i11 & 16) != 0 ? ConnectionListener.INSTANCE.getNONE() : connectionListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i10, long j10, @NotNull TimeUnit timeUnit, @NotNull TaskRunner taskRunner, @NotNull ConnectionListener connectionListener) {
        this(new RealConnectionPool(taskRunner, i10, j10, timeUnit, connectionListener));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r1v0 int))
      (wrap long:?: TERNARY null = ((wrap int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (5 long) : (r2v0 long))
      (wrap java.util.concurrent.TimeUnit:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.concurrent.TimeUnit:0x000f: SGET  A[WRAPPED] (LINE:9) java.util.concurrent.TimeUnit.MINUTES java.util.concurrent.TimeUnit) : (r4v0 java.util.concurrent.TimeUnit))
      (wrap okhttp3.internal.connection.ConnectionListener:?: TERNARY null = ((wrap int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.internal.connection.ConnectionListener:0x0017: INVOKE 
      (wrap okhttp3.internal.connection.ConnectionListener$Companion:0x0015: SGET  A[WRAPPED] (LINE:10) okhttp3.internal.connection.ConnectionListener.Companion okhttp3.internal.connection.ConnectionListener$Companion)
     VIRTUAL call: okhttp3.internal.connection.ConnectionListener.Companion.getNONE():okhttp3.internal.connection.ConnectionListener A[MD:():okhttp3.internal.connection.ConnectionListener (m), WRAPPED] (LINE:10)) : (r5v0 okhttp3.internal.connection.ConnectionListener))
     A[MD:(int, long, java.util.concurrent.TimeUnit, okhttp3.internal.connection.ConnectionListener):void (m)] (LINE:11) call: okhttp3.ConnectionPool.<init>(int, long, java.util.concurrent.TimeUnit, okhttp3.internal.connection.ConnectionListener):void type: THIS */
    public /* synthetic */ ConnectionPool(int i10, long j10, TimeUnit timeUnit, ConnectionListener connectionListener, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 5 : i10, (i11 & 2) != 0 ? 5L : j10, (i11 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i11 & 8) != 0 ? ConnectionListener.INSTANCE.getNONE() : connectionListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i10, long j10, @NotNull TimeUnit timeUnit, @NotNull ConnectionListener connectionListener) {
        this(i10, j10, timeUnit, TaskRunner.INSTANCE, connectionListener);
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i10, long j10, @NotNull TimeUnit timeUnit) {
        this(i10, j10, timeUnit, TaskRunner.INSTANCE, ConnectionListener.INSTANCE.getNONE());
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
