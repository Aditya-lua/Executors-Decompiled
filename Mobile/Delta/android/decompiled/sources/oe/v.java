package oe;

/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static p a(r rVar, a aVar, byte[] bArr) {
        return p.w(rVar, aVar, bArr);
    }

    public static p b(r rVar, d0 d0Var) {
        if (d0Var != null) {
            return d.a(rVar);
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void c(p pVar, s sVar, a aVar, byte[] bArr) {
        pVar.C(sVar, aVar, bArr);
    }

    public static void d(p pVar, s sVar, d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        d.b(pVar, sVar);
    }
}
