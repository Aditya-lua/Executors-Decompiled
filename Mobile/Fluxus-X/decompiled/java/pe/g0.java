package pe;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public class g0<V> extends m.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile w<?> f29083h;

    public final class a extends w<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<V> f29084c;

        public a(Callable<V> callable) {
            this.f29084c = (Callable) je.n.l(callable);
        }

        @Override // pe.w
        public void a(Throwable th2) {
            g0.this.E(th2);
        }

        @Override // pe.w
        public void b(V v8) {
            g0.this.D(v8);
        }

        @Override // pe.w
        public final boolean d() {
            return g0.this.isDone();
        }

        @Override // pe.w
        public V e() {
            return this.f29084c.call();
        }

        @Override // pe.w
        public String f() {
            return this.f29084c.toString();
        }
    }

    public g0(Callable<V> callable) {
        this.f29083h = new a(callable);
    }

    public static <V> g0<V> M(Runnable runnable, V v8) {
        return new g0<>(Executors.callable(runnable, v8));
    }

    public static <V> g0<V> N(Callable<V> callable) {
        return new g0<>(callable);
    }

    @Override // pe.b
    public String A() {
        w<?> wVar = this.f29083h;
        if (wVar == null) {
            return super.A();
        }
        String strValueOf = String.valueOf(wVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // pe.b
    public void o() {
        w<?> wVar;
        super.o();
        if (G() && (wVar = this.f29083h) != null) {
            wVar.c();
        }
        this.f29083h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        w<?> wVar = this.f29083h;
        if (wVar != null) {
            wVar.run();
        }
        this.f29083h = null;
    }
}
