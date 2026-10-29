package p379qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10550p extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final int f37840a;

    /* JADX INFO: renamed from: b */
    public final int f37841b;

    /* JADX INFO: renamed from: c */
    public final int f37842c;

    /* JADX INFO: renamed from: d */
    public final c f37843d;

    /* JADX INFO: renamed from: qe.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f37844a;

        /* JADX INFO: renamed from: b */
        public Integer f37845b;

        /* JADX INFO: renamed from: c */
        public Integer f37846c;

        /* JADX INFO: renamed from: d */
        public c f37847d;

        /* JADX INFO: renamed from: a */
        public C10550p m40447a() throws GeneralSecurityException {
            Integer num = this.f37844a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f37845b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f37847d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f37846c != null) {
                return new C10550p(num.intValue(), this.f37845b.intValue(), this.f37846c.intValue(), this.f37847d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        /* JADX INFO: renamed from: b */
        public b m40448b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f37845b = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m40449c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f37844a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40450d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f37846c = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40451e(c cVar) {
            this.f37847d = cVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37844a = null;
            this.f37845b = null;
            this.f37846c = null;
            this.f37847d = c.f37850d;
        }
    }

    /* JADX INFO: renamed from: qe.p$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f37848b = new c("TINK");

        /* JADX INFO: renamed from: c */
        public static final c f37849c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final c f37850d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37851a;

        public c(String str) {
            this.f37851a = str;
        }

        public String toString() {
            return this.f37851a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40442b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37843d != c.f37850d;
    }

    /* JADX INFO: renamed from: c */
    public int m40443c() {
        return this.f37841b;
    }

    /* JADX INFO: renamed from: d */
    public int m40444d() {
        return this.f37840a;
    }

    /* JADX INFO: renamed from: e */
    public int m40445e() {
        return this.f37842c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10550p)) {
            return false;
        }
        C10550p c10550p = (C10550p) obj;
        return c10550p.m40444d() == m40444d() && c10550p.m40443c() == m40443c() && c10550p.m40445e() == m40445e() && c10550p.m40446f() == m40446f();
    }

    /* JADX INFO: renamed from: f */
    public c m40446f() {
        return this.f37843d;
    }

    public int hashCode() {
        return Objects.hash(C10550p.class, Integer.valueOf(this.f37840a), Integer.valueOf(this.f37841b), Integer.valueOf(this.f37842c), this.f37843d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f37843d + ", " + this.f37841b + "-byte IV, " + this.f37842c + "-byte tag, and " + this.f37840a + "-byte key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10550p(int i10, int i11, int i12, c cVar) {
        this.f37840a = i10;
        this.f37841b = i11;
        this.f37842c = i12;
        this.f37843d = cVar;
    }
}
