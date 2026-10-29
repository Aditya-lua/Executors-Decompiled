package p544xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: xe.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C12808f extends AbstractC12820r {

    /* JADX INFO: renamed from: a */
    public final int f45558a;

    /* JADX INFO: renamed from: b */
    public final int f45559b;

    /* JADX INFO: renamed from: c */
    public final c f45560c;

    /* JADX INFO: renamed from: xe.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f45561a;

        /* JADX INFO: renamed from: b */
        public Integer f45562b;

        /* JADX INFO: renamed from: c */
        public c f45563c;

        /* JADX INFO: renamed from: a */
        public C12808f m47704a() throws GeneralSecurityException {
            Integer num = this.f45561a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f45562b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f45563c != null) {
                return new C12808f(num.intValue(), this.f45562b.intValue(), this.f45563c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        /* JADX INFO: renamed from: b */
        public b m47705b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f45561a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m47706c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f45562b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        /* JADX INFO: renamed from: d */
        public b m47707d(c cVar) {
            this.f45563c = cVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f45561a = null;
            this.f45562b = null;
            this.f45563c = c.f45567e;
        }
    }

    /* JADX INFO: renamed from: xe.f$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f45564b = new c("TINK");

        /* JADX INFO: renamed from: c */
        public static final c f45565c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final c f45566d = new c("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final c f45567e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f45568a;

        public c(String str) {
            this.f45568a = str;
        }

        public String toString() {
            return this.f45568a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m47699b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f45560c != c.f45567e;
    }

    /* JADX INFO: renamed from: c */
    public int m47700c() {
        return this.f45559b;
    }

    /* JADX INFO: renamed from: d */
    public int m47701d() {
        return this.f45558a;
    }

    /* JADX INFO: renamed from: e */
    public int m47702e() {
        c cVar = this.f45560c;
        if (cVar == c.f45567e) {
            return m47700c();
        }
        if (cVar != c.f45564b && cVar != c.f45565c && cVar != c.f45566d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iM47700c = m47700c();
        return iM47700c + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12808f)) {
            return false;
        }
        C12808f c12808f = (C12808f) obj;
        return c12808f.m47701d() == m47701d() && c12808f.m47702e() == m47702e() && c12808f.m47703f() == m47703f();
    }

    /* JADX INFO: renamed from: f */
    public c m47703f() {
        return this.f45560c;
    }

    public int hashCode() {
        return Objects.hash(C12808f.class, Integer.valueOf(this.f45558a), Integer.valueOf(this.f45559b), this.f45560c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f45560c + ", " + this.f45559b + "-byte tags, and " + this.f45558a + "-byte key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12808f(int i10, int i11, c cVar) {
        this.f45558a = i10;
        this.f45559b = i11;
        this.f45560c = cVar;
    }
}
