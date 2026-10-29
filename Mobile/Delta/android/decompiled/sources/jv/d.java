package jv;

import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public interface d<T> extends Cloneable {
    void B(f<T> fVar);

    void cancel();

    d<T> clone();

    x<T> execute();

    boolean isCanceled();

    Request request();
}
