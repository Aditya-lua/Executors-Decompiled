package cf;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class t implements oe.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f4894e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye.a f4895a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4897d;

    public t(ye.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f4895a = aVar;
        this.b = i10;
        this.f4896c = new byte[0];
        this.f4897d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static oe.w c(we.a aVar) {
        return new t(aVar);
    }

    public static oe.w d(we.i iVar) {
        return new t(iVar);
    }

    @Override // oe.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!e.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // oe.w
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f4897d;
        return bArr2.length > 0 ? e.a(this.f4896c, this.f4895a.a(e.a(bArr, bArr2), this.b)) : e.a(this.f4896c, this.f4895a.a(bArr, this.b));
    }

    public t(we.a aVar) {
        this.f4895a = new r(aVar.c().d(oe.j.a()));
        this.b = aVar.e().c();
        this.f4896c = aVar.d().d();
        if (aVar.e().f().equals(we.f.c.f34201d)) {
            byte[] bArr = f4894e;
            this.f4897d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f4897d = new byte[0];
        }
    }

    public t(we.i iVar) {
        this.f4895a = new s("HMAC" + iVar.e().d(), new SecretKeySpec(iVar.c().d(oe.j.a()), "HMAC"));
        this.b = iVar.e().c();
        this.f4896c = iVar.d().d();
        if (iVar.e().g().equals(we.o.d.f34228d)) {
            byte[] bArr = f4894e;
            this.f4897d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f4897d = new byte[0];
        }
    }
}
