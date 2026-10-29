package me;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public class g0<V> extends m.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile w<?> f24119h;

    public final class a extends w<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<V> f24120c;

        public a(Callable<V> callable) {
            this.f24120c = (Callable) ge.n.l(callable);
        }

        @Override // me.w
        public void a(Throwable th2) {
            g0.this.E(th2);
        }

        @Override // me.w
        public void b(V v5) {
            g0.this.D(v5);
        }

        @Override // me.w
        public final boolean d() {
            return g0.this.isDone();
        }

        @Override // me.w
        public V e() {
            return this.f24120c.call();
        }

        @Override // me.w
        public String f() {
            return this.f24120c.toString();
        }
    }

    public g0(Callable<V> callable) {
        this.f24119h = new a(callable);
    }

    public static <V> g0<V> M(Runnable runnable, V v5) {
        return new g0<>(Executors.callable(runnable, v5));
    }

    public static <V> g0<V> N(Callable<V> callable) {
        return new g0<>(callable);
    }

    @Override // me.b
    public String A() {
        w<?> wVar = this.f24119h;
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

    @Override // me.b
    public void o() {
        w<?> wVar;
        super.o();
        if (G() && (wVar = this.f24119h) != null) {
            wVar.c();
        }
        this.f24119h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        w<?> wVar = this.f24119h;
        if (wVar != null) {
            wVar.run();
        }
        this.f24119h = null;
    }
}
