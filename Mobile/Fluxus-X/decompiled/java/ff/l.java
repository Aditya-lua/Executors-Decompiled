package ff;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements re.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f16042a;
    public final re.w b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16044d;

    public l(q qVar, re.w wVar, int i10, byte[] bArr) {
        this.f16042a = qVar;
        this.b = wVar;
        this.f16043c = i10;
        this.f16044d = bArr;
    }

    public static re.a c(se.f fVar) {
        return new l(new a(fVar.c().d(re.j.a()), fVar.f().f()), new t(new s("HMAC" + fVar.f().d(), new SecretKeySpec(fVar.d().d(re.j.a()), "HMAC")), fVar.f().g()), fVar.f().g(), fVar.e().d());
    }

    @Override // re.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f16042a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return e.a(this.f16044d, bArrA, this.b.b(e.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // re.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f16043c;
        byte[] bArr3 = this.f16044d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f16044d.length, bArr.length - this.f16043c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f16043c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, e.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f16042a.b(bArrCopyOfRange);
    }
}
