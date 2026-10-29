package r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import me.x;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t.a<?, ?> f29717a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    public class a<I, O> implements r0.a<I, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f29718a;

        public a(t.a aVar) {
            this.f29718a = aVar;
        }

        @Override // r0.a
        public x<O> apply(I i10) {
            return n.p(this.f29718a.apply(i10));
        }
    }

    public class b implements t.a<Object, Object> {
        @Override // t.a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class c<I> implements r0.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f29719a;
        public final /* synthetic */ t.a b;

        public c(y1.c.a aVar, t.a aVar2) {
            this.f29719a = aVar;
            this.b = aVar2;
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            this.f29719a.f(th2);
        }

        @Override // r0.c
        public void onSuccess(I i10) {
            try {
                this.f29719a.c(this.b.apply(i10));
            } catch (Throwable th2) {
                this.f29719a.f(th2);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f29720a;

        public d(x xVar) {
            this.f29720a = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29720a.cancel(true);
        }
    }

    public static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f29721a;
        public final r0.c<? super V> b;

        public e(Future<V> future, r0.c<? super V> cVar) {
            this.f29721a = future;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.onSuccess(n.l(this.f29721a));
            } catch (Error e10) {
                e = e10;
                this.b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.b.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.b.onFailure(e12);
                } else {
                    this.b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.b;
        }
    }

    public static /* synthetic */ Object a(final x xVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final y1.c.a aVar) {
        t(xVar, aVar);
        if (!xVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: r0.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar, obj, z10, xVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
            xVar.a(new Runnable() { // from class: r0.k
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, q0.c.b());
        }
        return "TimeoutFuture[" + xVar + "]";
    }

    public static /* synthetic */ Object c(x xVar, y1.c.a aVar) {
        v(false, xVar, f29717a, aVar, q0.c.b());
        return "nonCancellationPropagating[" + xVar + "]";
    }

    public static /* synthetic */ Object d(final x xVar, ScheduledExecutorService scheduledExecutorService, final long j10, final y1.c.a aVar) {
        t(xVar, aVar);
        if (!xVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: r0.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + xVar + "] is not done within " + j10 + " ms.")));
                }
            }, j10, TimeUnit.MILLISECONDS);
            xVar.a(new Runnable() { // from class: r0.h
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, q0.c.b());
        }
        return "TimeoutFuture[" + xVar + "]";
    }

    public static /* synthetic */ Object f(x xVar, final y1.c.a aVar) {
        xVar.a(new Runnable() { // from class: r0.e
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, q0.c.b());
        return "transformVoidFuture [" + xVar + "]";
    }

    public static /* synthetic */ void h(y1.c.a aVar, Object obj, boolean z10, x xVar) {
        aVar.c(obj);
        if (z10) {
            xVar.cancel(true);
        }
    }

    public static <V> void j(x<V> xVar, r0.c<? super V> cVar, Executor executor) {
        x2.g.g(cVar);
        xVar.a(new e(xVar, cVar), executor);
    }

    public static <V> x<List<V>> k(Collection<? extends x<? extends V>> collection) {
        return new p(new ArrayList(collection), true, q0.c.b());
    }

    public static <V> V l(Future<V> future) {
        x2.g.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m(future);
    }

    public static <V> V m(Future<V> future) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }

    public static <V> x<V> n(Throwable th2) {
        return new o.a(th2);
    }

    public static <V> ScheduledFuture<V> o(Throwable th2) {
        return new o.b(th2);
    }

    public static <V> x<V> p(V v5) {
        return v5 == null ? o.c() : new o.c(v5);
    }

    public static <V> x<V> q(final long j10, final ScheduledExecutorService scheduledExecutorService, final V v5, final boolean z10, final x<V> xVar) {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: r0.i
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.a(xVar, scheduledExecutorService, v5, z10, j10, aVar);
            }
        });
    }

    public static <V> x<V> r(final long j10, final ScheduledExecutorService scheduledExecutorService, final x<V> xVar) {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: r0.f
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.d(xVar, scheduledExecutorService, j10, aVar);
            }
        });
    }

    public static <V> x<V> s(final x<V> xVar) {
        x2.g.g(xVar);
        return xVar.isDone() ? xVar : y1.c.a(new y1.c.InterfaceC0650c() { // from class: r0.l
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.c(xVar, aVar);
            }
        });
    }

    public static <V> void t(x<V> xVar, y1.c.a<V> aVar) {
        u(xVar, f29717a, aVar, q0.c.b());
    }

    public static <I, O> void u(x<I> xVar, t.a<? super I, ? extends O> aVar, y1.c.a<O> aVar2, Executor executor) {
        v(true, xVar, aVar, aVar2, executor);
    }

    public static <I, O> void v(boolean z10, x<I> xVar, t.a<? super I, ? extends O> aVar, y1.c.a<O> aVar2, Executor executor) {
        x2.g.g(xVar);
        x2.g.g(aVar);
        x2.g.g(aVar2);
        x2.g.g(executor);
        j(xVar, new c(aVar2, aVar), executor);
        if (z10) {
            aVar2.a(new d(xVar), q0.c.b());
        }
    }

    public static <V> x<List<V>> w(Collection<? extends x<? extends V>> collection) {
        return new p(new ArrayList(collection), false, q0.c.b());
    }

    public static <I, O> x<O> x(x<I> xVar, t.a<? super I, ? extends O> aVar, Executor executor) {
        x2.g.g(aVar);
        return y(xVar, new a(aVar), executor);
    }

    public static <I, O> x<O> y(x<I> xVar, r0.a<? super I, ? extends O> aVar, Executor executor) {
        r0.b bVar = new r0.b(aVar, xVar);
        xVar.a(bVar, executor);
        return bVar;
    }

    public static <V> x<Void> z(final x<V> xVar) {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: r0.m
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return n.f(xVar, aVar);
            }
        });
    }
}
