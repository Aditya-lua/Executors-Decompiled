package ne;

import ie.AbstractC6796t;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p169he.C6378h;
import p169he.C6384n;
import p169he.InterfaceC6376f;
import p329oe.AbstractC9725a;
import p329oe.C9726b;

/* JADX INFO: renamed from: ne.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C9435s extends AbstractC9437u {

    /* JADX INFO: renamed from: ne.s$a */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Future<V> f33959a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9433q<? super V> f33960b;

        public a(Future<V> future, InterfaceC9433q<? super V> interfaceC9433q) {
            this.f33959a = future;
            this.f33960b = interfaceC9433q;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thM38487a;
            Future<V> future = this.f33959a;
            if ((future instanceof AbstractC9725a) && (thM38487a = C9726b.m38487a((AbstractC9725a) future)) != null) {
                this.f33960b.onFailure(thM38487a);
                return;
            }
            try {
                this.f33960b.onSuccess(C9435s.m37261f(this.f33959a));
            } catch (Error e10) {
                e = e10;
                this.f33960b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f33960b.onFailure(e);
            } catch (ExecutionException e12) {
                this.f33960b.onFailure(e12.getCause());
            }
        }

        public String toString() {
            return C6378h.m27904b(this).m27908c(this.f33960b).toString();
        }
    }

    /* JADX INFO: renamed from: ne.s$b */
    public static final class b<V> {

        /* JADX INFO: renamed from: a */
        public final boolean f33961a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6796t<InterfaceFutureC9440x<? extends V>> f33962b;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean), (r2v0 ie.t) A[MD:(boolean, ie.t<ne.x<? extends V>>):void (m)] (LINE:1) call: ne.s.b.<init>(boolean, ie.t):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(boolean z10, AbstractC6796t abstractC6796t, RunnableC9434r runnableC9434r) {
            this(z10, abstractC6796t);
        }

        /* JADX INFO: renamed from: a */
        public <C> InterfaceFutureC9440x<C> m37271a(Callable<C> callable, Executor executor) {
            return new C9427k(this.f33962b, this.f33961a, executor, callable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(boolean z10, AbstractC6796t<InterfaceFutureC9440x<? extends V>> abstractC6796t) {
            this.f33961a = z10;
            this.f33962b = abstractC6796t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <V> void m37256a(InterfaceFutureC9440x<V> interfaceFutureC9440x, InterfaceC9433q<? super V> interfaceC9433q, Executor executor) {
        C6384n.m27928l(interfaceC9433q);
        interfaceFutureC9440x.mo37173a(new a(interfaceFutureC9440x, interfaceC9433q), executor);
    }

    /* JADX INFO: renamed from: b */
    public static <V> InterfaceFutureC9440x<List<V>> m37257b(Iterable<? extends InterfaceFutureC9440x<? extends V>> iterable) {
        return new AbstractC9426j.a(AbstractC6796t.m29093m(iterable), true);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public static <V> InterfaceFutureC9440x<List<V>> m37258c(InterfaceFutureC9440x<? extends V>... interfaceFutureC9440xArr) {
        return new AbstractC9426j.a(AbstractC6796t.m29096u(interfaceFutureC9440xArr), true);
    }

    /* JADX INFO: renamed from: d */
    public static <V, X extends Throwable> InterfaceFutureC9440x<V> m37259d(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC6376f<? super X, ? extends V> interfaceC6376f, Executor executor) {
        return AbstractRunnableC9409a.m37136M(interfaceFutureC9440x, cls, interfaceC6376f, executor);
    }

    /* JADX INFO: renamed from: e */
    public static <V, X extends Throwable> InterfaceFutureC9440x<V> m37260e(InterfaceFutureC9440x<? extends V> interfaceFutureC9440x, Class<X> cls, InterfaceC9425i<? super X, ? extends V> interfaceC9425i, Executor executor) {
        return AbstractRunnableC9409a.m37137N(interfaceFutureC9440x, cls, interfaceC9425i, executor);
    }

    /* JADX INFO: renamed from: f */
    public static <V> V m37261f(Future<V> future) {
        C6384n.m27936t(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C9424h0.m37242a(future);
    }

    /* JADX INFO: renamed from: g */
    public static <V> InterfaceFutureC9440x<V> m37262g(Throwable th2) {
        C6384n.m27928l(th2);
        return new C9438v.a(th2);
    }

    /* JADX INFO: renamed from: h */
    public static <V> InterfaceFutureC9440x<V> m37263h(V v5) {
        return v5 == null ? (InterfaceFutureC9440x<V>) C9438v.f33963b : new C9438v(v5);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: ne.x<?>, ne.x<java.lang.Void> */
    /* JADX INFO: renamed from: i */
    public static InterfaceFutureC9440x<Void> m37264i() {
        return C9438v.f33963b;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceFutureC9440x<Void> m37265j(Runnable runnable, Executor executor) {
        RunnableFutureC9422g0 runnableFutureC9422g0M37227M = RunnableFutureC9422g0.m37227M(runnable, null);
        executor.execute(runnableFutureC9422g0M37227M);
        return runnableFutureC9422g0M37227M;
    }

    /* JADX INFO: renamed from: k */
    public static <O> InterfaceFutureC9440x<O> m37266k(Callable<O> callable, Executor executor) {
        RunnableFutureC9422g0 runnableFutureC9422g0M37228N = RunnableFutureC9422g0.m37228N(callable);
        executor.execute(runnableFutureC9422g0M37228N);
        return runnableFutureC9422g0M37228N;
    }

    /* JADX INFO: renamed from: l */
    public static <I, O> InterfaceFutureC9440x<O> m37267l(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC6376f<? super I, ? extends O> interfaceC6376f, Executor executor) {
        return AbstractRunnableC9415d.m37196M(interfaceFutureC9440x, interfaceC6376f, executor);
    }

    /* JADX INFO: renamed from: m */
    public static <I, O> InterfaceFutureC9440x<O> m37268m(InterfaceFutureC9440x<I> interfaceFutureC9440x, InterfaceC9425i<? super I, ? extends O> interfaceC9425i, Executor executor) {
        return AbstractRunnableC9415d.m37197N(interfaceFutureC9440x, interfaceC9425i, executor);
    }

    /* JADX INFO: renamed from: n */
    public static <V> b<V> m37269n(Iterable<? extends InterfaceFutureC9440x<? extends V>> iterable) {
        return new b<>(false, AbstractC6796t.m29093m(iterable), null);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: o */
    public static <V> b<V> m37270o(InterfaceFutureC9440x<? extends V>... interfaceFutureC9440xArr) {
        return new b<>(false, AbstractC6796t.m29096u(interfaceFutureC9440xArr), null);
    }
}
