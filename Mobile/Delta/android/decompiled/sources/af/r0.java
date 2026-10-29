package af;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f471g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f472a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f476f;

    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final BigInteger f477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final BigInteger f478h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f479a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f483f;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f477g = bigIntegerValueOf;
            f478h = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public r0 a() throws GeneralSecurityException {
            Integer num = this.f479a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f480c == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f481d == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f483f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f482e == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f479a, Integer.valueOf(Barcode.FORMAT_PDF417)));
            }
            if (this.f480c != this.f481d) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            h(this.b);
            return new r0(this.f479a.intValue(), this.b, this.f483f, this.f480c, this.f481d, this.f482e.intValue());
        }

        public b b(c cVar) {
            this.f481d = cVar;
            return this;
        }

        public b c(int i10) {
            this.f479a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(int i10) throws GeneralSecurityException {
            if (i10 < 0) {
                throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
            }
            this.f482e = Integer.valueOf(i10);
            return this;
        }

        public b f(c cVar) {
            this.f480c = cVar;
            return this;
        }

        public b g(d dVar) {
            this.f483f = dVar;
            return this;
        }

        public final void h(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(r0.f471g);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f477g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f478h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f479a = null;
            this.b = r0.f471g;
            this.f480c = null;
            this.f481d = null;
            this.f482e = null;
            this.f483f = d.f489e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f484c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f485d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f486a;

        public c(String str) {
            this.f486a = str;
        }

        public String toString() {
            return this.f486a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f487c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f488d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f489e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f490a;

        public d(String str) {
            this.f490a = str;
        }

        public String toString() {
            return this.f490a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f473c != d.f489e;
    }

    public c c() {
        return this.f475e;
    }

    public int d() {
        return this.f472a;
    }

    public BigInteger e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.d() == d() && Objects.equals(r0Var.e(), e()) && Objects.equals(r0Var.h(), h()) && Objects.equals(r0Var.g(), g()) && Objects.equals(r0Var.c(), c()) && r0Var.f() == f();
    }

    public int f() {
        return this.f476f;
    }

    public c g() {
        return this.f474d;
    }

    public d h() {
        return this.f473c;
    }

    public int hashCode() {
        return Objects.hash(r0.class, Integer.valueOf(this.f472a), this.b, this.f473c, this.f474d, this.f475e, Integer.valueOf(this.f476f));
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f473c + ", signature hashType: " + this.f474d + ", mgf1 hashType: " + this.f475e + ", saltLengthBytes: " + this.f476f + ", publicExponent: " + this.b + ", and " + this.f472a + "-bit modulus)";
    }

    public r0(int i10, BigInteger bigInteger, d dVar, c cVar, c cVar2, int i11) {
        this.f472a = i10;
        this.b = bigInteger;
        this.f473c = dVar;
        this.f474d = cVar;
        this.f475e = cVar2;
        this.f476f = i11;
    }
}
