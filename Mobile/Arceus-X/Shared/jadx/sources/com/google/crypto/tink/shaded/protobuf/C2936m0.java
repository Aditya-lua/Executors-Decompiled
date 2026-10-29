package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2936m0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final C2936m0<?, ?> f10946b;

    /* JADX INFO: renamed from: a */
    public boolean f10947a;

    static {
        C2936m0<?, ?> c2936m0 = new C2936m0<>();
        f10946b = c2936m0;
        c2936m0.m13980n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2936m0() {
        this.f10947a = true;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m13972a(Map<K, V> map) {
        int iM13973b = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iM13973b += m13973b(entry.getValue()) ^ m13973b(entry.getKey());
        }
        return iM13973b;
    }

    /* JADX INFO: renamed from: b */
    public static int m13973b(Object obj) {
        if (obj instanceof byte[]) {
            return C2900a0.m13382d((byte[]) obj);
        }
        if (obj instanceof C2900a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public static void m13974c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C2900a0.m13379a(obj);
            C2900a0.m13379a(map.get(obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> C2936m0<K, V> m13975e() {
        return (C2936m0<K, V>) f10946b;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m13976i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> boolean m13977j(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m13976i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m13978f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m13977j(this, (Map) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m13978f() {
        if (!m13979k()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m13972a(this);
    }

    /* JADX INFO: renamed from: k */
    public boolean m13979k() {
        return this.f10947a;
    }

    /* JADX INFO: renamed from: n */
    public void m13980n() {
        this.f10947a = false;
    }

    /* JADX INFO: renamed from: o */
    public void m13981o(C2936m0<K, V> c2936m0) {
        m13978f();
        if (c2936m0.isEmpty()) {
            return;
        }
        putAll(c2936m0);
    }

    /* JADX INFO: renamed from: p */
    public C2936m0<K, V> m13982p() {
        return isEmpty() ? new C2936m0<>() : new C2936m0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        m13978f();
        C2900a0.m13379a(k10);
        C2900a0.m13379a(v5);
        return (V) super.put(k10, v5);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m13978f();
        m13974c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m13978f();
        return (V) super.remove(obj);
    }

    public C2936m0(Map<K, V> map) {
        super(map);
        this.f10947a = true;
    }
}
