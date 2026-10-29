package n0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface a3<T> {

    public interface a<T> {
        void a(T t8);

        void onError(Throwable th2);
    }

    me.x<T> b();

    void c(Executor executor, a<? super T> aVar);

    void d(a<? super T> aVar);
}
