package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l0<K, V> extends LinkedHashMap<K, V> {
    public static final l0<?, ?> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2243a;

    static {
        l0<?, ?> l0Var = new l0<>();
        b = l0Var;
        l0Var.n();
    }

    public l0() {
        this.f2243a = true;
    }

    public static <K, V> int a(Map<K, V> map) {
        int iB = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return z.d((byte[]) obj);
        }
        if (obj instanceof z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            z.a(obj);
            z.a(map.get(obj));
        }
    }

    public static <K, V> l0<K, V> e() {
        return (l0<K, V>) b;
    }

    public static boolean i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static <K, V> boolean j(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && j(this, (Map) obj);
    }

    public final void f() {
        if (!k()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean k() {
        return this.f2243a;
    }

    public void n() {
        this.f2243a = false;
    }

    public void o(l0<K, V> l0Var) {
        f();
        if (l0Var.isEmpty()) {
            return;
        }
        putAll(l0Var);
    }

    public l0<K, V> p() {
        return isEmpty() ? new l0<>() : new l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        f();
        z.a(k10);
        z.a(v5);
        return (V) super.put(k10, v5);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }

    public l0(Map<K, V> map) {
        super(map);
        this.f2243a = true;
    }
}
