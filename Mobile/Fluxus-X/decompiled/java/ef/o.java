package ef;

import java.security.GeneralSecurityException;
import ye.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements re.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.z f13424a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13425c;

    public o(re.z zVar, byte[] bArr, byte[] bArr2) {
        this.f13424a = zVar;
        this.b = bArr;
        this.f13425c = bArr2;
    }

    public static re.z b(ye.p pVar) throws GeneralSecurityException {
        l0 l0VarB = pVar.b(re.j.a());
        return new o((re.z) re.b0.c(cf.f0.h0().F(l0VarB.f()).G(l0VarB.g()).D(l0VarB.d()).build(), re.z.class), p.d(l0VarB), p.c(l0VarB));
    }

    @Override // re.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f13425c;
        byte[] bArrA = bArr2.length == 0 ? this.f13424a.a(bArr) : this.f13424a.a(ff.e.a(bArr, bArr2));
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrA : ff.e.a(bArr3, bArrA);
    }
}
