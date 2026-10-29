package cf;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements oe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f4867a;
    public final oe.w b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4869d;

    public l(q qVar, oe.w wVar, int i10, byte[] bArr) {
        this.f4867a = qVar;
        this.b = wVar;
        this.f4868c = i10;
        this.f4869d = bArr;
    }

    public static oe.a c(pe.f fVar) {
        return new l(new a(fVar.c().d(oe.j.a()), fVar.f().f()), new t(new s("HMAC" + fVar.f().d(), new SecretKeySpec(fVar.d().d(oe.j.a()), "HMAC")), fVar.f().g()), fVar.f().g(), fVar.e().d());
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f4867a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return e.a(this.f4869d, bArrA, this.b.b(e.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // oe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f4868c;
        byte[] bArr3 = this.f4869d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f4869d.length, bArr.length - this.f4868c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f4868c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, e.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f4867a.b(bArrCopyOfRange);
    }
}
