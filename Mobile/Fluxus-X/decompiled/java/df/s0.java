package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f12361a;
    public final gf.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.b f12362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gf.b f12363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gf.b f12364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gf.b f12365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gf.b f12366g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t0 f12367a;
        public gf.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public gf.b f12368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public gf.b f12369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public gf.b f12370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public gf.b f12371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public gf.b f12372g;

        public s0 a() throws GeneralSecurityException {
            t0 t0Var = this.f12367a;
            if (t0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f12368c == null || this.f12369d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f12370e == null || this.f12371f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f12372g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = t0Var.e().e();
            BigInteger bigIntegerD = this.f12367a.d();
            BigInteger bigIntegerB = this.f12368c.b(re.j.a());
            BigInteger bigIntegerB2 = this.f12369d.b(re.j.a());
            BigInteger bigIntegerB3 = this.b.b(re.j.a());
            BigInteger bigIntegerB4 = this.f12370e.b(re.j.a());
            BigInteger bigIntegerB5 = this.f12371f.b(re.j.a());
            BigInteger bigIntegerB6 = this.f12372g.b(re.j.a());
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
                return new s0(this.f12367a, this.f12368c, this.f12369d, this.b, this.f12370e, this.f12371f, this.f12372g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(gf.b bVar) {
            this.f12372g = bVar;
            return this;
        }

        public b c(gf.b bVar, gf.b bVar2) {
            this.f12370e = bVar;
            this.f12371f = bVar2;
            return this;
        }

        public b d(gf.b bVar, gf.b bVar2) {
            this.f12368c = bVar;
            this.f12369d = bVar2;
            return this;
        }

        public b e(gf.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(t0 t0Var) {
            this.f12367a = t0Var;
            return this;
        }

        public b() {
            this.f12367a = null;
            this.b = null;
            this.f12368c = null;
            this.f12369d = null;
            this.f12370e = null;
            this.f12371f = null;
            this.f12372g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public gf.b e() {
        return this.f12366g;
    }

    public r0 f() {
        return this.f12361a.e();
    }

    public gf.b g() {
        return this.f12364e;
    }

    public gf.b h() {
        return this.f12365f;
    }

    public gf.b i() {
        return this.f12362c;
    }

    public gf.b j() {
        return this.f12363d;
    }

    public gf.b k() {
        return this.b;
    }

    @Override // df.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t0 c() {
        return this.f12361a;
    }

    public s0(t0 t0Var, gf.b bVar, gf.b bVar2, gf.b bVar3, gf.b bVar4, gf.b bVar5, gf.b bVar6) {
        this.f12361a = t0Var;
        this.f12362c = bVar;
        this.f12363d = bVar2;
        this.b = bVar3;
        this.f12364e = bVar4;
        this.f12365f = bVar5;
        this.f12366g = bVar6;
    }
}
