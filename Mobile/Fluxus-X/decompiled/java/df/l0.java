package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f12323a;
    public final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f12324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f12325d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f12326a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f12327c;

        public l0 a() throws GeneralSecurityException {
            if (this.f12326a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iD = this.f12326a.d();
            if (iBitLength != iD) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iD);
            }
            if (this.f12326a.a() && this.f12327c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f12326a.a() && this.f12327c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l0(this.f12326a, this.b, b(), this.f12327c);
        }

        public final gf.a b() {
            if (this.f12326a.f() == j0.d.f12309e) {
                return ye.e0.f37741a;
            }
            if (this.f12326a.f() == j0.d.f12308d || this.f12326a.f() == j0.d.f12307c) {
                return ye.e0.a(this.f12327c.intValue());
            }
            if (this.f12326a.f() == j0.d.b) {
                return ye.e0.b(this.f12327c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f12326a.f());
        }

        public b c(Integer num) {
            this.f12327c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(j0 j0Var) {
            this.f12326a = j0Var;
            return this;
        }

        public b() {
            this.f12326a = null;
            this.b = null;
            this.f12327c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // re.l
    public Integer a() {
        return this.f12325d;
    }

    @Override // df.c1
    public gf.a b() {
        return this.f12324c;
    }

    public BigInteger d() {
        return this.b;
    }

    public j0 e() {
        return this.f12323a;
    }

    public l0(j0 j0Var, BigInteger bigInteger, gf.a aVar, Integer num) {
        this.f12323a = j0Var;
        this.b = bigInteger;
        this.f12324c = aVar;
        this.f12325d = num;
    }
}
