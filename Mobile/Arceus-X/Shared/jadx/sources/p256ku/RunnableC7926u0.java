package p256ku;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.u0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0005R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0014\u00100\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0014\u00102\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\"¨\u00063"}, m31665d2 = {"Lku/u0;", "Lku/n1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "H0", "(Ljava/lang/Runnable;)V", "", "now", "Lku/n1$c;", "delayedTask", "z0", "(JLku/n1$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "run", "", "toString", "()Ljava/lang/String;", "h1", "Ljava/lang/Thread;", "a1", "()Ljava/lang/Thread;", "", "g1", "()Z", "Z0", "j", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "y0", "thread", "c1", "isShutDown", "d1", "isShutdownRequested", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class RunnableC7926u0 extends AbstractC7899n1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final RunnableC7926u0 f29805i;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    static {
        Long l10;
        RunnableC7926u0 runnableC7926u0 = new RunnableC7926u0();
        f29805i = runnableC7926u0;
        AbstractC7894m1.m32797f0(runnableC7926u0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    @Override // p256ku.AbstractC7899n1
    /* JADX INFO: renamed from: H0 */
    public void mo32829H0(@NotNull Runnable task) {
        if (m32916c1()) {
            m32919h1();
        }
        super.mo32829H0(task);
    }

    /* JADX INFO: renamed from: Z0 */
    public final synchronized void m32914Z0() {
        if (m32917d1()) {
            debugStatus = 3;
            m32834S0();
            Intrinsics.m31981d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final synchronized Thread m32915a1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f29805i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m32916c1() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m32917d1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    @Override // p256ku.AbstractC7899n1, p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return m32837W0(timeMillis, block);
    }

    /* JADX INFO: renamed from: g1 */
    public final synchronized boolean m32918g1() {
        if (m32917d1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.m31981d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m32919h1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM32832Q0;
        C7846c3.f29696a.m32589d(this);
        C7842c.m32577a();
        try {
            if (!m32918g1()) {
                if (zM32832Q0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo32805r0 = mo32805r0();
                if (jMo32805r0 == Long.MAX_VALUE) {
                    C7842c.m32577a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zM32832Q0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo32805r0 = C7764d.m32082g(jMo32805r0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jMo32805r0 > 0) {
                    if (m32917d1()) {
                        if (zM32832Q0) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        C7842c.m32577a();
                        LockSupport.parkNanos(this, jMo32805r0);
                    }
                }
            }
        } finally {
            _thread = null;
            m32914Z0();
            C7842c.m32577a();
            if (!m32832Q0()) {
                getThread();
            }
        }
    }

    @Override // p256ku.AbstractC7899n1, p256ku.AbstractC7894m1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    @Override // p256ku.AbstractC7903o1
    @NotNull
    /* JADX INFO: renamed from: y0 */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? m32915a1() : thread;
    }

    @Override // p256ku.AbstractC7903o1
    /* JADX INFO: renamed from: z0 */
    public void mo32850z0(long now, @NotNull AbstractC7899n1.c delayedTask) {
        m32919h1();
    }
}
