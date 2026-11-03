package ne;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends u {

    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<V> f27145a;
        public final q<? super V> b;

        public a(Future<V> future, q<? super V> qVar) {
            this.f27145a = future;
            this.b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f27145a;
            if ((future instanceof oe.a) && (thA = oe.b.a((oe.a) future)) != null) {
                this.b.onFailure(thA);
                return;
            }
            try {
                this.b.onSuccess(s.f(this.f27145a));
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
            return he.h.b(this).c(this.b).toString();
        }
    }

    public static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27146a;
        public final ie.t<x<? extends V>> b;

        public /* synthetic */ b(boolean z10, ie.t tVar, r rVar) {
            this(z10, tVar);
        }

        public <C> x<C> a(Callable<C> callable, Executor executor) {
            return new k(this.b, this.f27146a, executor, callable);
        }

        public b(boolean z10, ie.t<x<? extends V>> tVar) {
            this.f27146a = z10;
            this.b = tVar;
        }
    }

    public static <V> void a(x<V> xVar, q<? super V> qVar, Executor executor) {
        he.n.l(qVar);
        xVar.a(new a(xVar, qVar), executor);
    }

    public static <V> x<List<V>> b(Iterable<? extends x<? extends V>> iterable) {
        return new j.a(ie.t.m(iterable), true);
    }

    @SafeVarargs
    public static <V> x<List<V>> c(x<? extends V>... xVarArr) {
        return new j.a(ie.t.u(xVarArr), true);
    }

    public static <V, X extends Throwable> x<V> d(x<? extends V> xVar, Class<X> cls, he.f<? super X, ? extends V> fVar, Executor executor) {
        return ne.a.M(xVar, cls, fVar, executor);
    }

    public static <V, X extends Throwable> x<V> e(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        return ne.a.N(xVar, cls, iVar, executor);
    }

    public static <V> V f(Future<V> future) {
        he.n.t(future.isDone(), "Future was expected to be done: %s", future);
        return (V) h0.a(future);
    }

    public static <V> x<V> g(Throwable th2) {
        he.n.l(th2);
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

    public static <I, O> x<O> l(x<I> xVar, he.f<? super I, ? extends O> fVar, Executor executor) {
        return d.M(xVar, fVar, executor);
    }

    public static <I, O> x<O> m(x<I> xVar, i<? super I, ? extends O> iVar, Executor executor) {
        return d.N(xVar, iVar, executor);
    }

    public static <V> b<V> n(Iterable<? extends x<? extends V>> iterable) {
        return new b<>(false, ie.t.m(iterable), null);
    }

    @SafeVarargs
    public static <V> b<V> o(x<? extends V>... xVarArr) {
        return new b<>(false, ie.t.u(xVarArr), null);
    }
}
