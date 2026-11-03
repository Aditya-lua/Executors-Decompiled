package df;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements pe.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14688e = ue.b.EnumC0590b.f32770a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14689a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14691d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f14692a;
        public final byte[] b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f14692a = bArr;
            this.b = bArr2;
        }

        public static a c() {
            return d(u.a(32));
        }

        public static a d(byte[] bArr) {
            if (bArr.length == 32) {
                return new a(we.e.v(we.e.j(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] a() {
            byte[] bArr = this.b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] b() {
            byte[] bArr = this.f14692a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!f14688e.a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrJ = we.e.j(bArr);
        this.f14689a = bArrJ;
        this.b = we.e.v(bArrJ);
        this.f14690c = bArr2;
        this.f14691d = bArr3;
    }

    public static pe.z b(bf.j jVar) {
        return new i(jVar.f().d(pe.j.a()), jVar.b().d(), jVar.e().c().equals(bf.i.a.f4091d) ? new byte[]{0} : new byte[0]);
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f14691d;
        byte[] bArrC = bArr2.length == 0 ? c(bArr) : c(e.a(bArr, bArr2));
        byte[] bArr3 = this.f14690c;
        return bArr3.length == 0 ? bArrC : e.a(bArr3, bArrC);
    }

    public final byte[] c(byte[] bArr) {
        return we.e.x(bArr, this.b, this.f14689a);
    }
}
