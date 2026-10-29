package p397r0;

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
import ne.InterfaceFutureC9440x;
import p366q0.C10417c;
import p436t.InterfaceC11464a;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: r0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10773n {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC11464a<?, ?> f38369a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    /* JADX INFO: renamed from: r0.n$a */
    public class a<I, O> implements InterfaceC10760a<I, O> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11464a f38370a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC11464a interfaceC11464a) {
            this.f38370a = interfaceC11464a;
        }

        @Override // p397r0.InterfaceC10760a
        public InterfaceFutureC9440x<O> apply(I i10) {
            return C10773n.m40993p(this.f38370a.apply(i10));
        }
    }

    /* JADX INFO: renamed from: r0.n$b */
    public class b implements InterfaceC11464a<Object, Object> {
        @Override // p436t.InterfaceC11464a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: r0.n$c */
    public class c<I> implements InterfaceC10762c<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f38371a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11464a f38372b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(C12997c.a aVar, InterfaceC11464a interfaceC11464a) {
            this.f38371a = aVar;
            this.f38372b = interfaceC11464a;
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            this.f38371a.m48317f(th2);
        }

        @Override // p397r0.InterfaceC10762c
        public void onSuccess(I i10) {
            try {
                this.f38371a.m48314c(this.f38372b.apply(i10));
            } catch (Throwable th2) {
                this.f38371a.m48317f(th2);
            }
        }
    }

    /* JADX INFO: renamed from: r0.n$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceFutureC9440x f38373a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(InterfaceFutureC9440x interfaceFutureC9440x) {
            this.f38373a = interfaceFutureC9440x;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38373a.cancel(true);
        }
    }

    /* JADX INFO: renamed from: r0.n$e */
    public static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Future<V> f38374a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC10762c<? super V> f38375b;

        public e(Future<V> future, InterfaceC10762c<? super V> interfaceC10762c) {
            this.f38374a = future;
            this.f38375b = interfaceC10762c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38375b.onSuccess(C10773n.m40989l(this.f38374a));
            } catch (Error e10) {
                e = e10;
                this.f38375b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f38375b.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f38375b.onFailure(e12);
                } else {
                    this.f38375b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f38375b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m40978a(final InterfaceFutureC9440x interfaceFutureC9440x, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final C12997c.a aVar) {
        m40997t(interfaceFutureC9440x, aVar);
        if (!interfaceFutureC9440x.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: r0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C10773n.m40985h(aVar, obj, z10, interfaceFutureC9440x);
                }
            }, j10, TimeUnit.MILLISECONDS);
            interfaceFutureC9440x.mo37173a(new Runnable() { // from class: r0.k
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, C10417c.m40081b());
        }
        return "TimeoutFuture[" + interfaceFutureC9440x + "]";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m40980c(InterfaceFutureC9440x interfaceFutureC9440x, C12997c.a aVar) {
        m40999v(false, interfaceFutureC9440x, f38369a, aVar, C10417c.m40081b());
        return "nonCancellationPropagating[" + interfaceFutureC9440x + "]";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m40981d(final InterfaceFutureC9440x interfaceFutureC9440x, ScheduledExecutorService scheduledExecutorService, final long j10, final C12997c.a aVar) {
        m40997t(interfaceFutureC9440x, aVar);
        if (!interfaceFutureC9440x.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: r0.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.m48317f(new TimeoutException("Future[" + interfaceFutureC9440x + "] is not done within " + j10 + " ms.")));
                }
            }, j10, TimeUnit.MILLISECONDS);
            interfaceFutureC9440x.mo37173a(new Runnable() { // from class: r0.h
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, C10417c.m40081b());
        }
        return "TimeoutFuture[" + interfaceFutureC9440x + "]";
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m40983f(InterfaceFutureC9440x interfaceFutureC9440x, final C12997c.a aVar) {
        interfaceFutureC9440x.mo37173a(new Runnable() { // from class: r0.e
            @Override // java.lang.Runnable
            public final void run() {
                aVar.m48314c(null);
            }
        }, C10417c.m40081b());
        return "transformVoidFuture [" + interfaceFutureC9440x + "]";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m40985h(C12997c.a aVar, Object obj, boolean z10, InterfaceFutureC9440x interfaceFutureC9440x) {
        aVar.m48314c(obj);
        if (z10) {
            interfaceFutureC9440x.cancel(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public static <V> void m40987j(InterfaceFutureC9440x<V> interfaceFutureC9440x, InterfaceC10762c<? super V> interfaceC10762c, Executor executor) {
        C12637g.m47075g(interfaceC10762c);
        interfaceFutureC9440x.mo37173a(new e(interfaceFutureC9440x, interfaceC10762c), executor);
    }

    /* JADX INFO: renamed from: k */
    public static <V> InterfaceFutureC9440x<List<V>> m40988k(Collection<? extends InterfaceFutureC9440x<? extends V>> collection) {
        return new C10775p(new ArrayList(collection), true, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: l */
    public static <V> V m40989l(Future<V> future) {
        C12637g.m47078j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m40990m(future);
    }

    /* JADX INFO: renamed from: m */
    public static <V> V m40990m(Future<V> future) {
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

    /* JADX INFO: renamed from: n */
    public static <V> InterfaceFutureC9440x<V> m40991n(Throwable th2) {
        return new AbstractC10774o.a(th2);
    }

    /* JADX INFO: renamed from: o */
    public static <V> ScheduledFuture<V> m40992o(Throwable th2) {
        return new AbstractC10774o.b(th2);
    }

    /* JADX INFO: renamed from: p */
    public static <V> InterfaceFutureC9440x<V> m40993p(V v5) {
        return v5 == null ? AbstractC10774o.m41004c() : new AbstractC10774o.c(v5);
    }

    /* JADX INFO: renamed from: q */
    public static <V> InterfaceFutureC9440x<V> m40994q(final long j10, final ScheduledExecutorService scheduledExecutorService, final V v5, final boolean z10, final InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        return C12997c.m48311a(new C12997c.c() { // from class: r0.i
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10773n.m40978a(interfaceFutureC9440x, scheduledExecutorService, v5, z10, j10, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static <V> InterfaceFutureC9440x<V> m40995r(final long j10, final ScheduledExecutorService scheduledExecutorService, final InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        return C12997c.m48311a(new C12997c.c() { // from class: r0.f
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10773n.m40981d(interfaceFutureC9440x, scheduledExecutorService, j10, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static <V> InterfaceFutureC9440x<V> m40996s(final InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        C12637g.m47075g(interfaceFutureC9440x);
        return interfaceFutureC9440x.isDone() ? interfaceFutureC9440x : C12997c.m48311a(new C12997c.c() { // from class: r0.l
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10773n.m40980c(interfaceFutureC9440x, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static <V> void m40997t(InterfaceFutureC9440x<V> interfaceFutureC9440x, C12997c.a<V> aVar) {
        m40998u(interfaceFutureC9440x, f38369a, aVar, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: u */
    public static <I, O> void m40998u(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC11464a<? super I, ? extends O> interfaceC11464a, C12997c.a<O> aVar, Executor executor) {
        m40999v(true, interfaceFutureC9440x, interfaceC11464a, aVar, executor);
    }

    /* JADX INFO: renamed from: v */
    public static <I, O> void m40999v(boolean z10, InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC11464a<? super I, ? extends O> interfaceC11464a, C12997c.a<O> aVar, Executor executor) {
        C12637g.m47075g(interfaceFutureC9440x);
        C12637g.m47075g(interfaceC11464a);
        C12637g.m47075g(aVar);
        C12637g.m47075g(executor);
        m40987j(interfaceFutureC9440x, new c(aVar, interfaceC11464a), executor);
        if (z10) {
            aVar.m48312a(new d(interfaceFutureC9440x), C10417c.m40081b());
        }
    }

    /* JADX INFO: renamed from: w */
    public static <V> InterfaceFutureC9440x<List<V>> m41000w(Collection<? extends InterfaceFutureC9440x<? extends V>> collection) {
        return new C10775p(new ArrayList(collection), false, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: x */
    public static <I, O> InterfaceFutureC9440x<O> m41001x(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC11464a<? super I, ? extends O> interfaceC11464a, Executor executor) {
        C12637g.m47075g(interfaceC11464a);
        return m41002y(interfaceFutureC9440x, new a(interfaceC11464a), executor);
    }

    /* JADX INFO: renamed from: y */
    public static <I, O> InterfaceFutureC9440x<O> m41002y(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC10760a<? super I, ? extends O> interfaceC10760a, Executor executor) {
        RunnableC10761b runnableC10761b = new RunnableC10761b(interfaceC10760a, interfaceFutureC9440x);
        interfaceFutureC9440x.mo37173a(runnableC10761b, executor);
        return runnableC10761b;
    }

    /* JADX INFO: renamed from: z */
    public static <V> InterfaceFutureC9440x<Void> m41003z(final InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        return C12997c.m48311a(new C12997c.c() { // from class: r0.m
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10773n.m40983f(interfaceFutureC9440x, aVar);
            }
        });
    }
}
