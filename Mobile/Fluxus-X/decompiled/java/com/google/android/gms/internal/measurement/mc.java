package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mc extends LinkedHashMap {
    public static final mc b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6619a;

    static {
        mc mcVar = new mc();
        b = mcVar;
        mcVar.f6619a = false;
    }

    public mc() {
        this.f6619a = true;
    }

    public static mc a() {
        return b;
    }

    public static int i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ob) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iC = ub.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final void b(mc mcVar) {
        k();
        if (mcVar.isEmpty()) {
            return;
        }
        putAll(mcVar);
    }

    public final mc c() {
        return isEmpty() ? new mc() : new mc(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    public final void e() {
        this.f6619a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f6619a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += i(entry.getValue()) ^ i(entry.getKey());
        }
        return i10;
    }

    public final void k() {
        if (!this.f6619a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        Charset charset = ub.f6869a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        k();
        for (Object obj : map.keySet()) {
            Charset charset = ub.f6869a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    public mc(Map map) {
        super(map);
        this.f6619a = true;
    }
}
