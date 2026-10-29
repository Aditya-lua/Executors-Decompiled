package cf;

import af.C0218f0;
import java.security.GeneralSecurityException;
import p076df.C4583e;
import p515we.C12380l0;
import p515we.C12387p;
import pe.C10214b0;
import pe.C10229j;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: cf.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1650o implements InterfaceC10245z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10245z f6378a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6379b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6380c;

    public C1650o(InterfaceC10245z interfaceC10245z, byte[] bArr, byte[] bArr2) {
        this.f6378a = interfaceC10245z;
        this.f6379b = bArr;
        this.f6380c = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m8298b(C12387p c12387p) throws GeneralSecurityException {
        C12380l0 c12380l0M46419b = c12387p.m46419b(C10229j.m39322a());
        return new C1650o((InterfaceC10245z) C10214b0.m39300c(C0218f0.m720h0().m728D(c12380l0M46419b.m46396f()).m729E(c12380l0M46419b.m46397g()).m727C(c12380l0M46419b.m46394d()).build(), InterfaceC10245z.class), C1651p.m8301d(c12380l0M46419b), C1651p.m8300c(c12380l0M46419b));
    }

    @Override // pe.InterfaceC10245z
    /* JADX INFO: renamed from: a */
    public byte[] mo7287a(byte[] bArr) {
        byte[] bArr2 = this.f6380c;
        byte[] bArrMo7287a = bArr2.length == 0 ? this.f6378a.mo7287a(bArr) : this.f6378a.mo7287a(C4583e.m22661a(bArr, bArr2));
        byte[] bArr3 = this.f6379b;
        return bArr3.length == 0 ? bArrMo7287a : C4583e.m22661a(bArr3, bArrMo7287a);
    }
}
