package p136ft;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ft.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5827a<K, V, V2> implements InterfaceC5830d<Map<K, V2>> {

    /* JADX INFO: renamed from: a */
    public final Map<K, InterfaceC5835i<V>> f22226a;

    /* JADX INFO: renamed from: ft.a$a */
    public static abstract class a<K, V, V2> {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap<K, InterfaceC5835i<V>> f22227a;

        public a(int i10) {
            this.f22227a = C5828b.m26176c(i10);
        }

        /* JADX INFO: renamed from: a */
        public a<K, V, V2> m26173a(K k10, InterfaceC5835i<V> interfaceC5835i) {
            this.f22227a.put((K) C5834h.m26192c(k10, "key"), (InterfaceC5835i) C5834h.m26192c(interfaceC5835i, "provider"));
            return this;
        }
    }

    public AbstractC5827a(Map<K, InterfaceC5835i<V>> map) {
        this.f22226a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public final Map<K, InterfaceC5835i<V>> m26172a() {
        return this.f22226a;
    }
}
