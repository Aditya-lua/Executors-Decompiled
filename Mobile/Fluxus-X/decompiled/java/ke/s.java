package ke;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class s<K, V> extends c<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f21420a;
    public final V b;

    public s(K k10, V v8) {
        this.f21420a = k10;
        this.b = v8;
    }

    @Override // ke.c, java.util.Map.Entry
    public final K getKey() {
        return this.f21420a;
    }

    @Override // ke.c, java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v8) {
        throw new UnsupportedOperationException();
    }
}
