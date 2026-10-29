package af;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f441a;
    public final df.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.b f442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.b f443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final df.b f444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final df.b f445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df.b f446g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l0 f447a;
        public df.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public df.b f448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public df.b f449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public df.b f450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public df.b f451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public df.b f452g;

        public k0 a() throws GeneralSecurityException {
            l0 l0Var = this.f447a;
            if (l0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f448c == null || this.f449d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f450e == null || this.f451f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f452g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = l0Var.e().e();
            BigInteger bigIntegerD = this.f447a.d();
            BigInteger bigIntegerB = this.f448c.b(oe.j.a());
            BigInteger bigIntegerB2 = this.f449d.b(oe.j.a());
            BigInteger bigIntegerB3 = this.b.b(oe.j.a());
            BigInteger bigIntegerB4 = this.f450e.b(oe.j.a());
            BigInteger bigIntegerB5 = this.f451f.b(oe.j.a());
            BigInteger bigIntegerB6 = this.f452g.b(oe.j.a());
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
                return new k0(this.f447a, this.f448c, this.f449d, this.b, this.f450e, this.f451f, this.f452g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(df.b bVar) {
            this.f452g = bVar;
            return this;
        }

        public b c(df.b bVar, df.b bVar2) {
            this.f450e = bVar;
            this.f451f = bVar2;
            return this;
        }

        public b d(df.b bVar, df.b bVar2) {
            this.f448c = bVar;
            this.f449d = bVar2;
            return this;
        }

        public b e(df.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(l0 l0Var) {
            this.f447a = l0Var;
            return this;
        }

        public b() {
            this.f447a = null;
            this.b = null;
            this.f448c = null;
            this.f449d = null;
            this.f450e = null;
            this.f451f = null;
            this.f452g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public df.b e() {
        return this.f446g;
    }

    public j0 f() {
        return this.f441a.e();
    }

    public df.b g() {
        return this.f444e;
    }

    public df.b h() {
        return this.f445f;
    }

    public df.b i() {
        return this.f442c;
    }

    public df.b j() {
        return this.f443d;
    }

    public df.b k() {
        return this.b;
    }

    @Override // af.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l0 c() {
        return this.f441a;
    }

    public k0(l0 l0Var, df.b bVar, df.b bVar2, df.b bVar3, df.b bVar4, df.b bVar5, df.b bVar6) {
        this.f441a = l0Var;
        this.f442c = bVar;
        this.f443d = bVar2;
        this.b = bVar3;
        this.f444e = bVar4;
        this.f445f = bVar5;
        this.f446g = bVar6;
    }
}
