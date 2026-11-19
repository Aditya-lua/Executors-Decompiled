package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12260a;
    public final gf.b b;

    /* JADX INFO: renamed from: df.b$b, reason: collision with other inner class name */
    public static class C0221b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f12261a;
        public gf.b b;

        public static void d(BigInteger bigInteger, ECPoint eCPoint, df.a.c cVar) throws GeneralSecurityException {
            BigInteger order = cVar.a().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!ye.g.k(bigInteger, cVar.a()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        public b a() throws GeneralSecurityException {
            if (this.f12261a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            gf.b bVar = this.b;
            if (bVar == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            d(bVar.b(re.j.a()), this.f12261a.e(), this.f12261a.d().c());
            return new b(this.f12261a, this.b);
        }

        public C0221b b(gf.b bVar) {
            this.b = bVar;
            return this;
        }

        public C0221b c(c cVar) {
            this.f12261a = cVar;
            return this;
        }

        public C0221b() {
            this.f12261a = null;
            this.b = null;
        }
    }

    public static C0221b d() {
        return new C0221b();
    }

    public df.a e() {
        return this.f12260a.d();
    }

    public gf.b f() {
        return this.b;
    }

    @Override // df.b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c c() {
        return this.f12260a;
    }

    public b(c cVar, gf.b bVar) {
        this.f12260a = cVar;
        this.b = bVar;
    }
}
