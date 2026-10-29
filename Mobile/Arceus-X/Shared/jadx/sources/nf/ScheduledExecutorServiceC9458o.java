package nf;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p088e.C4713k0;

/* JADX INFO: renamed from: nf.o */
/* JADX INFO: loaded from: classes2.dex */
public class ScheduledExecutorServiceC9458o implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f34017a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f34018b;

    public ScheduledExecutorServiceC9458o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f34017a = executorService;
        this.f34018b = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37282e(Callable callable, ScheduledFutureC9459p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.mo37295a(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m37283f(Runnable runnable, ScheduledFutureC9459p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo37295a(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m37286l(Runnable runnable, ScheduledFutureC9459p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo37295a(e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m37288n(Runnable runnable, ScheduledFutureC9459p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.mo37295a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f34017a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C4713k0.m23004a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f34017a.execute(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f34017a.invokeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f34017a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f34017a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f34017a.isTerminated();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC9459p(new ScheduledFutureC9459p.c() { // from class: nf.c
            @Override // nf.ScheduledFutureC9459p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo37278a(ScheduledFutureC9459p.b bVar) {
                ScheduledExecutorServiceC9458o scheduledExecutorServiceC9458o = this.f33979a;
                return scheduledExecutorServiceC9458o.f34018b.schedule(new Runnable() { // from class: nf.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC9458o.f34017a.execute(new Runnable() { // from class: nf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC9458o.m37288n(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC9459p(new ScheduledFutureC9459p.c() { // from class: nf.f
            @Override // nf.ScheduledFutureC9459p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo37278a(ScheduledFutureC9459p.b bVar) {
                ScheduledExecutorServiceC9458o scheduledExecutorServiceC9458o = this.f33987a;
                return scheduledExecutorServiceC9458o.f34018b.scheduleAtFixedRate(new Runnable() { // from class: nf.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC9458o.f34017a.execute(new Runnable() { // from class: nf.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                ScheduledExecutorServiceC9458o.m37283f(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC9459p(new ScheduledFutureC9459p.c() { // from class: nf.g
            @Override // nf.ScheduledFutureC9459p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo37278a(ScheduledFutureC9459p.b bVar) {
                ScheduledExecutorServiceC9458o scheduledExecutorServiceC9458o = this.f33992a;
                return scheduledExecutorServiceC9458o.f34018b.scheduleWithFixedDelay(new Runnable() { // from class: nf.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC9458o.f34017a.execute(new Runnable() { // from class: nf.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC9458o.m37286l(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f34017a.submit(callable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f34017a.invokeAll(collection, j10, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f34017a.invokeAny(collection, j10, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC9459p(new ScheduledFutureC9459p.c() { // from class: nf.h
            @Override // nf.ScheduledFutureC9459p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo37278a(ScheduledFutureC9459p.b bVar) {
                ScheduledExecutorServiceC9458o scheduledExecutorServiceC9458o = this.f33997a;
                return scheduledExecutorServiceC9458o.f34018b.schedule(new Callable() { // from class: nf.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC9458o.f34017a.submit(new Runnable() { // from class: nf.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC9458o.m37282e(callable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t8) {
        return this.f34017a.submit(runnable, t8);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f34017a.submit(runnable);
    }
}
