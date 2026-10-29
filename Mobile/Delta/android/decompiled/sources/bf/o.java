package bf;

import java.security.GeneralSecurityException;
import ve.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements oe.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.z f4150a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4151c;

    public o(oe.z zVar, byte[] bArr, byte[] bArr2) {
        this.f4150a = zVar;
        this.b = bArr;
        this.f4151c = bArr2;
    }

    public static oe.z b(ve.p pVar) throws GeneralSecurityException {
        l0 l0VarB = pVar.b(oe.j.a());
        return new o((oe.z) oe.b0.d(ze.f0.h0().D(l0VarB.f()).E(l0VarB.g()).C(l0VarB.d()).build(), oe.z.class), p.d(l0VarB), p.c(l0VarB));
    }

    @Override // oe.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f4151c;
        byte[] bArrA = bArr2.length == 0 ? this.f4150a.a(bArr) : this.f4150a.a(cf.e.a(bArr, bArr2));
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrA : cf.e.a(bArr3, bArrA);
    }
}
