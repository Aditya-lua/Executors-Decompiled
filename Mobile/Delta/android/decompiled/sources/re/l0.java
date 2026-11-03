package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import qe.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30282a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ze.a f30283c;

    public l0(byte[] bArr, ef.a aVar, int i10) {
        this.f30283c = new df.r(bArr);
        this.f30282a = aVar.d();
        this.b = i10;
    }

    public static pe.a c(k1 k1Var) throws GeneralSecurityException {
        if (k1Var.f().c() < 8 || k1Var.f().c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new l0(k1Var.c().d(pe.j.a()), k1Var.d(), k1Var.f().c());
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = df.u.a(this.b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, this.b);
        int i10 = this.b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i10 + 12);
        byte[] bArrB = new c0(d(bArrCopyOf)).b(bArrCopyOfRange, bArr, this.f30282a.length + this.b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f30282a;
        System.arraycopy(bArr3, 0, bArrB, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArrB, this.f30282a.length, bArrA.length);
        return bArrB;
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f30282a;
        if (length < bArr3.length + this.b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!we.s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f30282a.length + this.b;
        int i10 = length2 + 12;
        return new c0(d(Arrays.copyOfRange(bArr, this.f30282a.length, length2))).a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
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
        System.arraycopy(this.f30283c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f30283c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
