package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4062a;
    public final ef.b b;

    /* JADX INFO: renamed from: bf.b$b, reason: collision with other inner class name */
    public static class C0080b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f4063a;
        public ef.b b;

        public static void d(BigInteger bigInteger, ECPoint eCPoint, bf.a.c cVar) throws GeneralSecurityException {
            BigInteger order = cVar.a().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!we.g.k(bigInteger, cVar.a()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        public b a() throws GeneralSecurityException {
            if (this.f4063a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            ef.b bVar = this.b;
            if (bVar == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            d(bVar.b(pe.j.a()), this.f4063a.e(), this.f4063a.d().c());
            return new b(this.f4063a, this.b);
        }

        public C0080b b(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public C0080b c(c cVar) {
            this.f4063a = cVar;
            return this;
        }

        public C0080b() {
            this.f4063a = null;
            this.b = null;
        }
    }

    public static C0080b d() {
        return new C0080b();
    }

    public bf.a e() {
        return this.f4062a.d();
    }

    public ef.b f() {
        return this.b;
    }

    @Override // bf.b1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c c() {
        return this.f4062a;
    }

    public b(c cVar, ef.b bVar) {
        this.f4062a = cVar;
        this.b = bVar;
    }
}
