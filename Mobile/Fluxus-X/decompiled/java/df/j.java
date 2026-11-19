package df;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12294a;
    public final gf.c b;

    public j(o oVar, gf.c cVar) {
        this.f12294a = oVar;
        this.b = cVar;
    }

    public static j d(o oVar, gf.c cVar) throws GeneralSecurityException {
        if (oVar == null) {
            throw new GeneralSecurityException("Ed25519 key cannot be constructed without an Ed25519 public key");
        }
        if (cVar.c() == 32) {
            if (Arrays.equals(oVar.f().d(), ye.e.v(ye.e.j(cVar.d(re.j.a()))))) {
                return new j(oVar, cVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + cVar.c());
    }

    public i e() {
        return this.f12294a.e();
    }

    public gf.c f() {
        return this.b;
    }

    @Override // df.b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c() {
        return this.f12294a;
    }
}
