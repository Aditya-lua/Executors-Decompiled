package p379qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C10575z extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final int f37927a;

    /* JADX INFO: renamed from: b */
    public final c f37928b;

    /* JADX INFO: renamed from: qe.z$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f37929a;

        /* JADX INFO: renamed from: b */
        public c f37930b;

        /* JADX INFO: renamed from: a */
        public C10575z m40532a() throws GeneralSecurityException {
            Integer num = this.f37929a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f37930b != null) {
                return new C10575z(num.intValue(), this.f37930b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        /* JADX INFO: renamed from: b */
        public b m40533b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f37929a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m40534c(c cVar) {
            this.f37930b = cVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37929a = null;
            this.f37930b = c.f37933d;
        }
    }

    /* JADX INFO: renamed from: qe.z$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f37931b = new c("TINK");

        /* JADX INFO: renamed from: c */
        public static final c f37932c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final c f37933d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37934a;

        public c(String str) {
            this.f37934a = str;
        }

        public String toString() {
            return this.f37934a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40529b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37928b != c.f37933d;
    }

    /* JADX INFO: renamed from: c */
    public int m40530c() {
        return this.f37927a;
    }

    /* JADX INFO: renamed from: d */
    public c m40531d() {
        return this.f37928b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10575z)) {
            return false;
        }
        C10575z c10575z = (C10575z) obj;
        return c10575z.m40530c() == m40530c() && c10575z.m40531d() == m40531d();
    }

    public int hashCode() {
        return Objects.hash(C10575z.class, Integer.valueOf(this.f37927a), this.f37928b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f37928b + ", " + this.f37927a + "-byte key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10575z(int i10, c cVar) {
        this.f37927a = i10;
        this.f37928b = cVar;
    }
}
