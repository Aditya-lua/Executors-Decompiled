package ie;

import java.io.Serializable;

/* JADX INFO: renamed from: ie.s */
/* JADX INFO: loaded from: classes2.dex */
public class C6794s<K, V> extends AbstractC6762c<K, V> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final K f26707a;

    /* JADX INFO: renamed from: b */
    public final V f26708b;

    public C6794s(K k10, V v5) {
        this.f26707a = k10;
        this.f26708b = v5;
    }

    @Override // ie.AbstractC6762c, java.util.Map.Entry
    public final K getKey() {
        return this.f26707a;
    }

    @Override // ie.AbstractC6762c, java.util.Map.Entry
    public final V getValue() {
        return this.f26708b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v5) {
        throw new UnsupportedOperationException();
    }
}
