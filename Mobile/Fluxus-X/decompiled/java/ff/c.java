package ff;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements re.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.b.EnumC0736b f15995c = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f15996a;
    public final byte[] b;

    public c(byte[] bArr, gf.a aVar) throws GeneralSecurityException {
        if (!f15995c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f15996a = te.k.c(bArr);
        this.b = aVar.d();
    }

    public static re.a c(se.q qVar) throws GeneralSecurityException {
        if (qVar.e().c() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + qVar.e().c());
        }
        if (qVar.e().e() == 16) {
            return new c(qVar.c().d(re.j.a()), qVar.d());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + qVar.e().e());
    }

    @Override // re.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = u.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = te.k.a(bArrA);
        Cipher cipherD = te.k.d();
        cipherD.init(1, this.f15996a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.b.length, 12);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // re.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = te.k.b(bArr, this.b.length, 12);
        Cipher cipherD = te.k.d();
        cipherD.init(2, this.f15996a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr4 = this.b;
        return cipherD.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
