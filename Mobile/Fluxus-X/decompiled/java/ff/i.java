package ff;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements re.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.b.EnumC0736b f16025e = we.b.EnumC0736b.f35740a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16026a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16028d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f16029a;
        public final byte[] b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f16029a = bArr;
            this.b = bArr2;
        }

        public static a c() {
            return d(u.a(32));
        }

        public static a d(byte[] bArr) {
            if (bArr.length == 32) {
                return new a(ye.e.v(ye.e.j(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] a() {
            byte[] bArr = this.b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] b() {
            byte[] bArr = this.f16029a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!f16025e.a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrJ = ye.e.j(bArr);
        this.f16026a = bArrJ;
        this.b = ye.e.v(bArrJ);
        this.f16027c = bArr2;
        this.f16028d = bArr3;
    }

    public static re.z b(df.j jVar) {
        return new i(jVar.f().d(re.j.a()), jVar.b().d(), jVar.e().c().equals(df.i.a.f12289d) ? new byte[]{0} : new byte[0]);
    }

    @Override // re.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f16028d;
        byte[] bArrC = bArr2.length == 0 ? c(bArr) : c(e.a(bArr, bArr2));
        byte[] bArr3 = this.f16027c;
        return bArr3.length == 0 ? bArrC : e.a(bArr3, bArrC);
    }

    public final byte[] c(byte[] bArr) {
        return ye.e.x(bArr, this.b, this.f16026a);
    }
}
