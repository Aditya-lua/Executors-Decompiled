package p076df;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import p102ef.C5109a;
import p379qe.C10553q;
import p465ue.C11844b;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;
import re.C10836k;

/* JADX INFO: renamed from: df.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4581c implements InterfaceC10211a {

    /* JADX INFO: renamed from: c */
    public static final C11844b.b f18734c = C11844b.b.f41602b;

    /* JADX INFO: renamed from: a */
    public final SecretKey f18735a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18736b;

    public C4581c(byte[] bArr, C5109a c5109a) throws GeneralSecurityException {
        if (!f18734c.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f18735a = C10836k.m41249c(bArr);
        this.f18736b = c5109a.m23850d();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m22654c(C10553q c10553q) throws GeneralSecurityException {
        if (c10553q.m40460e().m40496c() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + c10553q.m40460e().m40496c());
        }
        if (c10553q.m40460e().m40498e() == 16) {
            return new C4581c(c10553q.m40458c().m23856d(C10229j.m39322a()), c10553q.m40459d());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + c10553q.m40460e().m40498e());
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrM22724a = C4599u.m22724a(12);
        AlgorithmParameterSpec algorithmParameterSpecM41247a = C10836k.m41247a(bArrM22724a);
        Cipher cipherM41250d = C10836k.m41250d();
        cipherM41250d.init(1, this.f18735a, algorithmParameterSpecM41247a);
        if (bArr2 != null && bArr2.length != 0) {
            cipherM41250d.updateAAD(bArr2);
        }
        int outputSize = cipherM41250d.getOutputSize(bArr.length);
        byte[] bArr3 = this.f18736b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrM22724a, 0, bArrCopyOf, this.f18736b.length, 12);
        if (cipherM41250d.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f18736b.length + 12) == outputSize) {
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
        byte[] bArr3 = this.f18736b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecM41248b = C10836k.m41248b(bArr, this.f18736b.length, 12);
        Cipher cipherM41250d = C10836k.m41250d();
        cipherM41250d.init(2, this.f18735a, algorithmParameterSpecM41248b);
        if (bArr2 != null && bArr2.length != 0) {
            cipherM41250d.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f18736b;
        return cipherM41250d.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
