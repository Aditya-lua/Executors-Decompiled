package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p076df.C4596r;
import p076df.C4599u;
import p102ef.C5109a;
import p379qe.C10537k1;
import p515we.C12394s0;
import p602ze.InterfaceC13793a;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: re.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10839l0 implements InterfaceC10211a {

    /* JADX INFO: renamed from: a */
    public final byte[] f38558a;

    /* JADX INFO: renamed from: b */
    public final int f38559b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13793a f38560c;

    public C10839l0(byte[] bArr, C5109a c5109a, int i10) {
        this.f38560c = new C4596r(bArr);
        this.f38558a = c5109a.m23850d();
        this.f38559b = i10;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m41258c(C10537k1 c10537k1) throws GeneralSecurityException {
        if (c10537k1.m40407f().m40440c() < 8 || c10537k1.m40407f().m40440c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new C10839l0(c10537k1.m40405c().m23856d(C10229j.m39322a()), c10537k1.m40406d(), c10537k1.m40407f().m40440c());
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrM22724a = C4599u.m22724a(this.f38559b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrM22724a, this.f38559b);
        int i10 = this.f38559b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM22724a, i10, i10 + 12);
        byte[] bArrM41205b = new C10821c0(m41259d(bArrCopyOf)).m41205b(bArrCopyOfRange, bArr, this.f38558a.length + this.f38559b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f38558a;
        System.arraycopy(bArr3, 0, bArrM41205b, 0, bArr3.length);
        System.arraycopy(bArrM22724a, 0, bArrM41205b, this.f38558a.length, bArrM22724a.length);
        return bArrM41205b;
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f38558a;
        if (length < bArr3.length + this.f38559b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f38558a.length + this.f38559b;
        int i10 = length2 + 12;
        return new C10821c0(m41259d(Arrays.copyOfRange(bArr, this.f38558a.length, length2))).m41204a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m41259d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f38560c.mo22714a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f38560c.mo22714a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
