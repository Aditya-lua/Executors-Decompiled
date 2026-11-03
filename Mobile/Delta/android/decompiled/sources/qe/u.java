package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends qe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29791a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29793d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f29794a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f29795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f29796d;

        public u a() throws GeneralSecurityException {
            Integer num = this.f29794a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f29796d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f29795c != null) {
                return new u(num.intValue(), this.b.intValue(), this.f29795c.intValue(), this.f29796d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29794a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f29795c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f29796d = cVar;
            return this;
        }

        public b() {
            this.f29794a = null;
            this.b = null;
            this.f29795c = null;
            this.f29796d = c.f29798d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29797c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f29798d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29799a;

        public c(String str) {
            this.f29799a = str;
        }

        public String toString() {
            return this.f29799a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29793d != c.f29798d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29791a;
    }

    public int e() {
        return this.f29792c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.d() == d() && uVar.c() == c() && uVar.e() == e() && uVar.f() == f();
    }

    public c f() {
        return this.f29793d;
    }

    public int hashCode() {
        return Objects.hash(u.class, Integer.valueOf(this.f29791a), Integer.valueOf(this.b), Integer.valueOf(this.f29792c), this.f29793d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f29793d + ", " + this.b + "-byte IV, " + this.f29792c + "-byte tag, and " + this.f29791a + "-byte key)";
    }

    public u(int i10, int i11, int i12, c cVar) {
        this.f29791a = i10;
        this.b = i11;
        this.f29792c = i12;
        this.f29793d = cVar;
    }
}
