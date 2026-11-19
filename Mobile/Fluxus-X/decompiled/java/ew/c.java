package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R$\u0010 \u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lew/c;", "Lew/m0;", "<init>", "()V", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "t", "()Z", BuildConfig.FLAVOR, "now", "w", "(J)J", "x", "(J)V", "z", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "v", BuildConfig.FLAVOR, "f", "I", "state", "g", "index", "value", "h", "J", "u", "()J", "timeoutAt", "i", "b", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c extends m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d0 f14769j = new d0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static c f14770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f14771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Condition f14772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f14773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f14774o;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int index = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long timeoutAt;

    /* JADX INFO: renamed from: ew.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006)"}, d2 = {"Lew/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/c;", "b", "()Lew/c;", "node", BuildConfig.FLAVOR, "g", "(Lew/c;)V", "Lew/d0;", "queue", "Lew/d0;", "f", "()Lew/d0;", "idleSentinel", "Lew/c;", "d", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "c", "()Ljava/util/concurrent/locks/Condition;", BuildConfig.FLAVOR, "TIMEOUT_WRITE_SIZE", "I", BuildConfig.FLAVOR, "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final c b() throws InterruptedException {
            c cVarB = f().b();
            if (cVarB == null) {
                long jNanoTime = System.nanoTime();
                c().await(c.f14773n, TimeUnit.MILLISECONDS);
                if (f().b() != null || System.nanoTime() - jNanoTime < c.f14774o) {
                    return null;
                }
                return d();
            }
            long jW = cVarB.w(System.nanoTime());
            if (jW > 0) {
                c().await(jW, TimeUnit.NANOSECONDS);
                return null;
            }
            f().e(cVarB);
            cVarB.state = 2;
            return cVarB;
        }

        @NotNull
        public final Condition c() {
            return c.f14772m;
        }

        @Nullable
        public final c d() {
            return c.f14770k;
        }

        @NotNull
        public final ReentrantLock e() {
            return c.f14771l;
        }

        @NotNull
        public final d0 f() {
            return c.f14769j;
        }

        public final void g(c node) {
            if (d() == null) {
                h(new c());
                new b().start();
            }
            c.y(node, 0L, 1, null);
            f().a(node);
            if (node.index == 1) {
                c().signal();
            }
        }

        public final void h(@Nullable c cVar) {
            c.f14770k = cVar;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lew/c$b;", "Ljava/lang/Thread;", "<init>", "()V", BuildConfig.FLAVOR, "run", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = c.INSTANCE.e();
                    reentrantLockE.lock();
                    try {
                        c cVarB = c.INSTANCE.b();
                        if (cVarB == c.INSTANCE.d()) {
                            c.INSTANCE.h(null);
                            reentrantLockE.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f21506a;
                            reentrantLockE.unlock();
                            if (cVarB != null) {
                                cVarB.z();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockE.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f14771l = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f14772m = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f14773n = millis;
        f14774o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void y(c cVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i10 & 1) != 0) {
            j10 = System.nanoTime();
        }
        cVar.x(j10);
    }

    @NotNull
    public final IOException p(@Nullable IOException cause) {
        return v(cause);
    }

    public final void s() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = f14771l;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                INSTANCE.g(this);
                Unit unit = Unit.f21506a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = f14771l;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f14769j.e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getTimeoutAt() {
        return this.timeoutAt;
    }

    @NotNull
    public IOException v(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final long w(long now) {
        return this.timeoutAt - now;
    }

    public final void x(long now) {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (getTimeoutNanos() != 0 && getHasDeadline()) {
            this.timeoutAt = now + Math.min(timeoutNanos, c() - now);
        } else if (timeoutNanos != 0) {
            this.timeoutAt = now + timeoutNanos;
        } else {
            if (!hasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = c();
        }
    }

    public void z() {
    }
}
