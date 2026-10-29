package pe;

/* JADX INFO: renamed from: pe.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C10241v {
    /* JADX INFO: renamed from: a */
    public static C10235p m39400a(InterfaceC10237r interfaceC10237r, InterfaceC10211a interfaceC10211a, byte[] bArr) {
        return C10235p.m39362w(interfaceC10237r, interfaceC10211a, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static C10235p m39401b(InterfaceC10237r interfaceC10237r, C10218d0 c10218d0) {
        if (c10218d0 != null) {
            return C10217d.m39307a(interfaceC10237r);
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    /* JADX INFO: renamed from: c */
    public static void m39402c(C10235p c10235p, InterfaceC10238s interfaceC10238s, InterfaceC10211a interfaceC10211a, byte[] bArr) {
        c10235p.m39365C(interfaceC10238s, interfaceC10211a, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m39403d(C10235p c10235p, InterfaceC10238s interfaceC10238s, C10218d0 c10218d0) {
        if (c10218d0 == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        C10217d.m39308b(c10235p, interfaceC10238s);
    }
}
