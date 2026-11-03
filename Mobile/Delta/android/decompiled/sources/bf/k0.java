package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f4113a;
    public final ef.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.b f4114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ef.b f4115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ef.b f4116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ef.b f4117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ef.b f4118g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l0 f4119a;
        public ef.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ef.b f4120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ef.b f4121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ef.b f4122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ef.b f4123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ef.b f4124g;

        public k0 a() throws GeneralSecurityException {
            l0 l0Var = this.f4119a;
            if (l0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f4120c == null || this.f4121d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f4122e == null || this.f4123f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f4124g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = l0Var.e().e();
            BigInteger bigIntegerD = this.f4119a.d();
            BigInteger bigIntegerB = this.f4120c.b(pe.j.a());
            BigInteger bigIntegerB2 = this.f4121d.b(pe.j.a());
            BigInteger bigIntegerB3 = this.b.b(pe.j.a());
            BigInteger bigIntegerB4 = this.f4122e.b(pe.j.a());
            BigInteger bigIntegerB5 = this.f4123f.b(pe.j.a());
            BigInteger bigIntegerB6 = this.f4124g.b(pe.j.a());
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
                return new k0(this.f4119a, this.f4120c, this.f4121d, this.b, this.f4122e, this.f4123f, this.f4124g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(ef.b bVar) {
            this.f4124g = bVar;
            return this;
        }

        public b c(ef.b bVar, ef.b bVar2) {
            this.f4122e = bVar;
            this.f4123f = bVar2;
            return this;
        }

        public b d(ef.b bVar, ef.b bVar2) {
            this.f4120c = bVar;
            this.f4121d = bVar2;
            return this;
        }

        public b e(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(l0 l0Var) {
            this.f4119a = l0Var;
            return this;
        }

        public b() {
            this.f4119a = null;
            this.b = null;
            this.f4120c = null;
            this.f4121d = null;
            this.f4122e = null;
            this.f4123f = null;
            this.f4124g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public ef.b e() {
        return this.f4118g;
    }

    public j0 f() {
        return this.f4113a.e();
    }

    public ef.b g() {
        return this.f4116e;
    }

    public ef.b h() {
        return this.f4117f;
    }

    public ef.b i() {
        return this.f4114c;
    }

    public ef.b j() {
        return this.f4115d;
    }

    public ef.b k() {
        return this.b;
    }

    @Override // bf.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l0 c() {
        return this.f4113a;
    }

    public k0(l0 l0Var, ef.b bVar, ef.b bVar2, ef.b bVar3, ef.b bVar4, ef.b bVar5, ef.b bVar6) {
        this.f4113a = l0Var;
        this.f4114c = bVar;
        this.f4115d = bVar2;
        this.b = bVar3;
        this.f4116e = bVar4;
        this.f4117f = bVar5;
        this.f4118g = bVar6;
    }
}
