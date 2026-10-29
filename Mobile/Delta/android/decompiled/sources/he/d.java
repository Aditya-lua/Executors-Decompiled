package he;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<K, V> implements g0<K, V> {
    @Override // he.g0
    public abstract Map<K, Collection<V>> a();

    public boolean b(Object obj, Object obj2) {
        Collection<V> collection = a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean equals(Object obj) {
        return h0.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
