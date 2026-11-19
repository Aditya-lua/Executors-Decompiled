package ze;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39246a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f39247c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f39248a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f39249c;

        public f a() throws GeneralSecurityException {
            Integer num = this.f39248a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f39249c != null) {
                return new f(num.intValue(), this.b.intValue(), this.f39249c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f39248a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f39249c = cVar;
            return this;
        }

        public b() {
            this.f39248a = null;
            this.b = null;
            this.f39249c = c.f39252e;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39250c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f39251d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f39252e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39253a;

        public c(String str) {
            this.f39253a = str;
        }

        public String toString() {
            return this.f39253a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f39247c != c.f39252e;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f39246a;
    }

    public int e() {
        c cVar = this.f39247c;
        if (cVar == c.f39252e) {
            return c();
        }
        if (cVar != c.b && cVar != c.f39250c && cVar != c.f39251d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.d() == d() && fVar.e() == e() && fVar.f() == f();
    }

    public c f() {
        return this.f39247c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f39246a), Integer.valueOf(this.b), this.f39247c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f39247c + ", " + this.b + "-byte tags, and " + this.f39246a + "-byte key)";
    }

    public f(int i10, int i11, c cVar) {
        this.f39246a = i10;
        this.b = i11;
        this.f39247c = cVar;
    }
}
