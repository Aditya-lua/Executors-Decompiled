package ne;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p<V> extends o<V> implements x<V> {

    public static abstract class a<V> extends p<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x<V> f27144a;

        public a(x<V> xVar) {
            this.f27144a = (x) he.n.l(xVar);
        }

        @Override // ie.o
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final x<V> delegate() {
            return this.f27144a;
        }
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }

    /* JADX INFO: renamed from: d */
    public abstract x<? extends V> c();
}
