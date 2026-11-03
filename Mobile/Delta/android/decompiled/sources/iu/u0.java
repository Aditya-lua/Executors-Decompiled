package iu;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0005R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u0005R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0014\u0010/\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0014\u00101\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"¨\u00062"}, d2 = {"Liu/u0;", "Liu/n1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "D0", "(Ljava/lang/Runnable;)V", "", "now", "Liu/n1$c;", "delayedTask", "v0", "(JLiu/n1$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Liu/i1;", "j", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Liu/i1;", "run", "", "toString", "()Ljava/lang/String;", "d1", "Ljava/lang/Thread;", "W0", "()Ljava/lang/Thread;", "", "c1", "()Z", "V0", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "u0", "thread", "Y0", "isShutDown", "b1", "isShutdownRequested", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends n1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final u0 f21428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    static {
        Long l10;
        u0 u0Var = new u0();
        f21428i = u0Var;
        m1.d0(u0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    @Override // iu.n1
    public void D0(@NotNull Runnable task) {
        if (Y0()) {
            d1();
        }
        super.D0(task);
    }

    public final synchronized void V0() {
        if (b1()) {
            debugStatus = 3;
            O0();
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread W0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f21428i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean Y0() {
        return debugStatus == 4;
    }

    public final boolean b1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean c1() {
        if (b1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void d1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // iu.n1, iu.y0
    @NotNull
    public i1 j(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return S0(timeMillis, block);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM0;
        c3.f21336a.d(this);
        c.a();
        try {
            if (!c1()) {
                if (zM0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jN0 = n0();
                if (jN0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zM0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jN0 = kotlin.ranges.d.g(jN0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jN0 > 0) {
                    if (b1()) {
                        if (zM0) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        c.a();
                        LockSupport.parkNanos(this, jN0);
                    }
                }
            }
        } finally {
            _thread = null;
            V0();
            c.a();
            if (!M0()) {
                getThread();
            }
        }
    }

    @Override // iu.n1, iu.m1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // iu.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    @Override // iu.o1
    @NotNull
    /* JADX INFO: renamed from: u0 */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? W0() : thread;
    }

    @Override // iu.o1
    public void v0(long now, @NotNull n1.c delayedTask) {
        d1();
    }
}
