package cf;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements oe.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final te.b.EnumC0569b f4850e = te.b.EnumC0569b.f31710a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4851a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4853d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f4854a;
        public final byte[] b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f4854a = bArr;
            this.b = bArr2;
        }

        public static a c() {
            return d(u.a(32));
        }

        public static a d(byte[] bArr) {
            if (bArr.length == 32) {
                return new a(ve.e.v(ve.e.j(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] a() {
            byte[] bArr = this.b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] b() {
            byte[] bArr = this.f4854a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!f4850e.a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrJ = ve.e.j(bArr);
        this.f4851a = bArrJ;
        this.b = ve.e.v(bArrJ);
        this.f4852c = bArr2;
        this.f4853d = bArr3;
    }

    public static oe.z b(af.j jVar) {
        return new i(jVar.f().d(oe.j.a()), jVar.b().d(), jVar.e().c().equals(af.i.a.f419d) ? new byte[]{0} : new byte[0]);
    }

    @Override // oe.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f4853d;
        byte[] bArrC = bArr2.length == 0 ? c(bArr) : c(e.a(bArr, bArr2));
        byte[] bArr3 = this.f4852c;
        return bArr3.length == 0 ? bArrC : e.a(bArr3, bArrC);
    }

    public final byte[] c(byte[] bArr) {
        return ve.e.x(bArr, this.b, this.f4851a);
    }
}
