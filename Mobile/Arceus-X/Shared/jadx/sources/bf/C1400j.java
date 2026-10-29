package bf;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p102ef.C5111c;
import p515we.C12365e;
import pe.C10229j;

/* JADX INFO: renamed from: bf.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1400j extends AbstractC1384b1 {

    /* JADX INFO: renamed from: a */
    public final C1410o f5486a;

    /* JADX INFO: renamed from: b */
    public final C5111c f5487b;

    public C1400j(C1410o c1410o, C5111c c5111c) {
        this.f5486a = c1410o;
        this.f5487b = c5111c;
    }

    /* JADX INFO: renamed from: d */
    public static C1400j m7294d(C1410o c1410o, C5111c c5111c) throws GeneralSecurityException {
        if (c1410o == null) {
            throw new GeneralSecurityException("Ed25519 key cannot be constructed without an Ed25519 public key");
        }
        if (c5111c.m23855c() == 32) {
            if (Arrays.equals(c1410o.m7339f().m23850d(), C12365e.m46273v(C12365e.m46261j(c5111c.m23856d(C10229j.m39322a()))))) {
                return new C1400j(c1410o, c5111c);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + c5111c.m23855c());
    }

    /* JADX INFO: renamed from: e */
    public C1398i m7295e() {
        return this.f5486a.m7338e();
    }

    /* JADX INFO: renamed from: f */
    public C5111c m7296f() {
        return this.f5487b;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lbf/c1; */
    @Override // bf.AbstractC1384b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1410o mo7242c() {
        return this.f5486a;
    }
}
