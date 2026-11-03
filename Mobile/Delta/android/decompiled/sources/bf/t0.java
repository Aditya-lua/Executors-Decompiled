package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f4175a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f4176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4177d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f4178a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f4179c;

        public t0 a() throws GeneralSecurityException {
            if (this.f4178a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f4178a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f4178a.a() && this.f4179c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f4178a.a() && this.f4179c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t0(this.f4178a, this.b, b(), this.f4179c);
        }

        public final ef.a b() {
            if (this.f4178a.h() == r0.d.f4161e) {
                return we.e0.f34384a;
            }
            if (this.f4178a.h() == r0.d.f4160d || this.f4178a.h() == r0.d.f4159c) {
                return we.e0.a(this.f4179c.intValue());
            }
            if (this.f4178a.h() == r0.d.b) {
                return we.e0.b(this.f4179c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + this.f4178a.h());
        }

        public b c(Integer num) {
            this.f4179c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(r0 r0Var) {
            this.f4178a = r0Var;
            return this;
        }

        public b() {
            this.f4178a = null;
            this.b = null;
            this.f4179c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f4177d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4176c;
    }

    public BigInteger d() {
        return this.b;
    }

    public r0 e() {
        return this.f4175a;
    }

    public t0(r0 r0Var, BigInteger bigInteger, ef.a aVar, Integer num) {
        this.f4175a = r0Var;
        this.b = bigInteger;
        this.f4176c = aVar;
        this.f4177d = num;
    }
}
