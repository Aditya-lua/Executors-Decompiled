package af;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f371a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f373d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f374a;
        public c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f376d;

        public a a() throws GeneralSecurityException {
            e eVar = this.f374a;
            if (eVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c cVar = this.b;
            if (cVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d dVar = this.f375c;
            if (dVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f fVar = this.f376d;
            if (fVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (cVar == c.f377c && dVar != d.b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (cVar == c.f378d && dVar != d.f381c && dVar != d.f382d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (cVar != c.f379e || dVar == d.f382d) {
                return new a(eVar, cVar, dVar, fVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        public b b(c cVar) {
            this.b = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f375c = dVar;
            return this;
        }

        public b d(e eVar) {
            this.f374a = eVar;
            return this;
        }

        public b e(f fVar) {
            this.f376d = fVar;
            return this;
        }

        public b() {
            this.f374a = null;
            this.b = null;
            this.f375c = null;
            this.f376d = f.f388e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f377c = new c("NIST_P256", ve.g.f32942a);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f378d = new c("NIST_P384", ve.g.b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f379e = new c("NIST_P521", ve.g.f32943c);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f380a;
        public final ECParameterSpec b;

        public c(String str, ECParameterSpec eCParameterSpec) {
            this.f380a = str;
            this.b = eCParameterSpec;
        }

        public ECParameterSpec a() {
            return this.b;
        }

        public String toString() {
            return this.f380a;
        }
    }

    public static final class d {
        public static final d b = new d("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f381c = new d("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f382d = new d("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f383a;

        public d(String str) {
            this.f383a = str;
        }

        public String toString() {
            return this.f383a;
        }
    }

    public static final class e {
        public static final e b = new e("IEEE_P1363");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f384c = new e("DER");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f385a;

        public e(String str) {
            this.f385a = str;
        }

        public String toString() {
            return this.f385a;
        }
    }

    public static final class f {
        public static final f b = new f("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f386c = new f("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f387d = new f("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f388e = new f("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f389a;

        public f(String str) {
            this.f389a = str;
        }

        public String toString() {
            return this.f389a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // oe.x
    public boolean a() {
        return this.f373d != f.f388e;
    }

    public c c() {
        return this.b;
    }

    public d d() {
        return this.f372c;
    }

    public e e() {
        return this.f371a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.e() == e() && aVar.c() == c() && aVar.d() == d() && aVar.f() == f();
    }

    public f f() {
        return this.f373d;
    }

    public int hashCode() {
        return Objects.hash(a.class, this.f371a, this.b, this.f372c, this.f373d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f373d + ", hashType: " + this.f372c + ", encoding: " + this.f371a + ", curve: " + this.b + ")";
    }

    public a(e eVar, c cVar, d dVar, f fVar) {
        this.f371a = eVar;
        this.b = cVar;
        this.f372c = dVar;
        this.f373d = fVar;
    }
}
