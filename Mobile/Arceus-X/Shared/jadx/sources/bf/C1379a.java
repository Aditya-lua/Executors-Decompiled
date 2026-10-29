package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;
import p515we.C12369g;

/* JADX INFO: renamed from: bf.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1379a extends AbstractC1381a1 {

    /* JADX INFO: renamed from: a */
    public final e f5416a;

    /* JADX INFO: renamed from: b */
    public final c f5417b;

    /* JADX INFO: renamed from: c */
    public final d f5418c;

    /* JADX INFO: renamed from: d */
    public final f f5419d;

    /* JADX INFO: renamed from: bf.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public e f5420a;

        /* JADX INFO: renamed from: b */
        public c f5421b;

        /* JADX INFO: renamed from: c */
        public d f5422c;

        /* JADX INFO: renamed from: d */
        public f f5423d;

        /* JADX INFO: renamed from: a */
        public C1379a m7235a() throws GeneralSecurityException {
            e eVar = this.f5420a;
            if (eVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c cVar = this.f5421b;
            if (cVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d dVar = this.f5422c;
            if (dVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f fVar = this.f5423d;
            if (fVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (cVar == c.f5424c && dVar != d.f5429b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (cVar == c.f5425d && dVar != d.f5430c && dVar != d.f5431d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (cVar != c.f5426e || dVar == d.f5431d) {
                return new C1379a(eVar, cVar, dVar, fVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        /* JADX INFO: renamed from: b */
        public b m7236b(c cVar) {
            this.f5421b = cVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7237c(d dVar) {
            this.f5422c = dVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7238d(e eVar) {
            this.f5420a = eVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7239e(f fVar) {
            this.f5423d = fVar;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f5420a = null;
            this.f5421b = null;
            this.f5422c = null;
            this.f5423d = f.f5439e;
        }
    }

    /* JADX INFO: renamed from: bf.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f5424c = new c("NIST_P256", C12369g.f44250a);

        /* JADX INFO: renamed from: d */
        public static final c f5425d = new c("NIST_P384", C12369g.f44251b);

        /* JADX INFO: renamed from: e */
        public static final c f5426e = new c("NIST_P521", C12369g.f44252c);

        /* JADX INFO: renamed from: a */
        public final String f5427a;

        /* JADX INFO: renamed from: b */
        public final ECParameterSpec f5428b;

        public c(String str, ECParameterSpec eCParameterSpec) {
            this.f5427a = str;
            this.f5428b = eCParameterSpec;
        }

        /* JADX INFO: renamed from: a */
        public ECParameterSpec m7240a() {
            return this.f5428b;
        }

        public String toString() {
            return this.f5427a;
        }
    }

    /* JADX INFO: renamed from: bf.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f5429b = new d("SHA256");

        /* JADX INFO: renamed from: c */
        public static final d f5430c = new d("SHA384");

        /* JADX INFO: renamed from: d */
        public static final d f5431d = new d("SHA512");

        /* JADX INFO: renamed from: a */
        public final String f5432a;

        public d(String str) {
            this.f5432a = str;
        }

        public String toString() {
            return this.f5432a;
        }
    }

    /* JADX INFO: renamed from: bf.a$e */
    public static final class e {

        /* JADX INFO: renamed from: b */
        public static final e f5433b = new e("IEEE_P1363");

        /* JADX INFO: renamed from: c */
        public static final e f5434c = new e("DER");

        /* JADX INFO: renamed from: a */
        public final String f5435a;

        public e(String str) {
            this.f5435a = str;
        }

        public String toString() {
            return this.f5435a;
        }
    }

    /* JADX INFO: renamed from: bf.a$f */
    public static final class f {

        /* JADX INFO: renamed from: b */
        public static final f f5436b = new f("TINK");

        /* JADX INFO: renamed from: c */
        public static final f f5437c = new f("CRUNCHY");

        /* JADX INFO: renamed from: d */
        public static final f f5438d = new f("LEGACY");

        /* JADX INFO: renamed from: e */
        public static final f f5439e = new f("NO_PREFIX");

        /* JADX INFO: renamed from: a */
        public final String f5440a;

        public f(String str) {
            this.f5440a = str;
        }

        public String toString() {
            return this.f5440a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m7229b() {
        return new b();
    }

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f5419d != f.f5439e;
    }

    /* JADX INFO: renamed from: c */
    public c m7231c() {
        return this.f5417b;
    }

    /* JADX INFO: renamed from: d */
    public d m7232d() {
        return this.f5418c;
    }

    /* JADX INFO: renamed from: e */
    public e m7233e() {
        return this.f5416a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1379a)) {
            return false;
        }
        C1379a c1379a = (C1379a) obj;
        return c1379a.m7233e() == m7233e() && c1379a.m7231c() == m7231c() && c1379a.m7232d() == m7232d() && c1379a.m7234f() == m7234f();
    }

    /* JADX INFO: renamed from: f */
    public f m7234f() {
        return this.f5419d;
    }

    public int hashCode() {
        return Objects.hash(C1379a.class, this.f5416a, this.f5417b, this.f5418c, this.f5419d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f5419d + ", hashType: " + this.f5418c + ", encoding: " + this.f5416a + ", curve: " + this.f5417b + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1379a(e eVar, c cVar, d dVar, f fVar) {
        this.f5416a = eVar;
        this.f5417b = cVar;
        this.f5418c = dVar;
        this.f5419d = fVar;
    }
}
