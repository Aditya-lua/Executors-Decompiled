package xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35715a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f35716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f35717d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f35718a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f35719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f35720d;

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
            if (cVar == c.f35721c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f35722d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f35723e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f35724f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public o a() throws GeneralSecurityException {
            Integer num = this.f35718a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f35719c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f35720d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f35718a));
            }
            f(this.b.intValue(), this.f35719c);
            return new o(this.f35718a.intValue(), this.b.intValue(), this.f35720d, this.f35719c);
        }

        public b b(c cVar) {
            this.f35719c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f35718a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f35720d = dVar;
            return this;
        }

        public b() {
            this.f35718a = null;
            this.b = null;
            this.f35719c = null;
            this.f35720d = d.f35728e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f35721c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f35722d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f35723e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f35724f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35725a;

        public c(String str) {
            this.f35725a = str;
        }

        public String toString() {
            return this.f35725a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f35726c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f35727d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f35728e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35729a;

        public d(String str) {
            this.f35729a = str;
        }

        public String toString() {
            return this.f35729a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f35716c != d.f35728e;
    }

    public int c() {
        return this.b;
    }

    public c d() {
        return this.f35717d;
    }

    public int e() {
        return this.f35715a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.e() == e() && oVar.f() == f() && oVar.g() == g() && oVar.d() == d();
    }

    public int f() {
        d dVar = this.f35716c;
        if (dVar == d.f35728e) {
            return c();
        }
        if (dVar != d.b && dVar != d.f35726c && dVar != d.f35727d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f35716c;
    }

    public int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f35715a), Integer.valueOf(this.b), this.f35716c, this.f35717d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f35716c + ", hashType: " + this.f35717d + ", " + this.b + "-byte tags, and " + this.f35715a + "-byte key)";
    }

    public o(int i10, int i11, d dVar, c cVar) {
        this.f35715a = i10;
        this.b = i11;
        this.f35716c = dVar;
        this.f35717d = cVar;
    }
}
