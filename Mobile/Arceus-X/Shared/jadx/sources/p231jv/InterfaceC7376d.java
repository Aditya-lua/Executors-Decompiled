package p231jv;

import okhttp3.Request;

/* JADX INFO: renamed from: jv.d */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7376d<T> extends Cloneable {
    /* JADX INFO: renamed from: B */
    void mo30571B(InterfaceC7378f<T> interfaceC7378f);

    void cancel();

    InterfaceC7376d<T> clone();

    C7396x<T> execute();

    boolean isCanceled();

    Request request();
}
