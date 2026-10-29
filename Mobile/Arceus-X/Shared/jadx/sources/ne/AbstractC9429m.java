package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: ne.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9429m<V> extends AbstractC9436t<V> {

    /* JADX INFO: renamed from: ne.m$a */
    public static abstract class a<V> extends AbstractC9429m<V> implements AbstractC9411b.i<V> {
        @Override // ne.AbstractC9411b, ne.InterfaceFutureC9440x
        /* JADX INFO: renamed from: a */
        public final void mo37173a(Runnable runnable, Executor executor) {
            super.mo37173a(runnable, executor);
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // ne.AbstractC9411b, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: renamed from: J */
    public static <V> AbstractC9429m<V> m37249J(InterfaceFutureC9440x<V> interfaceFutureC9440x) {
        return interfaceFutureC9440x instanceof AbstractC9429m ? (AbstractC9429m) interfaceFutureC9440x : new C9430n(interfaceFutureC9440x);
    }

    /* JADX INFO: renamed from: H */
    public final <X extends Throwable> AbstractC9429m<V> m37250H(Class<X> cls, InterfaceC6376f<? super X, ? extends V> interfaceC6376f, Executor executor) {
        return (AbstractC9429m) C9435s.m37259d(this, cls, interfaceC6376f, executor);
    }

    /* JADX INFO: renamed from: I */
    public final <X extends Throwable> AbstractC9429m<V> m37251I(Class<X> cls, InterfaceC9425i<? super X, ? extends V> interfaceC9425i, Executor executor) {
        return (AbstractC9429m) C9435s.m37260e(this, cls, interfaceC9425i, executor);
    }

    /* JADX INFO: renamed from: K */
    public final <T> AbstractC9429m<T> m37252K(InterfaceC6376f<? super V, T> interfaceC6376f, Executor executor) {
        return (AbstractC9429m) C9435s.m37267l(this, interfaceC6376f, executor);
    }

    /* JADX INFO: renamed from: L */
    public final <T> AbstractC9429m<T> m37253L(InterfaceC9425i<? super V, T> interfaceC9425i, Executor executor) {
        return (AbstractC9429m) C9435s.m37268m(this, interfaceC9425i, executor);
    }
}
