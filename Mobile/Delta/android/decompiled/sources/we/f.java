package we;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34196a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f34197c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f34198a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f34199c;

        public f a() throws GeneralSecurityException {
            Integer num = this.f34198a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f34199c != null) {
                return new f(num.intValue(), this.b.intValue(), this.f34199c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f34198a = Integer.valueOf(i10);
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
            this.f34199c = cVar;
            return this;
        }

        public b() {
            this.f34198a = null;
            this.b = null;
            this.f34199c = c.f34202e;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f34200c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f34201d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f34202e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34203a;

        public c(String str) {
            this.f34203a = str;
        }

        public String toString() {
            return this.f34203a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f34197c != c.f34202e;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f34196a;
    }

    public int e() {
        c cVar = this.f34197c;
        if (cVar == c.f34202e) {
            return c();
        }
        if (cVar != c.b && cVar != c.f34200c && cVar != c.f34201d) {
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
        return this.f34197c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f34196a), Integer.valueOf(this.b), this.f34197c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f34197c + ", " + this.b + "-byte tags, and " + this.f34196a + "-byte key)";
    }

    public f(int i10, int i11, c cVar) {
        this.f34196a = i10;
        this.b = i11;
        this.f34197c = cVar;
    }
}
