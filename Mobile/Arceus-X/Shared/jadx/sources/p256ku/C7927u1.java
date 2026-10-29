package p256ku;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10710a;

/* JADX INFO: renamed from: ku.u1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m31665d2 = {"Lku/u1;", "Lku/t1;", "Lku/y0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "Z", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Y", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "d", "Ljava/util/concurrent/Executor;", "X", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7927u1 extends AbstractC7923t1 implements InterfaceC7942y0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    public C7927u1(@NotNull Executor executor) {
        this.executor = executor;
        C10710a.m40810a(getExecutor());
    }

    @Override // p256ku.AbstractC7923t1
    @NotNull
    /* JADX INFO: renamed from: X, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: Y */
    public final void m32920Y(CoroutineContext context, RejectedExecutionException exception) {
        C7865g2.m32649c(context, C7915r1.m32905a("The task was rejected", exception));
    }

    /* JADX INFO: renamed from: Z */
    public final ScheduledFuture<?> m32921Z(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            m32920Y(coroutineContext, e10);
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
        return (other instanceof C7927u1) && ((C7927u1) other).getExecutor() == getExecutor();
    }

    @Override // p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        long j10;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM32921Z = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureM32921Z = m32921Z(scheduledExecutorService, runnable, coroutineContext, j10);
        } else {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        return scheduledFutureM32921Z != null ? new C7869h1(scheduledFutureM32921Z) : RunnableC7926u0.f29805i.mo32840f(j10, runnable, coroutineContext);
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // p256ku.InterfaceC7942y0
    /* JADX INFO: renamed from: o */
    public void mo32841o(long timeMillis, @NotNull InterfaceC7897n<? super Unit> continuation) {
        long j10;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM32921Z = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            scheduledFutureM32921Z = m32921Z(scheduledExecutorService, new RunnableC7932v2(this, continuation), continuation.getContext(), j10);
        } else {
            j10 = timeMillis;
        }
        if (scheduledFutureM32921Z != null) {
            C7913r.m32901c(continuation, new C7887l(scheduledFutureM32921Z));
        } else {
            RunnableC7926u0.f29805i.mo32841o(j10, continuation);
        }
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        try {
            Executor executor = getExecutor();
            C7842c.m32577a();
            executor.execute(block);
        } catch (RejectedExecutionException e10) {
            C7842c.m32577a();
            m32920Y(context, e10);
            C7864g1.m32644b().mo6246w(context, block);
        }
    }
}
