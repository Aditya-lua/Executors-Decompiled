package p296n0;

import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;

/* JADX INFO: renamed from: n0.a3 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8722a3<T> {

    /* JADX INFO: renamed from: n0.a3$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        void mo2367a(T t8);

        void onError(Throwable th2);
    }

    /* JADX INFO: renamed from: b */
    InterfaceFutureC9440x<T> mo34017b();

    /* JADX INFO: renamed from: c */
    void mo34018c(Executor executor, a<? super T> aVar);

    /* JADX INFO: renamed from: d */
    void mo34019d(a<? super T> aVar);
}
