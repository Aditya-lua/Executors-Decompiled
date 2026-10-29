package p544xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: xe.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C12817o extends AbstractC12820r {

    /* JADX INFO: renamed from: a */
    public final int f45584a;

    /* JADX INFO: renamed from: b */
    public final int f45585b;

    /* JADX INFO: renamed from: c */
    public final d f45586c;

    /* JADX INFO: renamed from: d */
    public final c f45587d;

    /* JADX INFO: renamed from: xe.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f45588a;

        /* JADX INFO: renamed from: b */
        public Integer f45589b;

        /* JADX INFO: renamed from: c */
        public c f45590c;

        /* JADX INFO: renamed from: d */
        public d f45591d;

        /* JADX INFO: renamed from: f */
        public static void m47730f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f45592b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f45593c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f45594d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f45595e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f45596f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public C12817o m47731a() throws GeneralSecurityException {
            Integer num = this.f45588a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f45589b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f45590c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f45591d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f45588a));
            }
            m47730f(this.f45589b.intValue(), this.f45590c);
            return new C12817o(this.f45588a.intValue(), this.f45589b.intValue(), this.f45591d, this.f45590c);
        }

        /* JADX INFO: renamed from: b */
        public b m47732b(c cVar) {
            this.f45590c = cVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m47733c(int i10) {
            this.f45588a = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m47734d(int i10) {
            this.f45589b = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m47735e(d dVar) {
            this.f45591d = dVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f45588a = null;
            this.f45589b = null;
            this.f45590c = null;
            this.f45591d = d.f45601e;
        }
    }

    /* JADX INFO: renamed from: xe.o$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        public static final c f45592b = new c("SHA1");

        /* JADX INFO: renamed from: c */
        public static final c f45593c = new c("SHA224");

        /* JADX INFO: renamed from: d */
        public static final c f45594d = new c("SHA256");

        /* JADX INFO: renamed from: e */
        public static final c f45595e = new c("SHA384");

        /* JADX INFO: renamed from: f */
        public static final c f45596f = new c("SHA512");

        /* JADX INFO: renamed from: a */
        public final String f45597a;

        public c(String str) {
            this.f45597a = str;
        }

        public String toString() {
            return this.f45597a;
        }
    }

    /* JADX INFO: renamed from: xe.o$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f45598b = new d("TINK");

        /* JADX INFO: renamed from: c */
        public static final d f45599c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final d f45600d = new d("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final d f45601e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f45602a;

        public d(String str) {
            this.f45602a = str;
        }

        public String toString() {
            return this.f45602a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m47724b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f45586c != d.f45601e;
    }

    /* JADX INFO: renamed from: c */
    public int m47725c() {
        return this.f45585b;
    }

    /* JADX INFO: renamed from: d */
    public c m47726d() {
        return this.f45587d;
    }

    /* JADX INFO: renamed from: e */
    public int m47727e() {
        return this.f45584a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12817o)) {
            return false;
        }
        C12817o c12817o = (C12817o) obj;
        return c12817o.m47727e() == m47727e() && c12817o.m47728f() == m47728f() && c12817o.m47729g() == m47729g() && c12817o.m47726d() == m47726d();
    }

    /* JADX INFO: renamed from: f */
    public int m47728f() {
        d dVar = this.f45586c;
        if (dVar == d.f45601e) {
            return m47725c();
        }
        if (dVar != d.f45598b && dVar != d.f45599c && dVar != d.f45600d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iM47725c = m47725c();
        return iM47725c + 5;
    }

    /* JADX INFO: renamed from: g */
    public d m47729g() {
        return this.f45586c;
    }

    public int hashCode() {
        return Objects.hash(C12817o.class, Integer.valueOf(this.f45584a), Integer.valueOf(this.f45585b), this.f45586c, this.f45587d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f45586c + ", hashType: " + this.f45587d + ", " + this.f45585b + "-byte tags, and " + this.f45584a + "-byte key)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12817o(int i10, int i11, d dVar, c cVar) {
        this.f45584a = i10;
        this.f45585b = i11;
        this.f45586c = dVar;
        this.f45587d = cVar;
    }
}
