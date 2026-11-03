package ne;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class k<V> extends g<Object, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k<V>.b<?> f27137p;

    public final class a extends k<V>.b<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable<V> f27138e;

        public a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f27138e = (Callable) he.n.l(callable);
        }

        @Override // ne.w
        public V e() {
            return this.f27138e.call();
        }

        @Override // ne.w
        public String f() {
            return this.f27138e.toString();
        }

        @Override // ne.k.b
        public void i(V v5) {
            k.this.D(v5);
        }
    }

    public abstract class b<T> extends w<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f27140c;

        public b(Executor executor) {
            this.f27140c = (Executor) he.n.l(executor);
        }

        @Override // ne.w
        public final void a(Throwable th2) {
            k.this.f27137p = null;
            if (th2 instanceof ExecutionException) {
                k.this.E(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                k.this.cancel(false);
            } else {
                k.this.E(th2);
            }
        }

        @Override // ne.w
        public final void b(T t8) {
            k.this.f27137p = null;
            i(t8);
        }

        @Override // ne.w
        public final boolean d() {
            return k.this.isDone();
        }

        public final void h() {
            try {
                this.f27140c.execute(this);
            } catch (RejectedExecutionException e10) {
                k.this.E(e10);
            }
        }

        public abstract void i(T t8);
    }

    public k(ie.r<? extends x<?>> rVar, boolean z10, Executor executor, Callable<V> callable) {
        super(rVar, z10, false);
        this.f27137p = new a(callable, executor);
        W();
    }

    @Override // ne.g
    public void R(int i10, Object obj) {
    }

    @Override // ne.g
    public void U() {
        k<V>.b<?> bVar = this.f27137p;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // ne.g
    public void Z(g.a aVar) {
        super.Z(aVar);
        if (aVar == g.a.OUTPUT_FUTURE_DONE) {
            this.f27137p = null;
        }
    }

    @Override // ne.b
    public void y() {
        k<V>.b<?> bVar = this.f27137p;
        if (bVar != null) {
            bVar.c();
        }
    }
}
