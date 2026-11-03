package dt;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, V, V2> implements d<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, i<V>> f15420a;

    /* JADX INFO: renamed from: dt.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0290a<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, i<V>> f15421a;

        public AbstractC0290a(int i10) {
            this.f15421a = b.c(i10);
        }

        public AbstractC0290a<K, V, V2> a(K k10, i<V> iVar) {
            this.f15421a.put((K) h.c(k10, "key"), (i) h.c(iVar, "provider"));
            return this;
        }
    }

    public a(Map<K, i<V>> map) {
        this.f15420a = Collections.unmodifiableMap(map);
    }

    public final Map<K, i<V>> a() {
        return this.f15420a;
    }
}
