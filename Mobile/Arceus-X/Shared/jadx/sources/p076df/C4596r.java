package p076df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p465ue.C11844b;
import p602ze.InterfaceC13793a;
import ye.C13178f;

/* JADX INFO: renamed from: df.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C4596r implements InterfaceC13793a {

    /* JADX INFO: renamed from: d */
    public static final C11844b.b f18814d = C11844b.b.f41601a;

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<Cipher> f18815e = new a();

    /* JADX INFO: renamed from: a */
    public final SecretKey f18816a;

    /* JADX INFO: renamed from: b */
    public byte[] f18817b;

    /* JADX INFO: renamed from: c */
    public byte[] f18818c;

    /* JADX INFO: renamed from: df.r$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C4591m.f18797b.m22699a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C4596r(byte[] bArr) throws GeneralSecurityException {
        C4578a0.m22637a(bArr.length);
        this.f18816a = new SecretKeySpec(bArr, "AES");
        m22715c();
    }

    /* JADX INFO: renamed from: b */
    public static int m22711b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return ((i10 - 1) / 16) + 1;
    }

    /* JADX INFO: renamed from: d */
    public static Cipher m22712d() throws GeneralSecurityException {
        if (f18814d.mo44243a()) {
            return f18815e.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* JADX INFO: renamed from: e */
    public static void m22713e(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // p602ze.InterfaceC13793a
    /* JADX INFO: renamed from: a */
    public byte[] mo22714a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherM22712d = m22712d();
        cipherM22712d.init(1, this.f18816a);
        int iM22711b = m22711b(bArr.length);
        byte[] bArrM22664d = iM22711b * 16 == bArr.length ? C4583e.m22664d(bArr, (iM22711b - 1) * 16, this.f18817b, 0, 16) : C4583e.m22665e(C13178f.m48789a(Arrays.copyOfRange(bArr, (iM22711b - 1) * 16, bArr.length)), this.f18818c);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < iM22711b - 1; i11++) {
            m22713e(bArr2, bArr, i11 * 16, bArr3);
            if (cipherM22712d.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        m22713e(bArr2, bArrM22664d, 0, bArr3);
        if (cipherM22712d.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    /* JADX INFO: renamed from: c */
    public final void m22715c() throws GeneralSecurityException {
        Cipher cipherM22712d = m22712d();
        cipherM22712d.init(1, this.f18816a);
        byte[] bArrM48790b = C13178f.m48790b(cipherM22712d.doFinal(new byte[16]));
        this.f18817b = bArrM48790b;
        this.f18818c = C13178f.m48790b(bArrM48790b);
    }
}
