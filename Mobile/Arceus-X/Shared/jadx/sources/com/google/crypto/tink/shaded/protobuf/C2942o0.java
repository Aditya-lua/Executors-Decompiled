package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2942o0 implements InterfaceC2939n0 {
    /* JADX INFO: renamed from: i */
    public static <K, V> int m14015i(int i10, Object obj, Object obj2) {
        C2936m0 c2936m0 = (C2936m0) obj;
        C2933l0 c2933l0 = (C2933l0) obj2;
        int iM13954a = 0;
        if (c2936m0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c2936m0.entrySet()) {
            iM13954a += c2933l0.m13954a(i10, entry.getKey(), entry.getValue());
        }
        return iM13954a;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> C2936m0<K, V> m14016j(Object obj, Object obj2) {
        C2936m0<K, V> c2936m0M13982p = (C2936m0) obj;
        C2936m0<K, V> c2936m0 = (C2936m0) obj2;
        if (!c2936m0.isEmpty()) {
            if (!c2936m0M13982p.m13979k()) {
                c2936m0M13982p = c2936m0M13982p.m13982p();
            }
            c2936m0M13982p.m13981o(c2936m0);
        }
        return c2936m0M13982p;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: a */
    public Object mo13984a(Object obj, Object obj2) {
        return m14016j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: b */
    public C2933l0.a<?, ?> mo13985b(Object obj) {
        ((C2933l0) obj).m13955c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: c */
    public Map<?, ?> mo13986c(Object obj) {
        return (C2936m0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: d */
    public Object mo13987d(Object obj) {
        return C2936m0.m13975e().m13982p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: e */
    public Map<?, ?> mo13988e(Object obj) {
        return (C2936m0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: f */
    public Object mo13989f(Object obj) {
        ((C2936m0) obj).m13980n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: g */
    public int mo13990g(int i10, Object obj, Object obj2) {
        return m14015i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2939n0
    /* JADX INFO: renamed from: h */
    public boolean mo13991h(Object obj) {
        return !((C2936m0) obj).m13979k();
    }
}
