package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p102ef.C5110b;
import pe.C10229j;

/* JADX INFO: renamed from: bf.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1403k0 extends AbstractC1384b1 {

    /* JADX INFO: renamed from: a */
    public final C1405l0 f5508a;

    /* JADX INFO: renamed from: b */
    public final C5110b f5509b;

    /* JADX INFO: renamed from: c */
    public final C5110b f5510c;

    /* JADX INFO: renamed from: d */
    public final C5110b f5511d;

    /* JADX INFO: renamed from: e */
    public final C5110b f5512e;

    /* JADX INFO: renamed from: f */
    public final C5110b f5513f;

    /* JADX INFO: renamed from: g */
    public final C5110b f5514g;

    /* JADX INFO: renamed from: bf.k0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C1405l0 f5515a;

        /* JADX INFO: renamed from: b */
        public C5110b f5516b;

        /* JADX INFO: renamed from: c */
        public C5110b f5517c;

        /* JADX INFO: renamed from: d */
        public C5110b f5518d;

        /* JADX INFO: renamed from: e */
        public C5110b f5519e;

        /* JADX INFO: renamed from: f */
        public C5110b f5520f;

        /* JADX INFO: renamed from: g */
        public C5110b f5521g;

        /* JADX INFO: renamed from: a */
        public C1403k0 m7318a() throws GeneralSecurityException {
            C1405l0 c1405l0 = this.f5515a;
            if (c1405l0 == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f5517c == null || this.f5518d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.f5516b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f5519e == null || this.f5520f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f5521g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerM7301e = c1405l0.m7326e().m7301e();
            BigInteger bigIntegerM7325d = this.f5515a.m7325d();
            BigInteger bigIntegerM23852b = this.f5517c.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b2 = this.f5518d.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b3 = this.f5516b.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b4 = this.f5519e.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b5 = this.f5520f.m23852b(C10229j.m39322a());
            BigInteger bigIntegerM23852b6 = this.f5521g.m23852b(C10229j.m39322a());
            if (!bigIntegerM23852b.isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!bigIntegerM23852b2.isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!bigIntegerM23852b.multiply(bigIntegerM23852b2).equals(bigIntegerM7325d)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger bigIntegerSubtract = bigIntegerM23852b.subtract(bigInteger);
            BigInteger bigIntegerSubtract2 = bigIntegerM23852b2.subtract(bigInteger);
            if (!bigIntegerM7301e.multiply(bigIntegerM23852b3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!bigIntegerM7301e.multiply(bigIntegerM23852b4).mod(bigIntegerSubtract).equals(bigInteger)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!bigIntegerM7301e.multiply(bigIntegerM23852b5).mod(bigIntegerSubtract2).equals(bigInteger)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (bigIntegerM23852b2.multiply(bigIntegerM23852b6).mod(bigIntegerM23852b).equals(bigInteger)) {
                return new C1403k0(this.f5515a, this.f5517c, this.f5518d, this.f5516b, this.f5519e, this.f5520f, this.f5521g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        /* JADX INFO: renamed from: b */
        public b m7319b(C5110b c5110b) {
            this.f5521g = c5110b;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7320c(C5110b c5110b, C5110b c5110b2) {
            this.f5519e = c5110b;
            this.f5520f = c5110b2;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7321d(C5110b c5110b, C5110b c5110b2) {
            this.f5517c = c5110b;
            this.f5518d = c5110b2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7322e(C5110b c5110b) {
            this.f5516b = c5110b;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m7323f(C1405l0 c1405l0) {
            this.f5515a = c1405l0;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5515a = null;
            this.f5516b = null;
            this.f5517c = null;
            this.f5518d = null;
            this.f5519e = null;
            this.f5520f = null;
            this.f5521g = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static b m7309d() {
        return new b();
    }

    /* JADX INFO: renamed from: e */
    public C5110b m7310e() {
        return this.f5514g;
    }

    /* JADX INFO: renamed from: f */
    public C1401j0 m7311f() {
        return this.f5508a.m7326e();
    }

    /* JADX INFO: renamed from: g */
    public C5110b m7312g() {
        return this.f5512e;
    }

    /* JADX INFO: renamed from: h */
    public C5110b m7313h() {
        return this.f5513f;
    }

    /* JADX INFO: renamed from: i */
    public C5110b m7314i() {
        return this.f5510c;
    }

    /* JADX INFO: renamed from: j */
    public C5110b m7315j() {
        return this.f5511d;
    }

    /* JADX INFO: renamed from: k */
    public C5110b m7316k() {
        return this.f5509b;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lbf/c1; */
    @Override // bf.AbstractC1384b1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1405l0 mo7242c() {
        return this.f5508a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1403k0(C1405l0 c1405l0, C5110b c5110b, C5110b c5110b2, C5110b c5110b3, C5110b c5110b4, C5110b c5110b5, C5110b c5110b6) {
        this.f5508a = c1405l0;
        this.f5510c = c5110b;
        this.f5511d = c5110b2;
        this.f5509b = c5110b3;
        this.f5512e = c5110b4;
        this.f5513f = c5110b5;
        this.f5514g = c5110b6;
    }
}
