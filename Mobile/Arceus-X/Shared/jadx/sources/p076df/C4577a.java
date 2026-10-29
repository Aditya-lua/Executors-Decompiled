package p076df;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p465ue.C11844b;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4577a implements InterfaceC4595q {

    /* JADX INFO: renamed from: d */
    public static final C11844b.b f18716d = C11844b.b.f41602b;

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<Cipher> f18717e = new a();

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f18718a;

    /* JADX INFO: renamed from: b */
    public final int f18719b;

    /* JADX INFO: renamed from: c */
    public final int f18720c;

    /* JADX INFO: renamed from: df.a$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C4591m.f18797b.m22699a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C4577a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f18716d.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4578a0.m22637a(bArr.length);
        this.f18718a = new SecretKeySpec(bArr, "AES");
        int blockSize = f18717e.get().getBlockSize();
        this.f18720c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f18719b = i10;
    }

    @Override // p076df.InterfaceC4595q
    /* JADX INFO: renamed from: a */
    public byte[] mo22633a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f18719b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f18719b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrM22724a = C4599u.m22724a(i10);
        System.arraycopy(bArrM22724a, 0, bArr2, 0, this.f18719b);
        m22635c(bArr, 0, bArr.length, bArr2, this.f18719b, bArrM22724a, true);
        return bArr2;
    }

    @Override // p076df.InterfaceC4595q
    /* JADX INFO: renamed from: b */
    public byte[] mo22634b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f18719b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f18719b;
        byte[] bArr3 = new byte[length2 - i11];
        m22635c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    /* JADX INFO: renamed from: c */
    public final void m22635c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f18717e.get();
        byte[] bArr4 = new byte[this.f18720c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f18719b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f18718a, ivParameterSpec);
        } else {
            cipher.init(2, this.f18718a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
