package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {
    public static final m0<?, ?> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8512a;

    static {
        m0<?, ?> m0Var = new m0<>();
        b = m0Var;
        m0Var.n();
    }

    public m0() {
        this.f8512a = true;
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
            return a0.d((byte[]) obj);
        }
        if (obj instanceof a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            a0.a(obj);
            a0.a(map.get(obj));
        }
    }

    public static <K, V> m0<K, V> e() {
        return (m0<K, V>) b;
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
        return this.f8512a;
    }

    public void n() {
        this.f8512a = false;
    }

    public void o(m0<K, V> m0Var) {
        f();
        if (m0Var.isEmpty()) {
            return;
        }
        putAll(m0Var);
    }

    public m0<K, V> p() {
        return isEmpty() ? new m0<>() : new m0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        f();
        a0.a(k10);
        a0.a(v5);
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

    public m0(Map<K, V> map) {
        super(map);
        this.f8512a = true;
    }
}
