package af;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f453a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f455d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f456a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f457c;

        public l0 a() throws GeneralSecurityException {
            if (this.f456a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f456a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f456a.a() && this.f457c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f456a.a() && this.f457c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l0(this.f456a, this.b, b(), this.f457c);
        }

        public final df.a b() {
            if (this.f456a.f() == j0.d.f439e) {
                return ve.e0.f32930a;
            }
            if (this.f456a.f() == j0.d.f438d || this.f456a.f() == j0.d.f437c) {
                return ve.e0.a(this.f457c.intValue());
            }
            if (this.f456a.f() == j0.d.b) {
                return ve.e0.b(this.f457c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f456a.f());
        }

        public b c(Integer num) {
            this.f457c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(j0 j0Var) {
            this.f456a = j0Var;
            return this;
        }

        public b() {
            this.f456a = null;
            this.b = null;
            this.f457c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f455d;
    }

    @Override // af.c1
    public df.a b() {
        return this.f454c;
    }

    public BigInteger d() {
        return this.b;
    }

    public j0 e() {
        return this.f453a;
    }

    public l0(j0 j0Var, BigInteger bigInteger, df.a aVar, Integer num) {
        this.f453a = j0Var;
        this.b = bigInteger;
        this.f454c = aVar;
        this.f455d = num;
    }
}
