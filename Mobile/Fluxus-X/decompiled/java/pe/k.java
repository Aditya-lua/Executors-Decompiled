package pe;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class k<V> extends g<Object, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k<V>.b<?> f29093p;

    public final class a extends k<V>.b<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable<V> f29094e;

        public a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f29094e = (Callable) je.n.l(callable);
        }

        @Override // pe.w
        public V e() {
            return this.f29094e.call();
        }

        @Override // pe.w
        public String f() {
            return this.f29094e.toString();
        }

        @Override // pe.k.b
        public void i(V v8) {
            k.this.D(v8);
        }
    }

    public abstract class b<T> extends w<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f29096c;

        public b(Executor executor) {
            this.f29096c = (Executor) je.n.l(executor);
        }

        @Override // pe.w
        public final void a(Throwable th2) {
            k.this.f29093p = null;
            if (th2 instanceof ExecutionException) {
                k.this.E(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                k.this.cancel(false);
            } else {
                k.this.E(th2);
            }
        }

        @Override // pe.w
        public final void b(T t8) {
            k.this.f29093p = null;
            i(t8);
        }

        @Override // pe.w
        public final boolean d() {
            return k.this.isDone();
        }

        public final void h() {
            try {
                this.f29096c.execute(this);
            } catch (RejectedExecutionException e10) {
                k.this.E(e10);
            }
        }

        public abstract void i(T t8);
    }

    public k(ke.r<? extends x<?>> rVar, boolean z10, Executor executor, Callable<V> callable) {
        super(rVar, z10, false);
        this.f29093p = new a(callable, executor);
        W();
    }

    @Override // pe.g
    public void R(int i10, Object obj) {
    }

    @Override // pe.g
    public void U() {
        k<V>.b<?> bVar = this.f29093p;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // pe.g
    public void Z(g.a aVar) {
        super.Z(aVar);
        if (aVar == g.a.OUTPUT_FUTURE_DONE) {
            this.f29093p = null;
        }
    }

    @Override // pe.b
    public void y() {
        k<V>.b<?> bVar = this.f29093p;
        if (bVar != null) {
            bVar.c();
        }
    }
}
