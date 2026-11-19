package se;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends se.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31387a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f31389d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f31390a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f31391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f31392d;

        public p a() throws GeneralSecurityException {
            Integer num = this.f31390a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f31392d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f31391c != null) {
                return new p(num.intValue(), this.b.intValue(), this.f31391c.intValue(), this.f31392d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f31390a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f31391c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f31392d = cVar;
            return this;
        }

        public b() {
            this.f31390a = null;
            this.b = null;
            this.f31391c = null;
            this.f31392d = c.f31394d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f31393c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f31394d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31395a;

        public c(String str) {
            this.f31395a = str;
        }

        public String toString() {
            return this.f31395a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f31389d != c.f31394d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f31387a;
    }

    public int e() {
        return this.f31388c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.d() == d() && pVar.c() == c() && pVar.e() == e() && pVar.f() == f();
    }

    public c f() {
        return this.f31389d;
    }

    public int hashCode() {
        return Objects.hash(p.class, Integer.valueOf(this.f31387a), Integer.valueOf(this.b), Integer.valueOf(this.f31388c), this.f31389d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f31389d + ", " + this.b + "-byte IV, " + this.f31388c + "-byte tag, and " + this.f31387a + "-byte key)";
    }

    public p(int i10, int i11, int i12, c cVar) {
        this.f31387a = i10;
        this.b = i11;
        this.f31388c = i12;
        this.f31389d = cVar;
    }
}
