package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862n0 implements InterfaceC0859m0 {
    /* JADX INFO: renamed from: i */
    public static <K, V> int m3889i(int i10, Object obj, Object obj2) {
        C0856l0 c0856l0 = (C0856l0) obj;
        C0853k0 c0853k0 = (C0853k0) obj2;
        int iM3856a = 0;
        if (c0856l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c0856l0.entrySet()) {
            iM3856a += c0853k0.m3856a(i10, entry.getKey(), entry.getValue());
        }
        return iM3856a;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> C0856l0<K, V> m3890j(Object obj, Object obj2) {
        C0856l0<K, V> c0856l0M3872p = (C0856l0) obj;
        C0856l0<K, V> c0856l0 = (C0856l0) obj2;
        if (!c0856l0.isEmpty()) {
            if (!c0856l0M3872p.m3869k()) {
                c0856l0M3872p = c0856l0M3872p.m3872p();
            }
            c0856l0M3872p.m3871o(c0856l0);
        }
        return c0856l0M3872p;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: a */
    public Object mo3877a(Object obj, Object obj2) {
        return m3890j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: b */
    public C0853k0.a<?, ?> mo3878b(Object obj) {
        return ((C0853k0) obj).m3857c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: c */
    public Map<?, ?> mo3879c(Object obj) {
        return (C0856l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: d */
    public Object mo3880d(Object obj) {
        return C0856l0.m3865e().m3872p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: e */
    public Map<?, ?> mo3881e(Object obj) {
        return (C0856l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: f */
    public Object mo3882f(Object obj) {
        ((C0856l0) obj).m3870n();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: g */
    public int mo3883g(int i10, Object obj, Object obj2) {
        return m3889i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0859m0
    /* JADX INFO: renamed from: h */
    public boolean mo3884h(Object obj) {
        return !((C0856l0) obj).m3869k();
    }
}
