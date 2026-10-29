package af;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f503a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f505d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f506a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f507c;

        public t0 a() throws GeneralSecurityException {
            if (this.f506a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f506a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f506a.a() && this.f507c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f506a.a() && this.f507c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t0(this.f506a, this.b, b(), this.f507c);
        }

        public final df.a b() {
            if (this.f506a.h() == r0.d.f489e) {
                return ve.e0.f32930a;
            }
            if (this.f506a.h() == r0.d.f488d || this.f506a.h() == r0.d.f487c) {
                return ve.e0.a(this.f507c.intValue());
            }
            if (this.f506a.h() == r0.d.b) {
                return ve.e0.b(this.f507c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + this.f506a.h());
        }

        public b c(Integer num) {
            this.f507c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(r0 r0Var) {
            this.f506a = r0Var;
            return this;
        }

        public b() {
            this.f506a = null;
            this.b = null;
            this.f507c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // oe.l
    public Integer a() {
        return this.f505d;
    }

    @Override // af.c1
    public df.a b() {
        return this.f504c;
    }

    public BigInteger d() {
        return this.b;
    }

    public r0 e() {
        return this.f503a;
    }

    public t0(r0 r0Var, BigInteger bigInteger, df.a aVar, Integer num) {
        this.f503a = r0Var;
        this.b = bigInteger;
        this.f504c = aVar;
        this.f505d = num;
    }
}
