package p136ft;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ft.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5833g<K, V> extends AbstractC5827a<K, V, V> {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5835i<Map<Object, Object>> f22234b = C5831e.m26182a(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: ft.g$b */
    public static final class b<K, V> extends AbstractC5827a.a<K, V, V> {
        /* JADX INFO: renamed from: b */
        public C5833g<K, V> m26188b() {
            return new C5833g<>(this.f22227a);
        }

        /* JADX INFO: renamed from: c */
        public b<K, V> m26189c(K k10, InterfaceC5835i<V> interfaceC5835i) {
            super.m26173a(k10, interfaceC5835i);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> b<K, V> m26186b(int i10) {
        return new b<>(i10);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapM26176c = C5828b.m26176c(m26172a().size());
        for (Map.Entry<K, InterfaceC5835i<V>> entry : m26172a().entrySet()) {
            linkedHashMapM26176c.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapM26176c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5833g(Map<K, InterfaceC5835i<V>> map) {
        super(map);
    }
}
