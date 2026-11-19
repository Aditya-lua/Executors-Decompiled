package se;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends se.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31348a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f31351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f31352f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f31353a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f31354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f31355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f31356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f31357f;

        public static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f31358c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f31359d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f31360e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f31361f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public k a() throws GeneralSecurityException {
            if (this.f31353a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f31354c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f31355d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f31356e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f31357f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f31356e);
            return new k(this.f31353a.intValue(), this.b.intValue(), this.f31354c.intValue(), this.f31355d.intValue(), this.f31357f, this.f31356e);
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f31353a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f31356e = cVar;
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
            this.f31354c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f31355d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f31357f = dVar;
            return this;
        }

        public b() {
            this.f31353a = null;
            this.b = null;
            this.f31354c = null;
            this.f31355d = null;
            this.f31356e = null;
            this.f31357f = d.f31364d;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f31358c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f31359d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f31360e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f31361f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31362a;

        public c(String str) {
            this.f31362a = str;
        }

        public String toString() {
            return this.f31362a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f31363c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f31364d = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31365a;

        public d(String str) {
            this.f31365a = str;
        }

        public String toString() {
            return this.f31365a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f31351e != d.f31364d;
    }

    public int c() {
        return this.f31348a;
    }

    public c d() {
        return this.f31352f;
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
        return this.f31349c;
    }

    public int g() {
        return this.f31350d;
    }

    public d h() {
        return this.f31351e;
    }

    public int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f31348a), Integer.valueOf(this.b), Integer.valueOf(this.f31349c), Integer.valueOf(this.f31350d), this.f31351e, this.f31352f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f31351e + ", hashType: " + this.f31352f + ", " + this.f31349c + "-byte IV, and " + this.f31350d + "-byte tags, and " + this.f31348a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }

    public k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f31348a = i10;
        this.b = i11;
        this.f31349c = i12;
        this.f31350d = i13;
        this.f31351e = dVar;
        this.f31352f = cVar;
    }
}
