package su;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p256ku.AbstractC7923t1;

/* JADX INFO: renamed from: su.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\f\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m31665d2 = {"Lsu/f;", "Lku/t1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "Z", "(Ljava/lang/Runnable;ZZ)V", "Lsu/a;", "Y", "()Lsu/a;", "d", "I", "e", "f", "J", "g", "Ljava/lang/String;", "h", "Lsu/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "X", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C11457f extends AbstractC7923t1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public ExecutorC11452a coroutineScheduler = m42915Y();

    public C11457f(int i10, int i11, long j10, @NotNull String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        ExecutorC11452a.m42873j(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // p256ku.AbstractC7923t1
    @NotNull
    /* JADX INFO: renamed from: X */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    /* JADX INFO: renamed from: Y */
    public final ExecutorC11452a m42915Y() {
        return new ExecutorC11452a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    /* JADX INFO: renamed from: Z */
    public final void m42916Z(@NotNull Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.m42884g(block, context, fair);
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        ExecutorC11452a.m42873j(this.coroutineScheduler, block, false, false, 6, null);
    }
}
