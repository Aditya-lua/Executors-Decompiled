package qe;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final te.b.EnumC0569b b = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f29314a;

    public c0(byte[] bArr) throws GeneralSecurityException {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f29314a = k.c(bArr);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = k.a(bArr);
        Cipher cipherD = k.d();
        cipherD.init(2, this.f29314a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        return cipherD.doFinal(bArr2, i10, bArr2.length - i10);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = k.a(bArr);
        Cipher cipherD = k.d();
        cipherD.init(1, this.f29314a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        int outputSize = cipherD.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i10 + outputSize];
        if (cipherD.doFinal(bArr2, 0, bArr2.length, bArr4, i10) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
