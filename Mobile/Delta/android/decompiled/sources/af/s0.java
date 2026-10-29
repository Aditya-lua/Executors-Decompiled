package af;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f491a;
    public final df.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.b f492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.b f493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final df.b f494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final df.b f495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df.b f496g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t0 f497a;
        public df.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public df.b f498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public df.b f499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public df.b f500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public df.b f501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public df.b f502g;

        public s0 a() throws GeneralSecurityException {
            t0 t0Var = this.f497a;
            if (t0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f498c == null || this.f499d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f500e == null || this.f501f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f502g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = t0Var.e().e();
            BigInteger bigIntegerD = this.f497a.d();
            BigInteger bigIntegerB = this.f498c.b(oe.j.a());
            BigInteger bigIntegerB2 = this.f499d.b(oe.j.a());
            BigInteger bigIntegerB3 = this.b.b(oe.j.a());
            BigInteger bigIntegerB4 = this.f500e.b(oe.j.a());
            BigInteger bigIntegerB5 = this.f501f.b(oe.j.a());
            BigInteger bigIntegerB6 = this.f502g.b(oe.j.a());
            if (!bigIntegerB.isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!bigIntegerB2.isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!bigIntegerB.multiply(bigIntegerB2).equals(bigIntegerD)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger bigIntegerSubtract = bigIntegerB.subtract(bigInteger);
            BigInteger bigIntegerSubtract2 = bigIntegerB2.subtract(bigInteger);
            if (!bigIntegerE.multiply(bigIntegerB3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!bigIntegerE.multiply(bigIntegerB4).mod(bigIntegerSubtract).equals(bigInteger)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!bigIntegerE.multiply(bigIntegerB5).mod(bigIntegerSubtract2).equals(bigInteger)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (bigIntegerB2.multiply(bigIntegerB6).mod(bigIntegerB).equals(bigInteger)) {
                return new s0(this.f497a, this.f498c, this.f499d, this.b, this.f500e, this.f501f, this.f502g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(df.b bVar) {
            this.f502g = bVar;
            return this;
        }

        public b c(df.b bVar, df.b bVar2) {
            this.f500e = bVar;
            this.f501f = bVar2;
            return this;
        }

        public b d(df.b bVar, df.b bVar2) {
            this.f498c = bVar;
            this.f499d = bVar2;
            return this;
        }

        public b e(df.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(t0 t0Var) {
            this.f497a = t0Var;
            return this;
        }

        public b() {
            this.f497a = null;
            this.b = null;
            this.f498c = null;
            this.f499d = null;
            this.f500e = null;
            this.f501f = null;
            this.f502g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public df.b e() {
        return this.f496g;
    }

    public r0 f() {
        return this.f491a.e();
    }

    public df.b g() {
        return this.f494e;
    }

    public df.b h() {
        return this.f495f;
    }

    public df.b i() {
        return this.f492c;
    }

    public df.b j() {
        return this.f493d;
    }

    public df.b k() {
        return this.b;
    }

    @Override // af.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t0 c() {
        return this.f491a;
    }

    public s0(t0 t0Var, df.b bVar, df.b bVar2, df.b bVar3, df.b bVar4, df.b bVar5, df.b bVar6) {
        this.f491a = t0Var;
        this.f492c = bVar;
        this.f493d = bVar2;
        this.b = bVar3;
        this.f494e = bVar4;
        this.f495f = bVar5;
        this.f496g = bVar6;
    }
}
