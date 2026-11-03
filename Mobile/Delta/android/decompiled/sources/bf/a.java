package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4043a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4045d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f4046a;
        public c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f4047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f4048d;

        public a a() throws GeneralSecurityException {
            e eVar = this.f4046a;
            if (eVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c cVar = this.b;
            if (cVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d dVar = this.f4047c;
            if (dVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f fVar = this.f4048d;
            if (fVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (cVar == c.f4049c && dVar != d.b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (cVar == c.f4050d && dVar != d.f4053c && dVar != d.f4054d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (cVar != c.f4051e || dVar == d.f4054d) {
                return new a(eVar, cVar, dVar, fVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        public b b(c cVar) {
            this.b = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f4047c = dVar;
            return this;
        }

        public b d(e eVar) {
            this.f4046a = eVar;
            return this;
        }

        public b e(f fVar) {
            this.f4048d = fVar;
            return this;
        }

        public b() {
            this.f4046a = null;
            this.b = null;
            this.f4047c = null;
            this.f4048d = f.f4060e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f4049c = new c("NIST_P256", we.g.f34396a);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f4050d = new c("NIST_P384", we.g.b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f4051e = new c("NIST_P521", we.g.f34397c);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4052a;
        public final ECParameterSpec b;

        public c(String str, ECParameterSpec eCParameterSpec) {
            this.f4052a = str;
            this.b = eCParameterSpec;
        }

        public ECParameterSpec a() {
            return this.b;
        }

        public String toString() {
            return this.f4052a;
        }
    }

    public static final class d {
        public static final d b = new d("SHA256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f4053c = new d("SHA384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f4054d = new d("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4055a;

        public d(String str) {
            this.f4055a = str;
        }

        public String toString() {
            return this.f4055a;
        }
    }

    public static final class e {
        public static final e b = new e("IEEE_P1363");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f4056c = new e("DER");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4057a;

        public e(String str) {
            this.f4057a = str;
        }

        public String toString() {
            return this.f4057a;
        }
    }

    public static final class f {
        public static final f b = new f("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f4058c = new f("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f4059d = new f("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f4060e = new f("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4061a;

        public f(String str) {
            this.f4061a = str;
        }

        public String toString() {
            return this.f4061a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4045d != f.f4060e;
    }

    public c c() {
        return this.b;
    }

    public d d() {
        return this.f4044c;
    }

    public e e() {
        return this.f4043a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.e() == e() && aVar.c() == c() && aVar.d() == d() && aVar.f() == f();
    }

    public f f() {
        return this.f4045d;
    }

    public int hashCode() {
        return Objects.hash(a.class, this.f4043a, this.b, this.f4044c, this.f4045d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f4045d + ", hashType: " + this.f4044c + ", encoding: " + this.f4043a + ", curve: " + this.b + ")";
    }

    public a(e eVar, c cVar, d dVar, f fVar) {
        this.f4043a = eVar;
        this.b = cVar;
        this.f4044c = dVar;
        this.f4045d = fVar;
    }
}
