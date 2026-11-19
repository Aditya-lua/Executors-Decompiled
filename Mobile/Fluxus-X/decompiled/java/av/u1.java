package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lav/u1;", "Lav/t1;", "Lav/y0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", BuildConfig.FLAVOR, "I", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", BuildConfig.FLAVOR, "timeMillis", "Lav/n;", "continuation", "A", "(JLav/n;)V", "Lav/i1;", "g", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;", "close", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "c0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "b0", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "d", "Ljava/util/concurrent/Executor;", "Y", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 extends t1 implements y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor executor;

    public u1(@NotNull Executor executor) {
        this.executor = executor;
        gv.a.a(getExecutor());
    }

    @Override // av.y0
    public void A(long timeMillis, @NotNull n<? super Unit> continuation) {
        long j10;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureC0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            scheduledFutureC0 = c0(scheduledExecutorService, new v2(this, continuation), continuation.getContext(), j10);
        } else {
            j10 = timeMillis;
        }
        if (scheduledFutureC0 != null) {
            r.c(continuation, new l(scheduledFutureC0));
        } else {
            u0.f3485i.A(j10, continuation);
        }
    }

    @Override // av.l0
    public void I(@NotNull CoroutineContext context, @NotNull Runnable block) {
        try {
            Executor executor = getExecutor();
            c.a();
            executor.execute(block);
        } catch (RejectedExecutionException e10) {
            c.a();
            b0(context, e10);
            g1.b().I(context, block);
        }
    }

    @Override // av.t1
    @NotNull
    /* JADX INFO: renamed from: Y, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    public final void b0(CoroutineContext context, RejectedExecutionException exception) {
        g2.c(context, r1.a("The task was rejected", exception));
    }

    public final ScheduledFuture<?> c0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            b0(coroutineContext, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof u1) && ((u1) other).getExecutor() == getExecutor();
    }

    @Override // av.y0
    @NotNull
    public i1 g(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        long j10;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureC0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureC0 = c0(scheduledExecutorService, runnable, coroutineContext, j10);
        } else {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        return scheduledFutureC0 != null ? new h1(scheduledFutureC0) : u0.f3485i.g(j10, runnable, coroutineContext);
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // av.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }
}
