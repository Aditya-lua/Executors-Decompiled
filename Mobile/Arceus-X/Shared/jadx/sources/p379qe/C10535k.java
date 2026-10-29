package p379qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: qe.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10535k extends AbstractC10511c {

    /* JADX INFO: renamed from: a */
    public final int f37786a;

    /* JADX INFO: renamed from: b */
    public final int f37787b;

    /* JADX INFO: renamed from: c */
    public final int f37788c;

    /* JADX INFO: renamed from: d */
    public final int f37789d;

    /* JADX INFO: renamed from: e */
    public final d f37790e;

    /* JADX INFO: renamed from: f */
    public final c f37791f;

    /* JADX INFO: renamed from: qe.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f37792a;

        /* JADX INFO: renamed from: b */
        public Integer f37793b;

        /* JADX INFO: renamed from: c */
        public Integer f37794c;

        /* JADX INFO: renamed from: d */
        public Integer f37795d;

        /* JADX INFO: renamed from: e */
        public c f37796e;

        /* JADX INFO: renamed from: f */
        public d f37797f;

        /* JADX INFO: renamed from: h */
        public static void m40395h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.f37798b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f37799c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f37800d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f37801e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f37802f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public C10535k m40396a() throws GeneralSecurityException {
            if (this.f37792a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f37793b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f37794c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f37795d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f37796e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f37797f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            m40395h(num.intValue(), this.f37796e);
            return new C10535k(this.f37792a.intValue(), this.f37793b.intValue(), this.f37794c.intValue(), this.f37795d.intValue(), this.f37797f, this.f37796e);
        }

        /* JADX INFO: renamed from: b */
        public b m40397b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f37792a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m40398c(c cVar) {
            this.f37796e = cVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40399d(int i10) throws InvalidAlgorithmParameterException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.f37793b = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40400e(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f37794c = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m40401f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f37795d = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m40402g(d dVar) {
            this.f37797f = dVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f37792a = null;
            this.f37793b = null;
            this.f37794c = null;
            this.f37795d = null;
            this.f37796e = null;
            this.f37797f = d.f37806d;
        }
    }

    /* JADX INFO: renamed from: qe.k$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f37798b = new c("SHA1");

        /* JADX INFO: renamed from: c */
        public static final c f37799c = new c("SHA224");

        /* JADX INFO: renamed from: d */
        public static final c f37800d = new c("SHA256");

        /* JADX INFO: renamed from: e */
        public static final c f37801e = new c("SHA384");

        /* JADX INFO: renamed from: f */
        public static final c f37802f = new c("SHA512");

        /* JADX INFO: renamed from: a */
        public final String f37803a;

        public c(String str) {
            this.f37803a = str;
        }

        public String toString() {
            return this.f37803a;
        }
    }

    /* JADX INFO: renamed from: qe.k$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f37804b = new d("TINK");

        /* JADX INFO: renamed from: c */
        public static final d f37805c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final d f37806d = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f37807a;

        public d(String str) {
            this.f37807a = str;
        }

        public String toString() {
            return this.f37807a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m40388b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f37790e != d.f37806d;
    }

    /* JADX INFO: renamed from: c */
    public int m40389c() {
        return this.f37786a;
    }

    /* JADX INFO: renamed from: d */
    public c m40390d() {
        return this.f37791f;
    }

    /* JADX INFO: renamed from: e */
    public int m40391e() {
        return this.f37787b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10535k)) {
            return false;
        }
        C10535k c10535k = (C10535k) obj;
        return c10535k.m40389c() == m40389c() && c10535k.m40391e() == m40391e() && c10535k.m40392f() == m40392f() && c10535k.m40393g() == m40393g() && c10535k.m40394h() == m40394h() && c10535k.m40390d() == m40390d();
    }

    /* JADX INFO: renamed from: f */
    public int m40392f() {
        return this.f37788c;
    }

    /* JADX INFO: renamed from: g */
    public int m40393g() {
        return this.f37789d;
    }

    /* JADX INFO: renamed from: h */
    public d m40394h() {
        return this.f37790e;
    }

    public int hashCode() {
        return Objects.hash(C10535k.class, Integer.valueOf(this.f37786a), Integer.valueOf(this.f37787b), Integer.valueOf(this.f37788c), Integer.valueOf(this.f37789d), this.f37790e, this.f37791f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f37790e + ", hashType: " + this.f37791f + ", " + this.f37788c + "-byte IV, and " + this.f37789d + "-byte tags, and " + this.f37786a + "-byte AES key, and " + this.f37787b + "-byte HMAC key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10535k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f37786a = i10;
        this.f37787b = i11;
        this.f37788c = i12;
        this.f37789d = i13;
        this.f37790e = dVar;
        this.f37791f = cVar;
    }
}
