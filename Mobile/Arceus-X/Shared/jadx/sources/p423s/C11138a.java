package p423s;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public class C11138a<K, V> extends C11139b<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, C11139b.c<K, V>> f39322e = new HashMap<>();

    @Override // p423s.C11139b
    /* JADX INFO: renamed from: b */
    public C11139b.c<K, V> mo41917b(K k10) {
        return this.f39322e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f39322e.containsKey(k10);
    }

    @Override // p423s.C11139b
    /* JADX INFO: renamed from: f */
    public V mo41918f(@NonNull K k10, @NonNull V v5) {
        C11139b.c<K, V> cVarMo41917b = mo41917b(k10);
        if (cVarMo41917b != null) {
            return cVarMo41917b.f39328b;
        }
        this.f39322e.put(k10, m41924e(k10, v5));
        return null;
    }

    @Override // p423s.C11139b
    /* JADX INFO: renamed from: g */
    public V mo41919g(@NonNull K k10) {
        V v5 = (V) super.mo41919g(k10);
        this.f39322e.remove(k10);
        return v5;
    }

    /* JADX INFO: renamed from: h */
    public Map.Entry<K, V> m41920h(K k10) {
        if (contains(k10)) {
            return this.f39322e.get(k10).f39330d;
        }
        return null;
    }
}
