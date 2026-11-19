package df;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12241a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f12242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12243d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f12244a;
        public c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f12245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f12246d;

        public a a() throws GeneralSecurityException {
            e eVar = this.f12244a;
            if (eVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c cVar = this.b;
            if (cVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d dVar = this.f12245c;
            if (dVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f fVar = this.f12246d;
            if (fVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (cVar == c.f12247c && dVar != d.b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (cVar == c.f12248d && dVar != d.f12251c && dVar != d.f12252d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (cVar != c.f12249e || dVar == d.f12252d) {
                return new a(eVar, cVar, dVar, fVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        public b b(c cVar) {
            this.b = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f12245c = dVar;
            return this;
        }

        public b d(e eVar) {
            this.f12244a = eVar;
            return this;
        }

        public b e(f fVar) {
            this.f12246d = fVar;
            return this;
        }

        public b() {
            this.f12244a = null;
            this.b = null;
            this.f12245c = null;
            this.f12246d = f.f12258e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12247c = new c("NIST_P256", ye.g.f37753a);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f12248d = new c("NIST_P384", ye.g.b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f12249e = new c("NIST_P521", ye.g.f37754c);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12250a;
        public final ECParameterSpec b;

        public c(String str, ECParameterSpec eCParameterSpec) {
            this.f12250a = str;
            this.b = eCParameterSpec;
        }

        public ECParameterSpec a() {
            return this.b;
        }

        public String toString() {
            return this.f12250a;
        }
    }

    public static final class d {
        public static final d b = new d("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f12251c = new d("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f12252d = new d("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12253a;

        public d(String str) {
            this.f12253a = str;
        }

        public String toString() {
            return this.f12253a;
        }
    }

    public static final class e {
        public static final e b = new e("IEEE_P1363");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f12254c = new e("DER");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12255a;

        public e(String str) {
            this.f12255a = str;
        }

        public String toString() {
            return this.f12255a;
        }
    }

    public static final class f {
        public static final f b = new f("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f12256c = new f("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f12257d = new f("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f12258e = new f("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12259a;

        public f(String str) {
            this.f12259a = str;
        }

        public String toString() {
            return this.f12259a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // re.x
    public boolean a() {
        return this.f12243d != f.f12258e;
    }

    public c c() {
        return this.b;
    }

    public d d() {
        return this.f12242c;
    }

    public e e() {
        return this.f12241a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.e() == e() && aVar.c() == c() && aVar.d() == d() && aVar.f() == f();
    }

    public f f() {
        return this.f12243d;
    }

    public int hashCode() {
        return Objects.hash(a.class, this.f12241a, this.b, this.f12242c, this.f12243d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f12243d + ", hashType: " + this.f12242c + ", encoding: " + this.f12241a + ", curve: " + this.b + ")";
    }

    public a(e eVar, c cVar, d dVar, f fVar) {
        this.f12241a = eVar;
        this.b = cVar;
        this.f12242c = dVar;
        this.f12243d = fVar;
    }
}
