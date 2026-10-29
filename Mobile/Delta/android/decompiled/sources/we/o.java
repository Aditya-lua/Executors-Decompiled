package we;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34216a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f34217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34218d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f34219a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f34220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f34221d;

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
            if (cVar == c.f34222c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f34223d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f34224e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f34225f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public o a() throws GeneralSecurityException {
            Integer num = this.f34219a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f34220c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f34221d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f34219a));
            }
            f(this.b.intValue(), this.f34220c);
            return new o(this.f34219a.intValue(), this.b.intValue(), this.f34221d, this.f34220c);
        }

        public b b(c cVar) {
            this.f34220c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f34219a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f34221d = dVar;
            return this;
        }

        public b() {
            this.f34219a = null;
            this.b = null;
            this.f34220c = null;
            this.f34221d = d.f34229e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f34222c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f34223d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f34224e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f34225f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34226a;

        public c(String str) {
            this.f34226a = str;
        }

        public String toString() {
            return this.f34226a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f34227c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f34228d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f34229e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34230a;

        public d(String str) {
            this.f34230a = str;
        }

        public String toString() {
            return this.f34230a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f34217c != d.f34229e;
    }

    public int c() {
        return this.b;
    }

    public c d() {
        return this.f34218d;
    }

    public int e() {
        return this.f34216a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.e() == e() && oVar.f() == f() && oVar.g() == g() && oVar.d() == d();
    }

    public int f() {
        d dVar = this.f34217c;
        if (dVar == d.f34229e) {
            return c();
        }
        if (dVar != d.b && dVar != d.f34227c && dVar != d.f34228d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f34217c;
    }

    public int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f34216a), Integer.valueOf(this.b), this.f34217c, this.f34218d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f34217c + ", hashType: " + this.f34218d + ", " + this.b + "-byte tags, and " + this.f34216a + "-byte key)";
    }

    public o(int i10, int i11, d dVar, c cVar) {
        this.f34216a = i10;
        this.b = i11;
        this.f34217c = dVar;
        this.f34218d = cVar;
    }
}
