package af;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f390a;
    public final df.b b;

    /* JADX INFO: renamed from: af.b$b, reason: collision with other inner class name */
    public static class C0004b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f391a;
        public df.b b;

        public static void d(BigInteger bigInteger, ECPoint eCPoint, af.a.c cVar) throws GeneralSecurityException {
            BigInteger order = cVar.a().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!ve.g.k(bigInteger, cVar.a()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        public b a() throws GeneralSecurityException {
            if (this.f391a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            df.b bVar = this.b;
            if (bVar == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            d(bVar.b(oe.j.a()), this.f391a.e(), this.f391a.d().c());
            return new b(this.f391a, this.b);
        }

        public C0004b b(df.b bVar) {
            this.b = bVar;
            return this;
        }

        public C0004b c(c cVar) {
            this.f391a = cVar;
            return this;
        }

        public C0004b() {
            this.f391a = null;
            this.b = null;
        }
    }

    public static C0004b d() {
        return new C0004b();
    }

    public af.a e() {
        return this.f390a.d();
    }

    public df.b f() {
        return this.b;
    }

    @Override // af.b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c c() {
        return this.f390a;
    }

    public b(c cVar, df.b bVar) {
        this.f390a = cVar;
        this.b = bVar;
    }
}
