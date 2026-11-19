package df;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f12295e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12296a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f12297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f12298d;

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final BigInteger f12299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final BigInteger f12300f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f12301a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f12302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f12303d;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f12299e = bigIntegerValueOf;
            f12300f = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public j0 a() throws GeneralSecurityException {
            Integer num = this.f12301a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f12302c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f12303d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f12301a));
            }
            f(this.b);
            return new j0(this.f12301a.intValue(), this.b, this.f12303d, this.f12302c);
        }

        public b b(c cVar) {
            this.f12302c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f12301a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(d dVar) {
            this.f12303d = dVar;
            return this;
        }

        public final void f(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(j0.f12295e);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f12299e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f12300f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f12301a = null;
            this.b = j0.f12295e;
            this.f12302c = null;
            this.f12303d = d.f12309e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12304c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f12305d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12306a;

        public c(String str) {
            this.f12306a = str;
        }

        public String toString() {
            return this.f12306a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f12307c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f12308d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f12309e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12310a;

        public d(String str) {
            this.f12310a = str;
        }

        public String toString() {
            return this.f12310a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f12297c != d.f12309e;
    }

    public c c() {
        return this.f12298d;
    }

    public int d() {
        return this.f12296a;
    }

    public BigInteger e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.d() == d() && Objects.equals(j0Var.e(), e()) && j0Var.f() == f() && j0Var.c() == c();
    }

    public d f() {
        return this.f12297c;
    }

    public int hashCode() {
        return Objects.hash(j0.class, Integer.valueOf(this.f12296a), this.b, this.f12297c, this.f12298d);
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f12297c + ", hashType: " + this.f12298d + ", publicExponent: " + this.b + ", and " + this.f12296a + "-bit modulus)";
    }

    public j0(int i10, BigInteger bigInteger, d dVar, c cVar) {
        this.f12296a = i10;
        this.b = bigInteger;
        this.f12297c = dVar;
        this.f12298d = cVar;
    }
}
