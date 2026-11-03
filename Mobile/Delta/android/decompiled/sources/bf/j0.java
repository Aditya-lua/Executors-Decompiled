package bf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f4097e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4098a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f4100d;

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final BigInteger f4101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final BigInteger f4102f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f4103a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f4104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f4105d;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f4101e = bigIntegerValueOf;
            f4102f = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public j0 a() throws GeneralSecurityException {
            Integer num = this.f4103a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f4104c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f4105d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f4103a));
            }
            f(this.b);
            return new j0(this.f4103a.intValue(), this.b, this.f4105d, this.f4104c);
        }

        public b b(c cVar) {
            this.f4104c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f4103a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(d dVar) {
            this.f4105d = dVar;
            return this;
        }

        public final void f(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(j0.f4097e);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f4101e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f4102f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f4103a = null;
            this.b = j0.f4097e;
            this.f4104c = null;
            this.f4105d = d.f4111e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f4106c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f4107d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4108a;

        public c(String str) {
            this.f4108a = str;
        }

        public String toString() {
            return this.f4108a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f4109c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f4110d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f4111e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4112a;

        public d(String str) {
            this.f4112a = str;
        }

        public String toString() {
            return this.f4112a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4099c != d.f4111e;
    }

    public c c() {
        return this.f4100d;
    }

    public int d() {
        return this.f4098a;
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
        return this.f4099c;
    }

    public int hashCode() {
        return Objects.hash(j0.class, Integer.valueOf(this.f4098a), this.b, this.f4099c, this.f4100d);
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f4099c + ", hashType: " + this.f4100d + ", publicExponent: " + this.b + ", and " + this.f4098a + "-bit modulus)";
    }

    public j0(int i10, BigInteger bigInteger, d dVar, c cVar) {
        this.f4098a = i10;
        this.b = bigInteger;
        this.f4099c = dVar;
        this.f4100d = cVar;
    }
}
