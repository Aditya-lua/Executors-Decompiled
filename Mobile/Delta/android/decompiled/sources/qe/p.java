package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends qe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29756a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29758d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f29759a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f29760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f29761d;

        public p a() throws GeneralSecurityException {
            Integer num = this.f29759a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f29761d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f29760c != null) {
                return new p(num.intValue(), this.b.intValue(), this.f29760c.intValue(), this.f29761d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29759a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f29760c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f29761d = cVar;
            return this;
        }

        public b() {
            this.f29759a = null;
            this.b = null;
            this.f29760c = null;
            this.f29761d = c.f29763d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29762c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f29763d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29764a;

        public c(String str) {
            this.f29764a = str;
        }

        public String toString() {
            return this.f29764a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29758d != c.f29763d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29756a;
    }

    public int e() {
        return this.f29757c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.d() == d() && pVar.c() == c() && pVar.e() == e() && pVar.f() == f();
    }

    public c f() {
        return this.f29758d;
    }

    public int hashCode() {
        return Objects.hash(p.class, Integer.valueOf(this.f29756a), Integer.valueOf(this.b), Integer.valueOf(this.f29757c), this.f29758d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f29758d + ", " + this.b + "-byte IV, " + this.f29757c + "-byte tag, and " + this.f29756a + "-byte key)";
    }

    public p(int i10, int i11, int i12, c cVar) {
        this.f29756a = i10;
        this.b = i11;
        this.f29757c = i12;
        this.f29758d = cVar;
    }
}
