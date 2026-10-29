package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0856l0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final C0856l0<?, ?> f2951b;

    /* JADX INFO: renamed from: a */
    public boolean f2952a;

    static {
        C0856l0<?, ?> c0856l0 = new C0856l0<>();
        f2951b = c0856l0;
        c0856l0.m3870n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0856l0() {
        this.f2952a = true;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m3862a(Map<K, V> map) {
        int iM3863b = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iM3863b += m3863b(entry.getValue()) ^ m3863b(entry.getKey());
        }
        return iM3863b;
    }

    /* JADX INFO: renamed from: b */
    public static int m3863b(Object obj) {
        if (obj instanceof byte[]) {
            return C0892z.m4239d((byte[]) obj);
        }
        if (obj instanceof C0892z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public static void m3864c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C0892z.m4236a(obj);
            C0892z.m4236a(map.get(obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> C0856l0<K, V> m3865e() {
        return (C0856l0<K, V>) f2951b;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3866i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> boolean m3867j(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m3866i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m3868f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m3867j(this, (Map) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m3868f() {
        if (!m3869k()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m3862a(this);
    }

    /* JADX INFO: renamed from: k */
    public boolean m3869k() {
        return this.f2952a;
    }

    /* JADX INFO: renamed from: n */
    public void m3870n() {
        this.f2952a = false;
    }

    /* JADX INFO: renamed from: o */
    public void m3871o(C0856l0<K, V> c0856l0) {
        m3868f();
        if (c0856l0.isEmpty()) {
            return;
        }
        putAll(c0856l0);
    }

    /* JADX INFO: renamed from: p */
    public C0856l0<K, V> m3872p() {
        return isEmpty() ? new C0856l0<>() : new C0856l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        m3868f();
        C0892z.m4236a(k10);
        C0892z.m4236a(v5);
        return (V) super.put(k10, v5);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m3868f();
        m3864c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m3868f();
        return (V) super.remove(obj);
    }

    public C0856l0(Map<K, V> map) {
        super(map);
        this.f2952a = true;
    }
}
