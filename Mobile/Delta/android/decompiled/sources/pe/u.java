package pe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends pe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28543a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f28545d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f28546a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f28547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f28548d;

        public u a() throws GeneralSecurityException {
            Integer num = this.f28546a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f28548d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f28547c != null) {
                return new u(num.intValue(), this.b.intValue(), this.f28547c.intValue(), this.f28548d);
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
            this.f28546a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f28547c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f28548d = cVar;
            return this;
        }

        public b() {
            this.f28546a = null;
            this.b = null;
            this.f28547c = null;
            this.f28548d = c.f28550d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f28549c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f28550d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28551a;

        public c(String str) {
            this.f28551a = str;
        }

        public String toString() {
            return this.f28551a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f28545d != c.f28550d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f28543a;
    }

    public int e() {
        return this.f28544c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.d() == d() && uVar.c() == c() && uVar.e() == e() && uVar.f() == f();
    }

    public c f() {
        return this.f28545d;
    }

    public int hashCode() {
        return Objects.hash(u.class, Integer.valueOf(this.f28543a), Integer.valueOf(this.b), Integer.valueOf(this.f28544c), this.f28545d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f28545d + ", " + this.b + "-byte IV, " + this.f28544c + "-byte tag, and " + this.f28543a + "-byte key)";
    }

    public u(int i10, int i11, int i12, c cVar) {
        this.f28543a = i10;
        this.b = i11;
        this.f28544c = i12;
        this.f28545d = cVar;
    }
}
