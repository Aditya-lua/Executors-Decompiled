package ne;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.g0 */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableFutureC9422g0<V> extends AbstractC9429m.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h */
    public volatile AbstractRunnableC9439w<?> f33939h;

    /* JADX INFO: renamed from: ne.g0$a */
    public final class a extends AbstractRunnableC9439w<V> {

        /* JADX INFO: renamed from: c */
        public final Callable<V> f33940c;

        public a(Callable<V> callable) {
            this.f33940c = (Callable) C6384n.m27928l(callable);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: a */
        public void mo37229a(Throwable th2) {
            RunnableFutureC9422g0.this.mo37170E(th2);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: b */
        public void mo37230b(V v5) {
            RunnableFutureC9422g0.this.mo37169D(v5);
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: d */
        public final boolean mo37231d() {
            return RunnableFutureC9422g0.this.isDone();
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: e */
        public V mo37232e() {
            return this.f33940c.call();
        }

        @Override // ne.AbstractRunnableC9439w
        /* JADX INFO: renamed from: f */
        public String mo37233f() {
            return this.f33940c.toString();
        }
    }

    public RunnableFutureC9422g0(Callable<V> callable) {
        this.f33939h = new a(callable);
    }

    /* JADX INFO: renamed from: M */
    public static <V> RunnableFutureC9422g0<V> m37227M(Runnable runnable, V v5) {
        return new RunnableFutureC9422g0<>(Executors.callable(runnable, v5));
    }

    /* JADX INFO: renamed from: N */
    public static <V> RunnableFutureC9422g0<V> m37228N(Callable<V> callable) {
        return new RunnableFutureC9422g0<>(callable);
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: A */
    public String mo37138A() {
        AbstractRunnableC9439w<?> abstractRunnableC9439w = this.f33939h;
        if (abstractRunnableC9439w == null) {
            return super.mo37138A();
        }
        String strValueOf = String.valueOf(abstractRunnableC9439w);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // ne.AbstractC9411b
    /* JADX INFO: renamed from: o */
    public void mo37141o() {
        AbstractRunnableC9439w<?> abstractRunnableC9439w;
        super.mo37141o();
        if (m37172G() && (abstractRunnableC9439w = this.f33939h) != null) {
            abstractRunnableC9439w.m37272c();
        }
        this.f33939h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        AbstractRunnableC9439w<?> abstractRunnableC9439w = this.f33939h;
        if (abstractRunnableC9439w != null) {
            abstractRunnableC9439w.run();
        }
        this.f33939h = null;
    }
}
