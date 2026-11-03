package df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class t implements pe.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f14732e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ze.a f14733a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14735d;

    public t(ze.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f14733a = aVar;
        this.b = i10;
        this.f14734c = new byte[0];
        this.f14735d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static pe.w c(xe.a aVar) {
        return new t(aVar);
    }

    public static pe.w d(xe.i iVar) {
        return new t(iVar);
    }

    @Override // pe.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!e.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // pe.w
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f14735d;
        return bArr2.length > 0 ? e.a(this.f14734c, this.f14733a.a(e.a(bArr, bArr2), this.b)) : e.a(this.f14734c, this.f14733a.a(bArr, this.b));
    }

    public t(xe.a aVar) {
        this.f14733a = new r(aVar.c().d(pe.j.a()));
        this.b = aVar.e().c();
        this.f14734c = aVar.d().d();
        if (aVar.e().f().equals(xe.f.c.f35700d)) {
            byte[] bArr = f14732e;
            this.f14735d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f14735d = new byte[0];
        }
    }

    public t(xe.i iVar) {
        this.f14733a = new s("HMAC" + iVar.e().d(), new SecretKeySpec(iVar.c().d(pe.j.a()), "HMAC"));
        this.b = iVar.e().c();
        this.f14734c = iVar.d().d();
        if (iVar.e().g().equals(xe.o.d.f35727d)) {
            byte[] bArr = f14732e;
            this.f14735d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f14735d = new byte[0];
        }
    }
}
