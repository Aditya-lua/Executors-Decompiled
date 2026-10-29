package r0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import me.x;

/* JADX INFO: loaded from: classes.dex */
public class d<V> implements x<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<V> f29699a;
    public y1.c.a<V> b;

    public class a implements y1.c.InterfaceC0650c<V> {
        public a() {
        }

        @Override // y1.c.InterfaceC0650c
        public Object a(y1.c.a<V> aVar) {
            x2.g.j(d.this.b == null, "The result can only set once!");
            d.this.b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(x<V> xVar) {
        this.f29699a = (x) x2.g.g(xVar);
    }

    public static <V> d<V> c(x<V> xVar) {
        return xVar instanceof d ? (d) xVar : new d<>(xVar);
    }

    @Override // me.x
    public void a(Runnable runnable, Executor executor) {
        this.f29699a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f29699a.cancel(z10);
    }

    public boolean d(V v5) {
        y1.c.a<V> aVar = this.b;
        if (aVar != null) {
            return aVar.c(v5);
        }
        return false;
    }

    public boolean e(Throwable th2) {
        y1.c.a<V> aVar = this.b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    public final <T> d<T> f(t.a<? super V, T> aVar, Executor executor) {
        return (d) n.x(this, aVar, executor);
    }

    public final <T> d<T> g(r0.a<? super V, T> aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f29699a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f29699a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f29699a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f29699a.get(j10, timeUnit);
    }

    public d() {
        this.f29699a = y1.c.a(new a());
    }
}
