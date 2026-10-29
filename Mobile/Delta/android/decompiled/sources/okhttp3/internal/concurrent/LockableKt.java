package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a6\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"wait", "", "Lokhttp3/internal/concurrent/Lockable;", "notify", "notifyAll", "awaitNanos", "nanos", "", "assertLockNotHeld", "assertLockHeld", "withLock", "T", "action", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Lockable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LockableKt {
    public static final void assertLockHeld(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(lockable)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lockable);
    }

    public static final void assertLockNotHeld(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(lockable)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + lockable);
        }
    }

    public static final void awaitNanos(@NotNull Lockable lockable, long j10) throws InterruptedException {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        long j11 = j10 / 1000000;
        long j12 = j10 - (1000000 * j11);
        if (j11 > 0 || j10 > 0) {
            lockable.wait(j11, (int) j12);
        }
    }

    public static final void notify(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        lockable.notify();
    }

    public static final void notifyAll(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        lockable.notifyAll();
    }

    public static final void wait(@NotNull Lockable lockable) throws InterruptedException {
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        lockable.wait();
    }

    public static final <T> T withLock(@NotNull Lockable lockable, @NotNull Function0<? extends T> action) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lockable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lockable) {
            try {
                tInvoke = action.invoke();
                l.b(1);
            } finally {
                l.b(1);
                l.a(1);
            }
        }
        return tInvoke;
    }
}
