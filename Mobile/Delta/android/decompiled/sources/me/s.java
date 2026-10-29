package me;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends u {

    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f24137a;
        public final q<? super V> b;

        public a(Future<V> future, q<? super V> qVar) {
            this.f24137a = future;
            this.b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f24137a;
            if ((future instanceof ne.a) && (thA = ne.b.a((ne.a) future)) != null) {
                this.b.onFailure(thA);
                return;
            }
            try {
                this.b.onSuccess(s.f(this.f24137a));
            } catch (Error e10) {
                e = e10;
                this.b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.b.onFailure(e);
            } catch (ExecutionException e12) {
                this.b.onFailure(e12.getCause());
            }
        }

        public String toString() {
            return ge.h.b(this).c(this.b).toString();
        }
    }

    public static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24138a;
        public final he.t<x<? extends V>> b;

        public /* synthetic */ b(boolean z10, he.t tVar, r rVar) {
            this(z10, tVar);
        }

        public <C> x<C> a(Callable<C> callable, Executor executor) {
            return new k(this.b, this.f24138a, executor, callable);
        }

        public b(boolean z10, he.t<x<? extends V>> tVar) {
            this.f24138a = z10;
            this.b = tVar;
        }
    }

    public static <V> void a(x<V> xVar, q<? super V> qVar, Executor executor) {
        ge.n.l(qVar);
        xVar.a(new a(xVar, qVar), executor);
    }

    public static <V> x<List<V>> b(Iterable<? extends x<? extends V>> iterable) {
        return new j.a(he.t.m(iterable), true);
    }

    @SafeVarargs
    public static <V> x<List<V>> c(x<? extends V>... xVarArr) {
        return new j.a(he.t.u(xVarArr), true);
    }

    public static <V, X extends Throwable> x<V> d(x<? extends V> xVar, Class<X> cls, ge.f<? super X, ? extends V> fVar, Executor executor) {
        return me.a.M(xVar, cls, fVar, executor);
    }

    public static <V, X extends Throwable> x<V> e(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        return me.a.N(xVar, cls, iVar, executor);
    }

    public static <V> V f(Future<V> future) {
        ge.n.t(future.isDone(), "Future was expected to be done: %s", future);
        return (V) h0.a(future);
    }

    public static <V> x<V> g(Throwable th2) {
        ge.n.l(th2);
        return new v.a(th2);
    }

    public static <V> x<V> h(V v5) {
        return v5 == null ? (x<V>) v.b : new v(v5);
    }

    public static x<Void> i() {
        return v.b;
    }

    public static x<Void> j(Runnable runnable, Executor executor) {
        g0 g0VarM = g0.M(runnable, null);
        executor.execute(g0VarM);
        return g0VarM;
    }

    public static <O> x<O> k(Callable<O> callable, Executor executor) {
        g0 g0VarN = g0.N(callable);
        executor.execute(g0VarN);
        return g0VarN;
    }

    public static <I, O> x<O> l(x<I> xVar, ge.f<? super I, ? extends O> fVar, Executor executor) {
        return d.M(xVar, fVar, executor);
    }

    public static <I, O> x<O> m(x<I> xVar, i<? super I, ? extends O> iVar, Executor executor) {
        return d.N(xVar, iVar, executor);
    }

    public static <V> b<V> n(Iterable<? extends x<? extends V>> iterable) {
        return new b<>(false, he.t.m(iterable), null);
    }

    @SafeVarargs
    public static <V> b<V> o(x<? extends V>... xVarArr) {
        return new b<>(false, he.t.u(xVarArr), null);
    }
}
