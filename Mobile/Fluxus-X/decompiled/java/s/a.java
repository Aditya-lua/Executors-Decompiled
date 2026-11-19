package s;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f31097e = new HashMap<>();

    @Override // s.b
    public b.c<K, V> b(K k10) {
        return this.f31097e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f31097e.containsKey(k10);
    }

    @Override // s.b
    public V f(@NonNull K k10, @NonNull V v8) {
        b.c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.b;
        }
        this.f31097e.put(k10, e(k10, v8));
        return null;
    }

    @Override // s.b
    public V g(@NonNull K k10) {
        V v8 = (V) super.g(k10);
        this.f31097e.remove(k10);
        return v8;
    }

    public Map.Entry<K, V> h(K k10) {
        if (contains(k10)) {
            return this.f31097e.get(k10).f31103d;
        }
        return null;
    }
}
