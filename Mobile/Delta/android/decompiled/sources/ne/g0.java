package ne;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public class g0<V> extends m.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile w<?> f27127h;

    public final class a extends w<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<V> f27128c;

        public a(Callable<V> callable) {
            this.f27128c = (Callable) he.n.l(callable);
        }

        @Override // ne.w
        public void a(Throwable th2) {
            g0.this.E(th2);
        }

        @Override // ne.w
        public void b(V v5) {
            g0.this.D(v5);
        }

        @Override // ne.w
        public final boolean d() {
            return g0.this.isDone();
        }

        @Override // ne.w
        public V e() {
            return this.f27128c.call();
        }

        @Override // ne.w
        public String f() {
            return this.f27128c.toString();
        }
    }

    public g0(Callable<V> callable) {
        this.f27127h = new a(callable);
    }

    public static <V> g0<V> M(Runnable runnable, V v5) {
        return new g0<>(Executors.callable(runnable, v5));
    }

    public static <V> g0<V> N(Callable<V> callable) {
        return new g0<>(callable);
    }

    @Override // ne.b
    public String A() {
        w<?> wVar = this.f27127h;
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

    @Override // ne.b
    public void o() {
        w<?> wVar;
        super.o();
        if (G() && (wVar = this.f27127h) != null) {
            wVar.c();
        }
        this.f27127h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        w<?> wVar = this.f27127h;
        if (wVar != null) {
            wVar.run();
        }
        this.f27127h = null;
    }
}
