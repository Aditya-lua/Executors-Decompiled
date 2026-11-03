package bf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f4143g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4144a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f4146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f4147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4148f;

    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final BigInteger f4149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final BigInteger f4150h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f4151a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f4152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f4153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f4154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f4155f;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f4149g = bigIntegerValueOf;
            f4150h = bigIntegerValueOf.pow(Barcode.FORMAT_QR_CODE);
        }

        public r0 a() throws GeneralSecurityException {
            Integer num = this.f4151a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f4152c == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f4153d == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f4155f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f4154e == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f4151a, Integer.valueOf(Barcode.FORMAT_PDF417)));
            }
            if (this.f4152c != this.f4153d) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            h(this.b);
            return new r0(this.f4151a.intValue(), this.b, this.f4155f, this.f4152c, this.f4153d, this.f4154e.intValue());
        }

        public b b(c cVar) {
            this.f4153d = cVar;
            return this;
        }

        public b c(int i10) {
            this.f4151a = Integer.valueOf(i10);
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
            this.f4154e = Integer.valueOf(i10);
            return this;
        }

        public b f(c cVar) {
            this.f4152c = cVar;
            return this;
        }

        public b g(d dVar) {
            this.f4155f = dVar;
            return this;
        }

        public final void h(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(r0.f4143g);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f4149g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f4150h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f4151a = null;
            this.b = r0.f4143g;
            this.f4152c = null;
            this.f4153d = null;
            this.f4154e = null;
            this.f4155f = d.f4161e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f4156c = new c("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f4157d = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4158a;

        public c(String str) {
            this.f4158a = str;
        }

        public String toString() {
            return this.f4158a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f4159c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f4160d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f4161e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4162a;

        public d(String str) {
            this.f4162a = str;
        }

        public String toString() {
            return this.f4162a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4145c != d.f4161e;
    }

    public c c() {
        return this.f4147e;
    }

    public int d() {
        return this.f4144a;
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
        return this.f4148f;
    }

    public c g() {
        return this.f4146d;
    }

    public d h() {
        return this.f4145c;
    }

    public int hashCode() {
        return Objects.hash(r0.class, Integer.valueOf(this.f4144a), this.b, this.f4145c, this.f4146d, this.f4147e, Integer.valueOf(this.f4148f));
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f4145c + ", signature hashType: " + this.f4146d + ", mgf1 hashType: " + this.f4147e + ", saltLengthBytes: " + this.f4148f + ", publicExponent: " + this.b + ", and " + this.f4144a + "-bit modulus)";
    }

    public r0(int i10, BigInteger bigInteger, d dVar, c cVar, c cVar2, int i11) {
        this.f4144a = i10;
        this.b = bigInteger;
        this.f4145c = dVar;
        this.f4146d = cVar;
        this.f4147e = cVar2;
        this.f4148f = i11;
    }
}
