package p366q0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
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
import ne.InterfaceFutureC9440x;
import p088e.C4713k0;
import p397r0.C10773n;
import p563y1.C12997c;

/* JADX INFO: renamed from: q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC10419e extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<ScheduledExecutorService> f37533b = new a();

    /* JADX INFO: renamed from: a */
    public final Handler f37534a;

    /* JADX INFO: renamed from: q0.e$a */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C10417c.m40084e();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC10419e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: q0.e$b */
    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f37535a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Runnable runnable) {
            this.f37535a = runnable;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f37535a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: q0.e$c */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C12997c.a<V>> f37537a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b */
        public final long f37538b;

        /* JADX INFO: renamed from: c */
        public final Callable<V> f37539c;

        /* JADX INFO: renamed from: d */
        public final InterfaceFutureC9440x<V> f37540d;

        /* JADX INFO: renamed from: q0.e$c$a */
        public class a implements C12997c.c<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Handler f37541a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Callable f37542b;

            /* JADX INFO: renamed from: q0.e$c$a$a, reason: collision with other inner class name */
            public class RunnableC14232a implements Runnable {
                public RunnableC14232a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f37537a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f37541a.removeCallbacks(c.this);
                    }
                }
            }

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(Handler handler, Callable callable) {
                this.f37541a = handler;
                this.f37542b = callable;
            }

            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public Object mo22051a(C12997c.a<V> aVar) {
                aVar.m48312a(new RunnableC14232a(), C10417c.m40081b());
                c.this.f37537a.set(aVar);
                return "HandlerScheduledFuture-" + this.f37542b.toString();
            }
        }

        public c(Handler handler, long j10, Callable<V> callable) {
            this.f37538b = j10;
            this.f37539c = callable;
            this.f37540d = C12997c.m48311a(new a(handler, callable));
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f37540d.cancel(z10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.concurrent.Future
        public V get() {
            return this.f37540d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f37538b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f37540d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f37540d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            C12997c.a andSet = this.f37537a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m48314c(this.f37539c.call());
                } catch (Exception e10) {
                    andSet.m48317f(e10);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return this.f37540d.get(j10, timeUnit);
        }
    }

    public ScheduledExecutorServiceC10419e(Handler handler) {
        this.f37534a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC10419e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    /* JADX INFO: renamed from: b */
    public final RejectedExecutionException m40088b() {
        return new RejectedExecutionException(this.f37534a + " is shutting down");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C4713k0.m23004a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f37534a.post(runnable)) {
            throw m40088b();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC10419e.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC10419e.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC10419e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC10419e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        c cVar = new c(this.f37534a, jUptimeMillis, callable);
        return this.f37534a.postAtTime(cVar, jUptimeMillis) ? cVar : C10773n.m40992o(m40088b());
    }
}
