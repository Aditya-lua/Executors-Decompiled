package p397r0;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p533x2.C12637g;

/* JADX INFO: renamed from: r0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10774o<V> implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: r0.o$a */
    public static class a<V> extends AbstractC10774o<V> {

        /* JADX INFO: renamed from: a */
        public final Throwable f38376a;

        public a(Throwable th2) {
            this.f38376a = th2;
        }

        @Override // p397r0.AbstractC10774o, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f38376a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f38376a + "]]";
        }
    }

    /* JADX INFO: renamed from: r0.o$b */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th2) {
            super(th2);
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: r0.o$c */
    public static final class c<V> extends AbstractC10774o<V> {

        /* JADX INFO: renamed from: b */
        public static final AbstractC10774o<Object> f38377b = new c(null);

        /* JADX INFO: renamed from: a */
        public final V f38378a;

        public c(V v5) {
            this.f38378a = v5;
        }

        @Override // p397r0.AbstractC10774o, java.util.concurrent.Future
        public V get() {
            return this.f38378a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f38378a + "]]";
        }
    }

    /* JADX INFO: renamed from: c */
    public static <V> InterfaceFutureC9440x<V> m41004c() {
        return c.f38377b;
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        C12637g.m47075g(runnable);
        C12637g.m47075g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            C5931r1.m26564d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        C12637g.m47075g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
