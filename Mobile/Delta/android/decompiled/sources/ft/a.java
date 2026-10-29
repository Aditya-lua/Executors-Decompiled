package ft;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, V, V2> implements d<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, i<V>> f17224a;

    /* JADX INFO: renamed from: ft.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0314a<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, i<V>> f17225a;

        public AbstractC0314a(int i10) {
            this.f17225a = b.c(i10);
        }

        public AbstractC0314a<K, V, V2> a(K k10, i<V> iVar) {
            this.f17225a.put((K) h.c(k10, "key"), (i) h.c(iVar, "provider"));
            return this;
        }
    }

    public a(Map<K, i<V>> map) {
        this.f17224a = Collections.unmodifiableMap(map);
    }

    public final Map<K, i<V>> a() {
        return this.f17224a;
    }
}
