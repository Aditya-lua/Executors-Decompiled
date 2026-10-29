package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: bf.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1401j0 extends AbstractC1381a1 {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f5488e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f5489a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f5490b;

    /* JADX INFO: renamed from: c */
    public final d f5491c;

    /* JADX INFO: renamed from: d */
    public final c f5492d;

    /* JADX INFO: renamed from: bf.j0$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        public static final BigInteger f5493e;

        /* JADX INFO: renamed from: f */
        public static final BigInteger f5494f;

        /* JADX INFO: renamed from: a */
        public Integer f5495a;

        /* JADX INFO: renamed from: b */
        public BigInteger f5496b;

        /* JADX INFO: renamed from: c */
        public c f5497c;

        /* JADX INFO: renamed from: d */
        public d f5498d;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f5493e = bigIntegerValueOf;
            f5494f = bigIntegerValueOf.pow(256);
        }

        /* JADX INFO: renamed from: a */
        public C1401j0 m7303a() throws GeneralSecurityException {
            Integer num = this.f5495a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f5496b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f5497c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f5498d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f5495a));
            }
            m7308f(this.f5496b);
            return new C1401j0(this.f5495a.intValue(), this.f5496b, this.f5498d, this.f5497c);
        }

        /* JADX INFO: renamed from: b */
        public b m7304b(c cVar) {
            this.f5497c = cVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7305c(int i10) {
            this.f5495a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7306d(BigInteger bigInteger) {
            this.f5496b = bigInteger;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7307e(d dVar) {
            this.f5498d = dVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final void m7308f(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(C1401j0.f5488e);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f5493e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f5494f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5495a = null;
            this.f5496b = C1401j0.f5488e;
            this.f5497c = null;
            this.f5498d = d.f5506e;
        }
    }

    /* JADX INFO: renamed from: bf.j0$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f5499b = new c("SHA256");

        /* JADX INFO: renamed from: c */
        public static final c f5500c = new c("SHA384");

        /* JADX INFO: renamed from: d */
        public static final c f5501d = new c("SHA512");

        /* JADX INFO: renamed from: a */
        public final String f5502a;

        public c(String str) {
            this.f5502a = str;
        }

        public String toString() {
            return this.f5502a;
        }
    }

    /* JADX INFO: renamed from: bf.j0$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f5503b = new d("TINK");

        /* JADX INFO: renamed from: c */
        public static final d f5504c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final d f5505d = new d("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final d f5506e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f5507a;

        public d(String str) {
            this.f5507a = str;
        }

        public String toString() {
            return this.f5507a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m7298b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f5491c != d.f5506e;
    }

    /* JADX INFO: renamed from: c */
    public c m7299c() {
        return this.f5492d;
    }

    /* JADX INFO: renamed from: d */
    public int m7300d() {
        return this.f5489a;
    }

    /* JADX INFO: renamed from: e */
    public BigInteger m7301e() {
        return this.f5490b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1401j0)) {
            return false;
        }
        C1401j0 c1401j0 = (C1401j0) obj;
        return c1401j0.m7300d() == m7300d() && Objects.equals(c1401j0.m7301e(), m7301e()) && c1401j0.m7302f() == m7302f() && c1401j0.m7299c() == m7299c();
    }

    /* JADX INFO: renamed from: f */
    public d m7302f() {
        return this.f5491c;
    }

    public int hashCode() {
        return Objects.hash(C1401j0.class, Integer.valueOf(this.f5489a), this.f5490b, this.f5491c, this.f5492d);
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f5491c + ", hashType: " + this.f5492d + ", publicExponent: " + this.f5490b + ", and " + this.f5489a + "-bit modulus)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1401j0(int i10, BigInteger bigInteger, d dVar, c cVar) {
        this.f5489a = i10;
        this.f5490b = bigInteger;
        this.f5491c = dVar;
        this.f5492d = cVar;
    }
}
