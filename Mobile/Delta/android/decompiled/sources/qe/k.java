package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends qe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29717a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f29720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f29721f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f29722a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f29723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f29724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f29725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f29726f;

        public static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f29727c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f29728d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f29729e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f29730f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public k a() throws GeneralSecurityException {
            if (this.f29722a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f29723c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f29724d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f29725e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f29726f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f29725e);
            return new k(this.f29722a.intValue(), this.b.intValue(), this.f29723c.intValue(), this.f29724d.intValue(), this.f29726f, this.f29725e);
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29722a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f29725e = cVar;
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
            this.f29723c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f29724d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f29726f = dVar;
            return this;
        }

        public b() {
            this.f29722a = null;
            this.b = null;
            this.f29723c = null;
            this.f29724d = null;
            this.f29725e = null;
            this.f29726f = d.f29733d;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29727c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f29728d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f29729e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f29730f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29731a;

        public c(String str) {
            this.f29731a = str;
        }

        public String toString() {
            return this.f29731a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f29732c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f29733d = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29734a;

        public d(String str) {
            this.f29734a = str;
        }

        public String toString() {
            return this.f29734a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29720e != d.f29733d;
    }

    public int c() {
        return this.f29717a;
    }

    public c d() {
        return this.f29721f;
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
        return this.f29718c;
    }

    public int g() {
        return this.f29719d;
    }

    public d h() {
        return this.f29720e;
    }

    public int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f29717a), Integer.valueOf(this.b), Integer.valueOf(this.f29718c), Integer.valueOf(this.f29719d), this.f29720e, this.f29721f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f29720e + ", hashType: " + this.f29721f + ", " + this.f29718c + "-byte IV, and " + this.f29719d + "-byte tags, and " + this.f29717a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }

    public k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f29717a = i10;
        this.b = i11;
        this.f29718c = i12;
        this.f29719d = i13;
        this.f29720e = dVar;
        this.f29721f = cVar;
    }
}
