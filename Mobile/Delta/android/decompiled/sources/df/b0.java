package df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import qe.p1;
import re.i0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f14657a;
    public final byte[] b;

    public b0(byte[] bArr, byte[] bArr2) {
        this.f14657a = new i0(bArr);
        this.b = bArr2;
    }

    public static pe.a c(p1 p1Var) {
        return new b0(p1Var.c().d(pe.j.a()), p1Var.d().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f14657a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = u.a(24);
        byteBufferAllocate.put(bArrA);
        this.f14657a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrE : e.a(bArr3, bArrE);
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (s0.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
