package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: bf.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1417r0 extends AbstractC1381a1 {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f5545g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f5546a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f5547b;

    /* JADX INFO: renamed from: c */
    public final d f5548c;

    /* JADX INFO: renamed from: d */
    public final c f5549d;

    /* JADX INFO: renamed from: e */
    public final c f5550e;

    /* JADX INFO: renamed from: f */
    public final int f5551f;

    /* JADX INFO: renamed from: bf.r0$b */
    public static final class b {

        /* JADX INFO: renamed from: g */
        public static final BigInteger f5552g;

        /* JADX INFO: renamed from: h */
        public static final BigInteger f5553h;

        /* JADX INFO: renamed from: a */
        public Integer f5554a;

        /* JADX INFO: renamed from: b */
        public BigInteger f5555b;

        /* JADX INFO: renamed from: c */
        public c f5556c;

        /* JADX INFO: renamed from: d */
        public c f5557d;

        /* JADX INFO: renamed from: e */
        public Integer f5558e;

        /* JADX INFO: renamed from: f */
        public d f5559f;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f5552g = bigIntegerValueOf;
            f5553h = bigIntegerValueOf.pow(256);
        }

        /* JADX INFO: renamed from: a */
        public C1417r0 m7354a() throws GeneralSecurityException {
            Integer num = this.f5554a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f5555b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f5556c == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f5557d == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f5559f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f5558e == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f5554a, 2048));
            }
            if (this.f5556c != this.f5557d) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            m7361h(this.f5555b);
            return new C1417r0(this.f5554a.intValue(), this.f5555b, this.f5559f, this.f5556c, this.f5557d, this.f5558e.intValue());
        }

        /* JADX INFO: renamed from: b */
        public b m7355b(c cVar) {
            this.f5557d = cVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7356c(int i10) {
            this.f5554a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7357d(BigInteger bigInteger) {
            this.f5555b = bigInteger;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7358e(int i10) throws GeneralSecurityException {
            if (i10 < 0) {
                throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
            }
            this.f5558e = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m7359f(c cVar) {
            this.f5556c = cVar;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m7360g(d dVar) {
            this.f5559f = dVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m7361h(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(C1417r0.f5545g);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f5552g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f5553h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5554a = null;
            this.f5555b = C1417r0.f5545g;
            this.f5556c = null;
            this.f5557d = null;
            this.f5558e = null;
            this.f5559f = d.f5567e;
        }
    }

    /* JADX INFO: renamed from: bf.r0$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f5560b = new c("SHA256");

        /* JADX INFO: renamed from: c */
        public static final c f5561c = new c("SHA384");

        /* JADX INFO: renamed from: d */
        public static final c f5562d = new c("SHA512");

        /* JADX INFO: renamed from: a */
        public final String f5563a;

        public c(String str) {
            this.f5563a = str;
        }

        public String toString() {
            return this.f5563a;
        }
    }

    /* JADX INFO: renamed from: bf.r0$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f5564b = new d("TINK");

        /* JADX INFO: renamed from: c */
        public static final d f5565c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final d f5566d = new d("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final d f5567e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f5568a;

        public d(String str) {
            this.f5568a = str;
        }

        public String toString() {
            return this.f5568a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m7347b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f5548c != d.f5567e;
    }

    /* JADX INFO: renamed from: c */
    public c m7348c() {
        return this.f5550e;
    }

    /* JADX INFO: renamed from: d */
    public int m7349d() {
        return this.f5546a;
    }

    /* JADX INFO: renamed from: e */
    public BigInteger m7350e() {
        return this.f5547b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1417r0)) {
            return false;
        }
        C1417r0 c1417r0 = (C1417r0) obj;
        return c1417r0.m7349d() == m7349d() && Objects.equals(c1417r0.m7350e(), m7350e()) && Objects.equals(c1417r0.m7353h(), m7353h()) && Objects.equals(c1417r0.m7352g(), m7352g()) && Objects.equals(c1417r0.m7348c(), m7348c()) && c1417r0.m7351f() == m7351f();
    }

    /* JADX INFO: renamed from: f */
    public int m7351f() {
        return this.f5551f;
    }

    /* JADX INFO: renamed from: g */
    public c m7352g() {
        return this.f5549d;
    }

    /* JADX INFO: renamed from: h */
    public d m7353h() {
        return this.f5548c;
    }

    public int hashCode() {
        return Objects.hash(C1417r0.class, Integer.valueOf(this.f5546a), this.f5547b, this.f5548c, this.f5549d, this.f5550e, Integer.valueOf(this.f5551f));
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f5548c + ", signature hashType: " + this.f5549d + ", mgf1 hashType: " + this.f5550e + ", saltLengthBytes: " + this.f5551f + ", publicExponent: " + this.f5547b + ", and " + this.f5546a + "-bit modulus)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1417r0(int i10, BigInteger bigInteger, d dVar, c cVar, c cVar2, int i11) {
        this.f5546a = i10;
        this.f5547b = bigInteger;
        this.f5548c = dVar;
        this.f5549d = cVar;
        this.f5550e = cVar2;
        this.f5551f = i11;
    }
}
