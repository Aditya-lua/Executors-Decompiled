package pf;

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
    public final ExecutorService f29140a;
    public final ScheduledExecutorService b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f29140a = executorService;
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

    public static /* synthetic */ void k(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void o(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f29140a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29140a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f29140a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f29140a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f29140a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f29140a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: pf.c
            @Override // pf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f29114a;
                return oVar.b.schedule(new Runnable() { // from class: pf.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f29140a.execute(new Runnable() { // from class: pf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.o(runnable, bVar);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: pf.f
            @Override // pf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f29119a;
                return oVar.b.scheduleAtFixedRate(new Runnable() { // from class: pf.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f29140a.execute(new Runnable() { // from class: pf.d
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
        return new p(new p.c() { // from class: pf.g
            @Override // pf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f29123a;
                return oVar.b.scheduleWithFixedDelay(new Runnable() { // from class: pf.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f29140a.execute(new Runnable() { // from class: pf.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.k(runnable, bVar);
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
        return this.f29140a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f29140a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f29140a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: pf.h
            @Override // pf.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f29127a;
                return oVar.b.schedule(new Callable() { // from class: pf.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f29140a.submit(new Runnable() { // from class: pf.n
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
        return this.f29140a.submit(runnable, t8);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f29140a.submit(runnable);
    }
}
