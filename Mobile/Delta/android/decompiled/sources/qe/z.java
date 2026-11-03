package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends qe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29822a;
    public final c b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f29823a;
        public c b;

        public z a() throws GeneralSecurityException {
            Integer num = this.f29823a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b != null) {
                return new z(num.intValue(), this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29823a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.b = cVar;
            return this;
        }

        public b() {
            this.f29823a = null;
            this.b = c.f29825d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29824c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f29825d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29826a;

        public c(String str) {
            this.f29826a = str;
        }

        public String toString() {
            return this.f29826a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.b != c.f29825d;
    }

    public int c() {
        return this.f29822a;
    }

    public c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.c() == c() && zVar.d() == d();
    }

    public int hashCode() {
        return Objects.hash(z.class, Integer.valueOf(this.f29822a), this.b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.b + ", " + this.f29822a + "-byte key)";
    }

    public z(int i10, c cVar) {
        this.f29822a = i10;
        this.b = cVar;
    }
}
