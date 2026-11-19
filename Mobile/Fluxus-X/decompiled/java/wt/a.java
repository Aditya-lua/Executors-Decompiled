package wt;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, V, V2> implements d<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, i<V>> f35998a;

    /* JADX INFO: renamed from: wt.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0746a<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, i<V>> f35999a;

        public AbstractC0746a(int i10) {
            this.f35999a = b.c(i10);
        }

        public AbstractC0746a<K, V, V2> a(K k10, i<V> iVar) {
            this.f35999a.put((K) h.c(k10, "key"), (i) h.c(iVar, "provider"));
            return this;
        }
    }

    public a(Map<K, i<V>> map) {
        this.f35998a = Collections.unmodifiableMap(map);
    }

    public final Map<K, i<V>> a() {
        return this.f35998a;
    }
}
