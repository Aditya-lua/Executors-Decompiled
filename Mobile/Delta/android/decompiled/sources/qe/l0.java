package qe;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import pe.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements oe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29331a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ye.a f29332c;

    public l0(byte[] bArr, df.a aVar, int i10) {
        this.f29332c = new cf.r(bArr);
        this.f29331a = aVar.d();
        this.b = i10;
    }

    public static oe.a c(k1 k1Var) throws GeneralSecurityException {
        if (k1Var.f().c() < 8 || k1Var.f().c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new l0(k1Var.c().d(oe.j.a()), k1Var.d(), k1Var.f().c());
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = cf.u.a(this.b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, this.b);
        int i10 = this.b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i10 + 12);
        byte[] bArrB = new c0(d(bArrCopyOf)).b(bArrCopyOfRange, bArr, this.f29331a.length + this.b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f29331a;
        System.arraycopy(bArr3, 0, bArrB, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArrB, this.f29331a.length, bArrA.length);
        return bArrB;
    }

    @Override // oe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f29331a;
        if (length < bArr3.length + this.b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ve.s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f29331a.length + this.b;
        int i10 = length2 + 12;
        return new c0(d(Arrays.copyOfRange(bArr, this.f29331a.length, length2))).a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    public final byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f29332c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f29332c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
