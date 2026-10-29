package p379qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C10565u extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final int f37886a;

    /* JADX INFO: renamed from: b */
    public final int f37887b;

    /* JADX INFO: renamed from: c */
    public final int f37888c;

    /* JADX INFO: renamed from: d */
    public final c f37889d;

    /* JADX INFO: renamed from: qe.u$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f37890a;

        /* JADX INFO: renamed from: b */
        public Integer f37891b;

        /* JADX INFO: renamed from: c */
        public Integer f37892c;

        /* JADX INFO: renamed from: d */
        public c f37893d;

        /* JADX INFO: renamed from: a */
        public C10565u m40500a() throws GeneralSecurityException {
            Integer num = this.f37890a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f37893d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f37891b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f37892c != null) {
                return new C10565u(num.intValue(), this.f37891b.intValue(), this.f37892c.intValue(), this.f37893d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        /* JADX INFO: renamed from: b */
        public b m40501b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f37891b = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m40502c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f37890a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40503d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f37892c = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40504e(c cVar) {
            this.f37893d = cVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37890a = null;
            this.f37891b = null;
            this.f37892c = null;
            this.f37893d = c.f37896d;
        }
    }

    /* JADX INFO: renamed from: qe.u$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f37894b = new c("TINK");

        /* JADX INFO: renamed from: c */
        public static final c f37895c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final c f37896d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37897a;

        public c(String str) {
            this.f37897a = str;
        }

        public String toString() {
            return this.f37897a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40495b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37889d != c.f37896d;
    }

    /* JADX INFO: renamed from: c */
    public int m40496c() {
        return this.f37887b;
    }

    /* JADX INFO: renamed from: d */
    public int m40497d() {
        return this.f37886a;
    }

    /* JADX INFO: renamed from: e */
    public int m40498e() {
        return this.f37888c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10565u)) {
            return false;
        }
        C10565u c10565u = (C10565u) obj;
        return c10565u.m40497d() == m40497d() && c10565u.m40496c() == m40496c() && c10565u.m40498e() == m40498e() && c10565u.m40499f() == m40499f();
    }

    /* JADX INFO: renamed from: f */
    public c m40499f() {
        return this.f37889d;
    }

    public int hashCode() {
        return Objects.hash(C10565u.class, Integer.valueOf(this.f37886a), Integer.valueOf(this.f37887b), Integer.valueOf(this.f37888c), this.f37889d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f37889d + ", " + this.f37887b + "-byte IV, " + this.f37888c + "-byte tag, and " + this.f37886a + "-byte key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10565u(int i10, int i11, int i12, c cVar) {
        this.f37886a = i10;
        this.f37887b = i11;
        this.f37888c = i12;
        this.f37889d = cVar;
    }
}
