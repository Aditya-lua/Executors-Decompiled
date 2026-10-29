package re;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import p465ue.C11844b;

/* JADX INFO: renamed from: re.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10821c0 {

    /* JADX INFO: renamed from: b */
    public static final C11844b.b f38534b = C11844b.b.f41602b;

    /* JADX INFO: renamed from: a */
    public final SecretKey f38535a;

    public C10821c0(byte[] bArr) throws GeneralSecurityException {
        if (!f38534b.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f38535a = C10836k.m41249c(bArr);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m41204a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM41247a = C10836k.m41247a(bArr);
        Cipher cipherM41250d = C10836k.m41250d();
        cipherM41250d.init(2, this.f38535a, algorithmParameterSpecM41247a);
        if (bArr3 != null && bArr3.length != 0) {
            cipherM41250d.updateAAD(bArr3);
        }
        return cipherM41250d.doFinal(bArr2, i10, bArr2.length - i10);
    }

    /* JADX INFO: renamed from: b */
    public byte[] m41205b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecM41247a = C10836k.m41247a(bArr);
        Cipher cipherM41250d = C10836k.m41250d();
        cipherM41250d.init(1, this.f38535a, algorithmParameterSpecM41247a);
        if (bArr3 != null && bArr3.length != 0) {
            cipherM41250d.updateAAD(bArr3);
        }
        int outputSize = cipherM41250d.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i10 + outputSize];
        if (cipherM41250d.doFinal(bArr2, 0, bArr2.length, bArr4, i10) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
