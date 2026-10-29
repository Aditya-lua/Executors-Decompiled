package cf;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements ye.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final te.b.EnumC0569b f4885d = te.b.EnumC0569b.f31710a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f4886e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f4887a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f4888c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public r(byte[] bArr) throws GeneralSecurityException {
        a0.a(bArr.length);
        this.f4887a = new SecretKeySpec(bArr, "AES");
        c();
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return ((i10 - 1) / 16) + 1;
    }

    public static Cipher d() throws GeneralSecurityException {
        if (f4885d.a()) {
            return f4886e.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public static void e(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // ye.a
    public byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherD = d();
        cipherD.init(1, this.f4887a);
        int iB = b(bArr.length);
        byte[] bArrD = iB * 16 == bArr.length ? e.d(bArr, (iB - 1) * 16, this.b, 0, 16) : e.e(xe.f.a(Arrays.copyOfRange(bArr, (iB - 1) * 16, bArr.length)), this.f4888c);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < iB - 1; i11++) {
            e(bArr2, bArr, i11 * 16, bArr3);
            if (cipherD.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        e(bArr2, bArrD, 0, bArr3);
        if (cipherD.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public final void c() throws GeneralSecurityException {
        Cipher cipherD = d();
        cipherD.init(1, this.f4887a);
        byte[] bArrB = xe.f.b(cipherD.doFinal(new byte[16]));
        this.b = bArrB;
        this.f4888c = xe.f.b(bArrB);
    }
}
