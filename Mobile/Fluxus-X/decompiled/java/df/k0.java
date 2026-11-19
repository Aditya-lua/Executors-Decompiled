package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f12311a;
    public final gf.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.b f12312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gf.b f12313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gf.b f12314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gf.b f12315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gf.b f12316g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l0 f12317a;
        public gf.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public gf.b f12318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public gf.b f12319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public gf.b f12320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public gf.b f12321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public gf.b f12322g;

        public k0 a() throws GeneralSecurityException {
            l0 l0Var = this.f12317a;
            if (l0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f12318c == null || this.f12319d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f12320e == null || this.f12321f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f12322g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = l0Var.e().e();
            BigInteger bigIntegerD = this.f12317a.d();
            BigInteger bigIntegerB = this.f12318c.b(re.j.a());
            BigInteger bigIntegerB2 = this.f12319d.b(re.j.a());
            BigInteger bigIntegerB3 = this.b.b(re.j.a());
            BigInteger bigIntegerB4 = this.f12320e.b(re.j.a());
            BigInteger bigIntegerB5 = this.f12321f.b(re.j.a());
            BigInteger bigIntegerB6 = this.f12322g.b(re.j.a());
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
                return new k0(this.f12317a, this.f12318c, this.f12319d, this.b, this.f12320e, this.f12321f, this.f12322g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(gf.b bVar) {
            this.f12322g = bVar;
            return this;
        }

        public b c(gf.b bVar, gf.b bVar2) {
            this.f12320e = bVar;
            this.f12321f = bVar2;
            return this;
        }

        public b d(gf.b bVar, gf.b bVar2) {
            this.f12318c = bVar;
            this.f12319d = bVar2;
            return this;
        }

        public b e(gf.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(l0 l0Var) {
            this.f12317a = l0Var;
            return this;
        }

        public b() {
            this.f12317a = null;
            this.b = null;
            this.f12318c = null;
            this.f12319d = null;
            this.f12320e = null;
            this.f12321f = null;
            this.f12322g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public gf.b e() {
        return this.f12316g;
    }

    public j0 f() {
        return this.f12311a.e();
    }

    public gf.b g() {
        return this.f12314e;
    }

    public gf.b h() {
        return this.f12315f;
    }

    public gf.b i() {
        return this.f12312c;
    }

    public gf.b j() {
        return this.f12313d;
    }

    public gf.b k() {
        return this.b;
    }

    @Override // df.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l0 c() {
        return this.f12311a;
    }

    public k0(l0 l0Var, gf.b bVar, gf.b bVar2, gf.b bVar3, gf.b bVar4, gf.b bVar5, gf.b bVar6) {
        this.f12311a = l0Var;
        this.f12312c = bVar;
        this.f12313d = bVar2;
        this.b = bVar3;
        this.f12314e = bVar4;
        this.f12315f = bVar5;
        this.f12316g = bVar6;
    }
}
