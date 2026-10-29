package r0;

import g0.r1;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class o<V> implements x<V> {

    public static class a<V> extends o<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f29722a;

        public a(Throwable th2) {
            this.f29722a = th2;
        }

        @Override // r0.o, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f29722a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f29722a + "]]";
        }
    }

    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th2) {
            super(th2);
        }

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

    public static final class c<V> extends o<V> {
        public static final o<Object> b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V f29723a;

        public c(V v5) {
            this.f29723a = v5;
        }

        @Override // r0.o, java.util.concurrent.Future
        public V get() {
            return this.f29723a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f29723a + "]]";
        }
    }

    public static <V> x<V> c() {
        return c.b;
    }

    @Override // me.x
    public void a(Runnable runnable, Executor executor) {
        x2.g.g(runnable);
        x2.g.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            r1.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        x2.g.g(timeUnit);
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
