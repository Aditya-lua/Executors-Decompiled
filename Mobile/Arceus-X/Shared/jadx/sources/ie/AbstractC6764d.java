package ie;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: ie.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6764d<K, V> implements InterfaceC6771g0<K, V> {
    @Override // ie.InterfaceC6771g0
    /* JADX INFO: renamed from: a */
    public abstract Map<K, Collection<V>> mo28888a();

    /* JADX INFO: renamed from: b */
    public boolean mo28889b(Object obj, Object obj2) {
        Collection<V> collection = mo28888a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean equals(Object obj) {
        return C6773h0.m28910a(this, obj);
    }

    public int hashCode() {
        return mo28888a().hashCode();
    }

    public String toString() {
        return mo28888a().toString();
    }
}
