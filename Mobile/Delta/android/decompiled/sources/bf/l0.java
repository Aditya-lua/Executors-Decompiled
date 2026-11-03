package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f4125a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f4126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4127d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f4128a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f4129c;

        public l0 a() throws GeneralSecurityException {
            if (this.f4128a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f4128a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f4128a.a() && this.f4129c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f4128a.a() && this.f4129c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l0(this.f4128a, this.b, b(), this.f4129c);
        }

        public final ef.a b() {
            if (this.f4128a.f() == j0.d.f4111e) {
                return we.e0.f34384a;
            }
            if (this.f4128a.f() == j0.d.f4110d || this.f4128a.f() == j0.d.f4109c) {
                return we.e0.a(this.f4129c.intValue());
            }
            if (this.f4128a.f() == j0.d.b) {
                return we.e0.b(this.f4129c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f4128a.f());
        }

        public b c(Integer num) {
            this.f4129c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(j0 j0Var) {
            this.f4128a = j0Var;
            return this;
        }

        public b() {
            this.f4128a = null;
            this.b = null;
            this.f4129c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f4127d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4126c;
    }

    public BigInteger d() {
        return this.b;
    }

    public j0 e() {
        return this.f4125a;
    }

    public l0(j0 j0Var, BigInteger bigInteger, ef.a aVar, Integer num) {
        this.f4125a = j0Var;
        this.b = bigInteger;
        this.f4126c = aVar;
        this.f4127d = num;
    }
}
