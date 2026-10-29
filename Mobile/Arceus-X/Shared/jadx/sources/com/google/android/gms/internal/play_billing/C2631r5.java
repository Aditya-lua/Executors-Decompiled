package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2631r5 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final C2631r5 f9213b;

    /* JADX INFO: renamed from: a */
    public boolean f9214a;

    static {
        C2631r5 c2631r5 = new C2631r5();
        f9213b = c2631r5;
        c2631r5.f9214a = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2631r5() {
        this.f9214a = true;
    }

    /* JADX INFO: renamed from: a */
    public static C2631r5 m11697a() {
        return f9213b;
    }

    /* JADX INFO: renamed from: i */
    public static int m11698i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC2674v4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM11858b = C2718z4.m11858b(length, bArr, 0, length);
        if (iM11858b == 0) {
            return 1;
        }
        return iM11858b;
    }

    /* JADX INFO: renamed from: b */
    public final C2631r5 m11699b() {
        return isEmpty() ? new C2631r5() : new C2631r5(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m11700c() {
        this.f9214a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11703j();
        super.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m11701e(C2631r5 c2631r5) {
        m11703j();
        if (c2631r5.isEmpty()) {
            return;
        }
        putAll(c2631r5);
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
    public final boolean m11702f() {
        return this.f9214a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iM11698i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM11698i += m11698i(entry.getValue()) ^ m11698i(entry.getKey());
        }
        return iM11698i;
    }

    /* JADX INFO: renamed from: j */
    public final void m11703j() {
        if (!this.f9214a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m11703j();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m11703j();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11703j();
        return super.remove(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2631r5(Map map) {
        super(map);
        this.f9214a = true;
    }
}
