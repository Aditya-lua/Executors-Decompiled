package df;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f12341g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12342a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f12343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f12344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f12345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12346f;

    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final BigInteger f12347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final BigInteger f12348h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f12349a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f12350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f12351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f12352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f12353f;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f12347g = bigIntegerValueOf;
            f12348h = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public r0 a() throws GeneralSecurityException {
            Integer num = this.f12349a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f12350c == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f12351d == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f12353f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f12352e == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f12349a, Integer.valueOf(Barcode.FORMAT_PDF417)));
            }
            if (this.f12350c != this.f12351d) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            h(this.b);
            return new r0(this.f12349a.intValue(), this.b, this.f12353f, this.f12350c, this.f12351d, this.f12352e.intValue());
        }

        public b b(c cVar) {
            this.f12351d = cVar;
            return this;
        }

        public b c(int i10) {
            this.f12349a = Integer.valueOf(i10);
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
            this.f12352e = Integer.valueOf(i10);
            return this;
        }

        public b f(c cVar) {
            this.f12350c = cVar;
            return this;
        }

        public b g(d dVar) {
            this.f12353f = dVar;
            return this;
        }

        public final void h(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(r0.f12341g);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f12347g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f12348h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f12349a = null;
            this.b = r0.f12341g;
            this.f12350c = null;
            this.f12351d = null;
            this.f12352e = null;
            this.f12353f = d.f12359e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12354c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f12355d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12356a;

        public c(String str) {
            this.f12356a = str;
        }

        public String toString() {
            return this.f12356a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f12357c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f12358d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f12359e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12360a;

        public d(String str) {
            this.f12360a = str;
        }

        public String toString() {
            return this.f12360a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f12343c != d.f12359e;
    }

    public c c() {
        return this.f12345e;
    }

    public int d() {
        return this.f12342a;
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
        return this.f12346f;
    }

    public c g() {
        return this.f12344d;
    }

    public d h() {
        return this.f12343c;
    }

    public int hashCode() {
        return Objects.hash(r0.class, Integer.valueOf(this.f12342a), this.b, this.f12343c, this.f12344d, this.f12345e, Integer.valueOf(this.f12346f));
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f12343c + ", signature hashType: " + this.f12344d + ", mgf1 hashType: " + this.f12345e + ", saltLengthBytes: " + this.f12346f + ", publicExponent: " + this.b + ", and " + this.f12342a + "-bit modulus)";
    }

    public r0(int i10, BigInteger bigInteger, d dVar, c cVar, c cVar2, int i11) {
        this.f12342a = i10;
        this.b = bigInteger;
        this.f12343c = dVar;
        this.f12344d = cVar;
        this.f12345e = cVar2;
        this.f12346f = i11;
    }
}
