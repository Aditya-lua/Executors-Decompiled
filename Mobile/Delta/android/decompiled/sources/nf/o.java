package nf;

import e.k0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class o implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f27184a;
    public final ScheduledExecutorService b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f27184a = executorService;
        this.b = scheduledExecutorService;
    }

    public static /* synthetic */ void e(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void f(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void j(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f27184a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27184a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f27184a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f27184a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f27184a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f27184a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.c
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f27158a;
                return oVar.b.schedule(new Runnable() { // from class: nf.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f27184a.execute(new Runnable() { // from class: nf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.m(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.f
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f27163a;
                return oVar.b.scheduleAtFixedRate(new Runnable() { // from class: nf.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f27184a.execute(new Runnable() { // from class: nf.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                o.f(runnable, bVar);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.g
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f27167a;
                return oVar.b.scheduleWithFixedDelay(new Runnable() { // from class: nf.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f27184a.execute(new Runnable() { // from class: nf.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.j(runnable, bVar);
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

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f27184a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f27184a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f27184a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.h
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f27171a;
                return oVar.b.schedule(new Callable() { // from class: nf.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f27184a.submit(new Runnable() { // from class: nf.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.e(callable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t8) {
        return this.f27184a.submit(runnable, t8);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f27184a.submit(runnable);
    }
}
