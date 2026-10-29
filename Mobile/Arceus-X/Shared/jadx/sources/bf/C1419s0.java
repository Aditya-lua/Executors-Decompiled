package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p102ef.C5110b;
import pe.C10229j;

/* JADX INFO: renamed from: bf.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1419s0 extends AbstractC1384b1 {

    /* JADX INFO: renamed from: a */
    public final C1421t0 f5569a;

    /* JADX INFO: renamed from: b */
    public final C5110b f5570b;

    /* JADX INFO: renamed from: c */
    public final C5110b f5571c;

    /* JADX INFO: renamed from: d */
    public final C5110b f5572d;

    /* JADX INFO: renamed from: e */
    public final C5110b f5573e;

    /* JADX INFO: renamed from: f */
    public final C5110b f5574f;

    /* JADX INFO: renamed from: g */
    public final C5110b f5575g;

    /* JADX INFO: renamed from: bf.s0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1421t0 f5576a;

        /* JADX INFO: renamed from: b */
        public C5110b f5577b;

        /* JADX INFO: renamed from: c */
        public C5110b f5578c;

        /* JADX INFO: renamed from: d */
        public C5110b f5579d;

        /* JADX INFO: renamed from: e */
        public C5110b f5580e;

        /* JADX INFO: renamed from: f */
        public C5110b f5581f;

        /* JADX INFO: renamed from: g */
        public C5110b f5582g;

        /* JADX INFO: renamed from: a */
        public C1419s0 m7371a() throws GeneralSecurityException {
            C1421t0 c1421t0 = this.f5576a;
            if (c1421t0 == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f5578c == null || this.f5579d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.f5577b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f5580e == null || this.f5581f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f5582g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerM7350e = c1421t0.m7379e().m7350e();
            BigInteger bigIntegerM7378d = this.f5576a.m7378d();
            BigInteger bigIntegerM23852b = this.f5578c.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b2 = this.f5579d.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b3 = this.f5577b.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b4 = this.f5580e.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b5 = this.f5581f.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b6 = this.f5582g.m23852b(C10229j.m39322a());
            if (!bigIntegerM23852b.isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!bigIntegerM23852b2.isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!bigIntegerM23852b.multiply(bigIntegerM23852b2).equals(bigIntegerM7378d)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger bigIntegerSubtract = bigIntegerM23852b.subtract(bigInteger);
            BigInteger bigIntegerSubtract2 = bigIntegerM23852b2.subtract(bigInteger);
            if (!bigIntegerM7350e.multiply(bigIntegerM23852b3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!bigIntegerM7350e.multiply(bigIntegerM23852b4).mod(bigIntegerSubtract).equals(bigInteger)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!bigIntegerM7350e.multiply(bigIntegerM23852b5).mod(bigIntegerSubtract2).equals(bigInteger)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (bigIntegerM23852b2.multiply(bigIntegerM23852b6).mod(bigIntegerM23852b).equals(bigInteger)) {
                return new C1419s0(this.f5576a, this.f5578c, this.f5579d, this.f5577b, this.f5580e, this.f5581f, this.f5582g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        /* JADX INFO: renamed from: b */
        public b m7372b(C5110b c5110b) {
            this.f5582g = c5110b;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7373c(C5110b c5110b, C5110b c5110b2) {
            this.f5580e = c5110b;
            this.f5581f = c5110b2;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7374d(C5110b c5110b, C5110b c5110b2) {
            this.f5578c = c5110b;
            this.f5579d = c5110b2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7375e(C5110b c5110b) {
            this.f5577b = c5110b;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m7376f(C1421t0 c1421t0) {
            this.f5576a = c1421t0;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5576a = null;
            this.f5577b = null;
            this.f5578c = null;
            this.f5579d = null;
            this.f5580e = null;
            this.f5581f = null;
            this.f5582g = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static b m7362d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public C5110b m7363e() {
        return this.f5575g;
    }

    /* JADX INFO: renamed from: f */
    public C1417r0 m7364f() {
        return this.f5569a.m7379e();
    }

    /* JADX INFO: renamed from: g */
    public C5110b m7365g() {
        return this.f5573e;
    }

    /* JADX INFO: renamed from: h */
    public C5110b m7366h() {
        return this.f5574f;
    }

    /* JADX INFO: renamed from: i */
    public C5110b m7367i() {
        return this.f5571c;
    }

    /* JADX INFO: renamed from: j */
    public C5110b m7368j() {
        return this.f5572d;
    }

    /* JADX INFO: renamed from: k */
    public C5110b m7369k() {
        return this.f5570b;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lbf/c1; */
    @Override // bf.AbstractC1384b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1421t0 mo7242c() {
        return this.f5569a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1419s0(C1421t0 c1421t0, C5110b c5110b, C5110b c5110b2, C5110b c5110b3, C5110b c5110b4, C5110b c5110b5, C5110b c5110b6) {
        this.f5569a = c1421t0;
        this.f5571c = c5110b;
        this.f5572d = c5110b2;
        this.f5570b = c5110b3;
        this.f5573e = c5110b4;
        this.f5574f = c5110b5;
        this.f5575g = c5110b6;
    }
}
