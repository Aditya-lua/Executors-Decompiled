package q0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e.k0;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ne.x;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public static ThreadLocal<ScheduledExecutorService> b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f29514a;

    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return q0.c.e();
            }
            if (Looper.myLooper() != null) {
                return new e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f29515a;

        public b(Runnable runnable) {
            this.f29515a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f29515a.run();
            return null;
        }
    }

    public static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<y1.c.a<V>> f29516a = new AtomicReference<>(null);
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<V> f29517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x<V> f29518d;

        public class a implements y1.c.InterfaceC0665c<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f29519a;
            public final /* synthetic */ Callable b;

            /* JADX INFO: renamed from: q0.e$c$a$a, reason: collision with other inner class name */
            public class RunnableC0509a implements Runnable {
                public RunnableC0509a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f29516a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f29519a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f29519a = handler;
                this.b = callable;
            }

            @Override // y1.c.InterfaceC0665c
            public Object a(y1.c.a<V> aVar) {
                aVar.a(new RunnableC0509a(), q0.c.b());
                c.this.f29516a.set(aVar);
                return "HandlerScheduledFuture-" + this.b.toString();
            }
        }

        public c(Handler handler, long j10, Callable<V> callable) {
            this.b = j10;
            this.f29517c = callable;
            this.f29518d = y1.c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f29518d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f29518d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f29518d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f29518d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            y1.c.a andSet = this.f29516a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f29517c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return this.f29518d.get(j10, timeUnit);
        }
    }

    public e(Handler handler) {
        this.f29514a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final RejectedExecutionException b() {
        return new RejectedExecutionException(this.f29514a + " is shutting down");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f29514a.post(runnable)) {
            throw b();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        c cVar = new c(this.f29514a, jUptimeMillis, callable);
        return this.f29514a.postAtTime(cVar, jUptimeMillis) ? cVar : n.o(b());
    }
}
