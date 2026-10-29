package af;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f425e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f426a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f428d;

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final BigInteger f429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final BigInteger f430f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f431a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f433d;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f429e = bigIntegerValueOf;
            f430f = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public j0 a() throws GeneralSecurityException {
            Integer num = this.f431a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f432c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f433d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f431a));
            }
            f(this.b);
            return new j0(this.f431a.intValue(), this.b, this.f433d, this.f432c);
        }

        public b b(c cVar) {
            this.f432c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f431a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(d dVar) {
            this.f433d = dVar;
            return this;
        }

        public final void f(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(j0.f425e);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f429e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f430f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f431a = null;
            this.b = j0.f425e;
            this.f432c = null;
            this.f433d = d.f439e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f434c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f435d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f436a;

        public c(String str) {
            this.f436a = str;
        }

        public String toString() {
            return this.f436a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f437c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f438d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f439e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f440a;

        public d(String str) {
            this.f440a = str;
        }

        public String toString() {
            return this.f440a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f427c != d.f439e;
    }

    public c c() {
        return this.f428d;
    }

    public int d() {
        return this.f426a;
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
        return this.f427c;
    }

    public int hashCode() {
        return Objects.hash(j0.class, Integer.valueOf(this.f426a), this.b, this.f427c, this.f428d);
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f427c + ", hashType: " + this.f428d + ", publicExponent: " + this.b + ", and " + this.f426a + "-bit modulus)";
    }

    public j0(int i10, BigInteger bigInteger, d dVar, c cVar) {
        this.f426a = i10;
        this.b = bigInteger;
        this.f427c = dVar;
        this.f428d = cVar;
    }
}
