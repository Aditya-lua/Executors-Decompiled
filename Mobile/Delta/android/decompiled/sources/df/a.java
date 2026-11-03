package df;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14644d = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f14645e = new C0282a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f14646a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14647c;

    /* JADX INFO: renamed from: df.a$a, reason: collision with other inner class name */
    public class C0282a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f14644d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        a0.a(bArr.length);
        this.f14646a = new SecretKeySpec(bArr, "AES");
        int blockSize = f14645e.get().getBlockSize();
        this.f14647c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i10;
    }

    @Override // df.q
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrA = u.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, this.b);
        c(bArr, 0, bArr.length, bArr2, this.b, bArrA, true);
        return bArr2;
    }

    @Override // df.q
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f14645e.get();
        byte[] bArr4 = new byte[this.f14647c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f14646a, ivParameterSpec);
        } else {
            cipher.init(2, this.f14646a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
