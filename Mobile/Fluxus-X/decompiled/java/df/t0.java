package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f12373a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f12374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f12375d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f12376a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f12377c;

        public t0 a() throws GeneralSecurityException {
            if (this.f12376a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f12376a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f12376a.a() && this.f12377c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f12376a.a() && this.f12377c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t0(this.f12376a, this.b, b(), this.f12377c);
        }

        public final gf.a b() {
            if (this.f12376a.h() == r0.d.f12359e) {
                return ye.e0.f37741a;
            }
            if (this.f12376a.h() == r0.d.f12358d || this.f12376a.h() == r0.d.f12357c) {
                return ye.e0.a(this.f12377c.intValue());
            }
            if (this.f12376a.h() == r0.d.b) {
                return ye.e0.b(this.f12377c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + this.f12376a.h());
        }

        public b c(Integer num) {
            this.f12377c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(r0 r0Var) {
            this.f12376a = r0Var;
            return this;
        }

        public b() {
            this.f12376a = null;
            this.b = null;
            this.f12377c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f12375d;
    }

    @Override // df.c1
    public gf.a b() {
        return this.f12374c;
    }

    public BigInteger d() {
        return this.b;
    }

    public r0 e() {
        return this.f12373a;
    }

    public t0(r0 r0Var, BigInteger bigInteger, gf.a aVar, Integer num) {
        this.f12373a = r0Var;
        this.b = bigInteger;
        this.f12374c = aVar;
        this.f12375d = num;
    }
}
