package ze;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39266a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f39267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f39268d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f39269a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f39270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f39271d;

        public static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f39272c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f39273d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f39274e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f39275f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public o a() throws GeneralSecurityException {
            Integer num = this.f39269a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f39270c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f39271d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f39269a));
            }
            f(this.b.intValue(), this.f39270c);
            return new o(this.f39269a.intValue(), this.b.intValue(), this.f39271d, this.f39270c);
        }

        public b b(c cVar) {
            this.f39270c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f39269a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f39271d = dVar;
            return this;
        }

        public b() {
            this.f39269a = null;
            this.b = null;
            this.f39270c = null;
            this.f39271d = d.f39279e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39272c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f39273d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f39274e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f39275f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39276a;

        public c(String str) {
            this.f39276a = str;
        }

        public String toString() {
            return this.f39276a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f39277c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f39278d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f39279e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39280a;

        public d(String str) {
            this.f39280a = str;
        }

        public String toString() {
            return this.f39280a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f39267c != d.f39279e;
    }

    public int c() {
        return this.b;
    }

    public c d() {
        return this.f39268d;
    }

    public int e() {
        return this.f39266a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.e() == e() && oVar.f() == f() && oVar.g() == g() && oVar.d() == d();
    }

    public int f() {
        d dVar = this.f39267c;
        if (dVar == d.f39279e) {
            return c();
        }
        if (dVar != d.b && dVar != d.f39277c && dVar != d.f39278d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f39267c;
    }

    public int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f39266a), Integer.valueOf(this.b), this.f39267c, this.f39268d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f39267c + ", hashType: " + this.f39268d + ", " + this.b + "-byte tags, and " + this.f39266a + "-byte key)";
    }

    public o(int i10, int i11, d dVar, c cVar) {
        this.f39266a = i10;
        this.b = i11;
        this.f39267c = dVar;
        this.f39268d = cVar;
    }
}
