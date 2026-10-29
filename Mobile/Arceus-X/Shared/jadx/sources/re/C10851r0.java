package re;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p076df.C4599u;
import p379qe.C10552p1;
import p465ue.C11844b;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: re.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10851r0 implements InterfaceC10211a {

    /* JADX INFO: renamed from: c */
    public static final C11844b.b f38573c = C11844b.b.f41601a;

    /* JADX INFO: renamed from: a */
    public final byte[] f38574a;

    /* JADX INFO: renamed from: b */
    public final byte[] f38575b;

    public C10851r0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f38573c.mo44243a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!m41287e()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f38574a = bArr;
        this.f38575b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m41285c(C10552p1 c10552p1) {
        return new C10851r0(c10552p1.m40454c().m23856d(C10229j.m39322a()), c10552p1.m40455d().m23850d());
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m41286d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m41287e() {
        return C10858v.m41302e() != null;
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrM22724a = C4599u.m22724a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(C10819b0.m41196a(this.f38574a, bArrM22724a), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(m41286d(bArrM22724a));
        Cipher cipherM41302e = C10858v.m41302e();
        cipherM41302e.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherM41302e.updateAAD(bArr2);
        }
        int outputSize = cipherM41302e.getOutputSize(bArr.length);
        byte[] bArr3 = this.f38575b;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(bArrM22724a, 0, bArrCopyOf, this.f38575b.length, 24);
        if (cipherM41302e.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f38575b.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f38575b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f38575b.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(C10819b0.m41196a(this.f38574a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(m41286d(bArr4));
        Cipher cipherM41302e = C10858v.m41302e();
        cipherM41302e.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherM41302e.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f38575b;
        return cipherM41302e.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }
}
