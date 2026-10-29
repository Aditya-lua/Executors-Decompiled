package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import p102ef.C5110b;
import p515we.C12369g;
import pe.C10229j;

/* JADX INFO: renamed from: bf.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1382b extends AbstractC1384b1 {

    /* JADX INFO: renamed from: a */
    public final C1385c f5441a;

    /* JADX INFO: renamed from: b */
    public final C5110b f5442b;

    /* JADX INFO: renamed from: bf.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1385c f5443a;

        /* JADX INFO: renamed from: b */
        public C5110b f5444b;

        /* JADX INFO: renamed from: d */
        public static void m7246d(BigInteger bigInteger, ECPoint eCPoint, C1379a.c cVar) throws GeneralSecurityException {
            BigInteger order = cVar.m7240a().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!C12369g.m46311k(bigInteger, cVar.m7240a()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        /* JADX INFO: renamed from: a */
        public C1382b m7247a() throws GeneralSecurityException {
            if (this.f5443a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            C5110b c5110b = this.f5444b;
            if (c5110b == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            m7246d(c5110b.m23852b(C10229j.m39322a()), this.f5443a.m7255e(), this.f5443a.m7254d().m7231c());
            return new C1382b(this.f5443a, this.f5444b);
        }

        /* JADX INFO: renamed from: b */
        public b m7248b(C5110b c5110b) {
            this.f5444b = c5110b;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7249c(C1385c c1385c) {
            this.f5443a = c1385c;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5443a = null;
            this.f5444b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static b m7241d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public C1379a m7243e() {
        return this.f5441a.m7254d();
    }

    /* JADX INFO: renamed from: f */
    public C5110b m7244f() {
        return this.f5442b;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lbf/c1; */
    @Override // bf.AbstractC1384b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1385c mo7242c() {
        return this.f5441a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1382b(C1385c c1385c, C5110b c5110b) {
        this.f5441a = c1385c;
        this.f5442b = c5110b;
    }
}
