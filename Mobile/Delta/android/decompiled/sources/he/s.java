package he;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class s<K, V> extends c<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f19276a;
    public final V b;

    public s(K k10, V v5) {
        this.f19276a = k10;
        this.b = v5;
    }

    @Override // he.c, java.util.Map.Entry
    public final K getKey() {
        return this.f19276a;
    }

    @Override // he.c, java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v5) {
        throw new UnsupportedOperationException();
    }
}
