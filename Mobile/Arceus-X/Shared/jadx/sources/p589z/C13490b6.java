package p589z;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.C5931r1;

/* JADX INFO: renamed from: z.b6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lz/b6;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "f", "()V", "c", "h", "", "e", "()I", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C13490b6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger mVideoUsage;

    public C13490b6(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m49175d(C13490b6 c13490b6) {
        int iDecrementAndGet = c13490b6.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            C5931r1.m26561a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
            return;
        }
        C5931r1.m26572l("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: renamed from: g */
    public static final void m49176g(C13490b6 c13490b6) {
        C5931r1.m26561a("VideoUsageControl", "incrementUsage: mVideoUsage = " + c13490b6.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: renamed from: c */
    public final void m49177c() {
        this.executor.execute(new Runnable() { // from class: z.z5
            @Override // java.lang.Runnable
            public final void run() {
                C13490b6.m49175d(this.f47925a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final int m49178e() {
        return this.mVideoUsage.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m49179f() {
        this.executor.execute(new Runnable() { // from class: z.a6
            @Override // java.lang.Runnable
            public final void run() {
                C13490b6.m49176g(this.f47209a);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m49180h() {
        this.mVideoUsage.set(0);
        C5931r1.m26561a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
