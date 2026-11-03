package hv;

import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public interface d<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    d<T> m72clone();

    x<T> execute();

    boolean isCanceled();

    void m(f<T> fVar);

    Request request();
}
