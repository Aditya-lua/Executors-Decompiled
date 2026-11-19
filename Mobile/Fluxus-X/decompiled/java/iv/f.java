package iv;

import av.t1;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\f\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Liv/f;", "Lav/t1;", BuildConfig.FLAVOR, "corePoolSize", "maxPoolSize", BuildConfig.FLAVOR, "idleWorkerKeepAliveNs", BuildConfig.FLAVOR, "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", BuildConfig.FLAVOR, "I", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "L", BuildConfig.FLAVOR, "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "c0", "(Ljava/lang/Runnable;ZZ)V", "Liv/a;", "b0", "()Liv/a;", "d", "e", "f", "J", "g", "Ljava/lang/String;", "h", "Liv/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "Y", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public a coroutineScheduler = b0();

    public f(int i10, int i11, long j10, @NotNull String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
    }

    @Override // av.l0
    public void I(@NotNull CoroutineContext context, @NotNull Runnable block) {
        a.h(this.coroutineScheduler, block, false, false, 6, null);
    }

    @Override // av.l0
    public void L(@NotNull CoroutineContext context, @NotNull Runnable block) {
        a.h(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // av.t1
    @NotNull
    /* JADX INFO: renamed from: Y */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final a b0() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    public final void c0(@NotNull Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.g(block, context, fair);
    }
}
