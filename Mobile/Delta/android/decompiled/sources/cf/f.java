package cf;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import qe.f0;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements oe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f4829a;
    public final byte[] b;

    public f(byte[] bArr, byte[] bArr2) {
        this.f4829a = new f0(bArr);
        this.b = bArr2;
    }

    public static oe.a c(pe.a0 a0Var) {
        return new f(a0Var.c().d(oe.j.a()), a0Var.d().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f4829a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = u.a(12);
        byteBufferAllocate.put(bArrA);
        this.f4829a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrE : e.a(bArr3, bArrE);
    }

    @Override // oe.a
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
