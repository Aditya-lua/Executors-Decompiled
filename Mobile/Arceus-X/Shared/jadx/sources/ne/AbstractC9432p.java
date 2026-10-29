package ne;

import java.util.concurrent.Executor;
import p169he.C6384n;

/* JADX INFO: renamed from: ne.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9432p<V> extends AbstractFutureC9431o<V> implements InterfaceFutureC9440x<V> {

    /* JADX INFO: renamed from: ne.p$a */
    public static abstract class a<V> extends AbstractC9432p<V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceFutureC9440x<V> f33958a;

        public a(InterfaceFutureC9440x<V> interfaceFutureC9440x) {
            this.f33958a = (InterfaceFutureC9440x) C6384n.m27928l(interfaceFutureC9440x);
        }

        /* JADX DEBUG: Method merged with bridge method: c()Ljava/util/concurrent/Future; */
        /* JADX DEBUG: Method merged with bridge method: delegate()Ljava/lang/Object; */
        @Override // ie.AbstractC6786o
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final InterfaceFutureC9440x<V> delegate() {
            return this.f33958a;
        }
    }

    @Override // ne.InterfaceFutureC9440x
    /* JADX INFO: renamed from: a */
    public void mo37173a(Runnable runnable, Executor executor) {
        mo37254c().mo37173a(runnable, executor);
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceFutureC9440x<? extends V> mo37254c();
}
