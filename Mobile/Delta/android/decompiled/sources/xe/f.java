package xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35695a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f35696c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f35697a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f35698c;

        public f a() throws GeneralSecurityException {
            Integer num = this.f35697a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f35698c != null) {
                return new f(num.intValue(), this.b.intValue(), this.f35698c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f35697a = Integer.valueOf(i10);
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
            this.f35698c = cVar;
            return this;
        }

        public b() {
            this.f35697a = null;
            this.b = null;
            this.f35698c = c.f35701e;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f35699c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f35700d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f35701e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35702a;

        public c(String str) {
            this.f35702a = str;
        }

        public String toString() {
            return this.f35702a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f35696c != c.f35701e;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f35695a;
    }

    public int e() {
        c cVar = this.f35696c;
        if (cVar == c.f35701e) {
            return c();
        }
        if (cVar != c.b && cVar != c.f35699c && cVar != c.f35700d) {
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
        return this.f35696c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f35695a), Integer.valueOf(this.b), this.f35696c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f35696c + ", " + this.b + "-byte tags, and " + this.f35695a + "-byte key)";
    }

    public f(int i10, int i11, c cVar) {
        this.f35695a = i10;
        this.b = i11;
        this.f35696c = cVar;
    }
}
