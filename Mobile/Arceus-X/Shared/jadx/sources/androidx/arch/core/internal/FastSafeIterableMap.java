package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected SafeIterableMap.Entry<K, V> get(K k10) {
        return this.mHashMap.get(k10);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K key, @NonNull V v5) {
        SafeIterableMap.Entry<K, V> current = get(key);
        if (current != null) {
            return current.mValue;
        }
        this.mHashMap.put(key, put(key, v5));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k10) {
        V v5 = (V) super.remove(k10);
        this.mHashMap.remove(k10);
        return v5;
    }

    public boolean contains(K key) {
        return this.mHashMap.containsKey(key);
    }

    public Map.Entry<K, V> ceil(K k10) {
        if (contains(k10)) {
            return this.mHashMap.get(k10).mPrevious;
        }
        return null;
    }
}
