package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f4163a;
    public final ef.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.b f4164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ef.b f4165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ef.b f4166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ef.b f4167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ef.b f4168g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t0 f4169a;
        public ef.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ef.b f4170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ef.b f4171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ef.b f4172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ef.b f4173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ef.b f4174g;

        public s0 a() throws GeneralSecurityException {
            t0 t0Var = this.f4169a;
            if (t0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f4170c == null || this.f4171d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f4172e == null || this.f4173f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f4174g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerE = t0Var.e().e();
            BigInteger bigIntegerD = this.f4169a.d();
            BigInteger bigIntegerB = this.f4170c.b(pe.j.a());
            BigInteger bigIntegerB2 = this.f4171d.b(pe.j.a());
            BigInteger bigIntegerB3 = this.b.b(pe.j.a());
            BigInteger bigIntegerB4 = this.f4172e.b(pe.j.a());
            BigInteger bigIntegerB5 = this.f4173f.b(pe.j.a());
            BigInteger bigIntegerB6 = this.f4174g.b(pe.j.a());
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
                return new s0(this.f4169a, this.f4170c, this.f4171d, this.b, this.f4172e, this.f4173f, this.f4174g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(ef.b bVar) {
            this.f4174g = bVar;
            return this;
        }

        public b c(ef.b bVar, ef.b bVar2) {
            this.f4172e = bVar;
            this.f4173f = bVar2;
            return this;
        }

        public b d(ef.b bVar, ef.b bVar2) {
            this.f4170c = bVar;
            this.f4171d = bVar2;
            return this;
        }

        public b e(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(t0 t0Var) {
            this.f4169a = t0Var;
            return this;
        }

        public b() {
            this.f4169a = null;
            this.b = null;
            this.f4170c = null;
            this.f4171d = null;
            this.f4172e = null;
            this.f4173f = null;
            this.f4174g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public ef.b e() {
        return this.f4168g;
    }

    public r0 f() {
        return this.f4163a.e();
    }

    public ef.b g() {
        return this.f4166e;
    }

    public ef.b h() {
        return this.f4167f;
    }

    public ef.b i() {
        return this.f4164c;
    }

    public ef.b j() {
        return this.f4165d;
    }

    public ef.b k() {
        return this.b;
    }

    @Override // bf.b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t0 c() {
        return this.f4163a;
    }

    public s0(t0 t0Var, ef.b bVar, ef.b bVar2, ef.b bVar3, ef.b bVar4, ef.b bVar5, ef.b bVar6) {
        this.f4163a = t0Var;
        this.f4164c = bVar;
        this.f4165d = bVar2;
        this.b = bVar3;
        this.f4166e = bVar4;
        this.f4167f = bVar5;
        this.f4168g = bVar6;
    }
}
