package af;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f424a;
    public final df.c b;

    public j(o oVar, df.c cVar) {
        this.f424a = oVar;
        this.b = cVar;
    }

    public static j d(o oVar, df.c cVar) throws GeneralSecurityException {
        if (oVar == null) {
            throw new GeneralSecurityException("Ed25519 key cannot be constructed without an Ed25519 public key");
        }
        if (cVar.c() == 32) {
            if (Arrays.equals(oVar.f().d(), ve.e.v(ve.e.j(cVar.d(oe.j.a()))))) {
                return new j(oVar, cVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + cVar.c());
    }

    public i e() {
        return this.f424a.e();
    }

    public df.c f() {
        return this.b;
    }

    @Override // af.b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c() {
        return this.f424a;
    }
}
