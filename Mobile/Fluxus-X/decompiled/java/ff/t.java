package ff;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class t implements re.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16069e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf.a f16070a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16072d;

    public t(bf.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f16070a = aVar;
        this.b = i10;
        this.f16071c = new byte[0];
        this.f16072d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static re.w c(ze.a aVar) {
        return new t(aVar);
    }

    public static re.w d(ze.i iVar) {
        return new t(iVar);
    }

    @Override // re.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!e.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // re.w
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f16072d;
        return bArr2.length > 0 ? e.a(this.f16071c, this.f16070a.a(e.a(bArr, bArr2), this.b)) : e.a(this.f16071c, this.f16070a.a(bArr, this.b));
    }

    public t(ze.a aVar) {
        this.f16070a = new r(aVar.c().d(re.j.a()));
        this.b = aVar.e().c();
        this.f16071c = aVar.d().d();
        if (aVar.e().f().equals(ze.f.c.f39251d)) {
            byte[] bArr = f16069e;
            this.f16072d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f16072d = new byte[0];
        }
    }

    public t(ze.i iVar) {
        this.f16070a = new s("HMAC" + iVar.e().d(), new SecretKeySpec(iVar.c().d(re.j.a()), "HMAC"));
        this.b = iVar.e().c();
        this.f16071c = iVar.d().d();
        if (iVar.e().g().equals(ze.o.d.f39278d)) {
            byte[] bArr = f16069e;
            this.f16072d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f16072d = new byte[0];
        }
    }
}
