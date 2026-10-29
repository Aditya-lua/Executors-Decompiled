package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ic */
/* JADX INFO: loaded from: classes.dex */
public final class C2125ic extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final C2125ic f8249b;

    /* JADX INFO: renamed from: a */
    public boolean f8250a;

    static {
        C2125ic c2125ic = new C2125ic();
        f8249b = c2125ic;
        c2125ic.f8250a = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2125ic() {
        this.f8250a = true;
    }

    /* JADX INFO: renamed from: a */
    public static C2125ic m10285a() {
        return f8249b;
    }

    /* JADX INFO: renamed from: i */
    public static int m10286i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC2159kb) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM10578c = C2267qb.m10578c(length, bArr, 0, length);
        if (iM10578c == 0) {
            return 1;
        }
        return iM10578c;
    }

    /* JADX INFO: renamed from: b */
    public final void m10287b(C2125ic c2125ic) {
        m10291j();
        if (c2125ic.isEmpty()) {
            return;
        }
        putAll(c2125ic);
    }

    /* JADX INFO: renamed from: c */
    public final C2125ic m10288c() {
        return isEmpty() ? new C2125ic() : new C2125ic(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m10291j();
        super.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m10289e() {
        this.f8250a = false;
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

    /* JADX INFO: renamed from: f */
    public final boolean m10290f() {
        return this.f8250a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iM10286i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM10286i += m10286i(entry.getValue()) ^ m10286i(entry.getKey());
        }
        return iM10286i;
    }

    /* JADX INFO: renamed from: j */
    public final void m10291j() {
        if (!this.f8250a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m10291j();
        Charset charset = C2267qb.f8595a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m10291j();
        for (Object obj : map.keySet()) {
            Charset charset = C2267qb.f8595a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m10291j();
        return super.remove(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2125ic(Map map) {
        super(map);
        this.f8250a = true;
    }
}
