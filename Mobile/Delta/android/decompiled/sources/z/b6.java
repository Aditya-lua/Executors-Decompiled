package z;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lz/b6;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "f", "()V", "c", "h", "", "e", "()I", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger mVideoUsage;

    public b6(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    public static final void d(b6 b6Var) {
        int iDecrementAndGet = b6Var.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            g0.r1.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        g0.r1.l("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    public static final void g(b6 b6Var) {
        g0.r1.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + b6Var.mVideoUsage.incrementAndGet());
    }

    public final void c() {
        this.executor.execute(new Runnable() { // from class: z.z5
            @Override // java.lang.Runnable
            public final void run() {
                b6.d(this.f37007a);
            }
        });
    }

    public final int e() {
        return this.mVideoUsage.get();
    }

    public final void f() {
        this.executor.execute(new Runnable() { // from class: z.a6
            @Override // java.lang.Runnable
            public final void run() {
                b6.g(this.f36440a);
            }
        });
    }

    public final void h() {
        this.mVideoUsage.set(0);
        g0.r1.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
