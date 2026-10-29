package pe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends pe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28469a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f28472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f28473f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f28474a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f28475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f28476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f28477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f28478f;

        public static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f28479c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f28480d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f28481e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f28482f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public k a() throws GeneralSecurityException {
            if (this.f28474a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f28475c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f28476d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f28477e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f28478f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f28477e);
            return new k(this.f28474a.intValue(), this.b.intValue(), this.f28475c.intValue(), this.f28476d.intValue(), this.f28478f, this.f28477e);
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f28474a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f28477e = cVar;
            return this;
        }

        public b d(int i10) throws InvalidAlgorithmParameterException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f28475c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f28476d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f28478f = dVar;
            return this;
        }

        public b() {
            this.f28474a = null;
            this.b = null;
            this.f28475c = null;
            this.f28476d = null;
            this.f28477e = null;
            this.f28478f = d.f28485d;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f28479c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f28480d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f28481e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f28482f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28483a;

        public c(String str) {
            this.f28483a = str;
        }

        public String toString() {
            return this.f28483a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f28484c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f28485d = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28486a;

        public d(String str) {
            this.f28486a = str;
        }

        public String toString() {
            return this.f28486a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f28472e != d.f28485d;
    }

    public int c() {
        return this.f28469a;
    }

    public c d() {
        return this.f28473f;
    }

    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.c() == c() && kVar.e() == e() && kVar.f() == f() && kVar.g() == g() && kVar.h() == h() && kVar.d() == d();
    }

    public int f() {
        return this.f28470c;
    }

    public int g() {
        return this.f28471d;
    }

    public d h() {
        return this.f28472e;
    }

    public int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f28469a), Integer.valueOf(this.b), Integer.valueOf(this.f28470c), Integer.valueOf(this.f28471d), this.f28472e, this.f28473f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f28472e + ", hashType: " + this.f28473f + ", " + this.f28470c + "-byte IV, and " + this.f28471d + "-byte tags, and " + this.f28469a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }

    public k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f28469a = i10;
        this.b = i11;
        this.f28470c = i12;
        this.f28471d = i13;
        this.f28472e = dVar;
        this.f28473f = cVar;
    }
}
